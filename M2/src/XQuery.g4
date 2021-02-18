grammar XQuery;
import XPath;

var : '$' NAME
    ;
xq
    : var                          # XQValue
    | absolutePath                           # XQAbsolutePath
    | STRINGCONSTANT               # StringConstant
    | '(' xq ')'                   # XQinParenthesis
    | xq ',' xq                    # XQComma
    | xq '/' relativePath                    # XQChild
    | xq '//' relativePath                   # XQDescendent
    | '<' NAME '>' '{' xq '}' '</' NAME '>'   # XQNodeConstructor
    | forClause? letClause? whereClause? returnClause  # XQClauses
    | letClause xq                 # XQLet
    ;

forClause
    : 'for' var 'in' xq(',' var 'in' xq)*
    ;

letClause
    : 'let' var ':=' xq(',' var ':=' xq)*
    ;

whereClause
    : 'where' cond
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

returnClause
    : 'return' xq
    ;

STRINGCONSTANT: '"' [a-zA-Z0-9_,.;:'"?!@#$%^&*` \t\r\n-]* '"';
