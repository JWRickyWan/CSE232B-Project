grammar XQuery;
absolutePath:
      doc '/' relativePath  #absolutePathChild
      |doc '//' relativePath  #DescendentAbsolutePath
      ;
doc: 'doc("' filename '")'
    |'document("'filename'")';
filename:NAME('.' NAME)?;
relativePath:
             tagName       #tag
             |'*'         #all
             |'.'         #self
             |'..'          #parentDirectory
             |TEXTFUNC       #textFunction
            // |QUOTE NAME QUOTE #text
             |'@' attName     #attribute
             |relativePath','relativePath   #sequenceOfPaths
             |'('relativePath')' #pathInParenthesis
             |relativePath '/' relativePath #relativePathChildren
             |relativePath '//' relativePath #selfOrdescendentPath
             |relativePath'['pathFilter']'  #pathWithFilter
             ;
pathFilter:
            relativePath     #relativePathFilter
           |relativePath EQUAL relativePath  #pathValueEqual
           |relativePath EQUAL QUOTE NAME QUOTE #pathTextEqual
           |relativePath IDEQUAL relativePath    #pathIdEqual
           |'('pathFilter')'     #firstFilter
           |pathFilter 'and' pathFilter   #andpathFilter
           |pathFilter 'or' pathFilter      #orpathFilter
           |NOT pathFilter       #notFilter
           ;
xq
    : var                          # XQValue
    | STRINGCONSTANT               # StringConstant
    | absolutePath                           # XQAbsolutePath
    | '(' xq ')'                   # XQinParenthesis
    | xq '/' relativePath                    # XQChild
    | xq ',' xq                    # XQComma
    | xq '//' relativePath                   # XQDescendent
    | '<' NAME '>' '{' xq '}' '</' NAME '>'   # XQNodeConstructor
    | forClause? letClause? whereClause? returnClause  # XQClauses
    | letClause xq                 # XQLet
    | joinClause # XQJoin
    ;
var : '$' NAME;
forClause
    : 'for' var 'in' xq(',' var 'in' xq)*
    ;

letClause
    : 'let' var ':=' xq(',' var ':=' xq)*
    ;
joinClause:'join' '(' xq ',' xq ',' attributePair ',' attributePair ')';
whereClause
    : 'where' cond
    ;
returnClause
    : 'return' xq
    ;
cond
    : xq EQUAL xq                     # XQEqual
    | xq IDEQUAL xq                    # XQIs
    | 'empty' '(' xq ')'            # XQEmpty
    | 'some' var 'in' xq(',' var 'in' xq)* 'satisfies' cond  # XQSatisfy
    | '(' cond ')'                  # CondInParenthesis
    | cond 'and' cond               # CondAnd
    | cond 'or' cond                # CondOr
    | 'not' cond                    # CondNot
    ;

tagName:NAME;
attName:NAME;
NOT: 'not';
EQUAL: '='|'eq';
IDEQUAL:'=='|'is';
TEXTFUNC:'text()';
QUOTE:'"'|'“'|'”';
NAME: [a-zA-Z0-9_-]+;
WS: [ \t\r\n]+ -> skip;
STRINGCONSTANT: '"' [a-zA-Z0-9_,.;:'"?!@#$%^&*` \t\r\n-]* '"';
attributePair:'[' NAME(',' NAME)* ']';
