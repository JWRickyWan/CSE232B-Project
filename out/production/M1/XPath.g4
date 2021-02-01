grammar XPath;
NOT: 'not';
EQUAL: '='|'eq';
IDEQUAL:'=='|'is';
NAME: [a-zA-Z0-9_-]+;
FILE:NAME;
doc: ('doc'|'document') '(' QUOTE filename QUOTE ')';
filename:NAME('.' NAME)?;
absolutePath:
      doc SLASH relativePath  #absolutePathChild
      |doc DOUBLESLASH relativePath  #DescendentAbsolutePath
      ;

relativePath:
             NAME       #tag
             |ASTRID         #all
             |DOT           #self
             |DDOT           #parentDirectory
             |TEXTFUNC       #textFunction
            // |QUOTE NAME QUOTE #text
             |'@'NAME     #attribute
             |'('relativePath')' #pathInParenthesis
             |relativePath SLASH relativePath #relativePathChildren
             |relativePath DOUBLESLASH relativePath #selfOrdescendentPath
             |relativePath'['pathFilter']'  #pathWithFilter
             |relativePath','relativePath   #sequenceOfPaths
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
SLASH:'/';
DOUBLESLASH: '//';
ASTRID:'*';
DOT:'.';
DDOT:'..';
TEXTFUNC:'text()';
WS: [ \t\r\n]+ -> skip;
QUOTE:'"'|'“'|'”';