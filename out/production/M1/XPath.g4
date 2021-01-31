grammar XPath;
NAME: [a-zA-Z0-9_-]+;
FILE:NAME;
doc: 'doc' '(' '"' filename '"' ')';
filename:NAME('.' NAME)?;
absolutePath:
      doc SLASH relativePath EOF #absolutePathChild
      |doc DOUBLESLASH relativePath EOF #DescendentAbsolutePath
      ;


relativePath:
             NAME        #tag
             |ASTRID         #all
             |DOT            #self
             |DDOT           #parentDirectory
             |TEXTFUNC       #textFunction
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
NOT: 'not';
EQUAL: '='|'eq';
IDEQUAL:'=='|'is';
WS: [ \t\r\n]+ -> skip;