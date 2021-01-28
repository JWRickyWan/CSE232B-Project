grammar XPath;
NAME: '[a-zA-Z0-9]+';
FILE:[a-zA-Z0-9_]+'.xml';
absolutePath:
      doc SLASH relativePath #absolutePathChild
      |doc DOUBLESLASH relativePath #DescendentAbsolutePath
      ;
SLASH:'/';
DOUBLESLASH: '//';

doc: 'doc("'FILE'")';

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
ASTRID:'*';
DOT:'.';
DDOT:'..';
TEXTFUNC:'text()';

pathFilter:
            relativePath     #relativePathFilter
           |relativePath EQUAL relativePath  #pathValueEqual
           |relativePath IDEQUAL relativePath    #pathIdEqual
           |'('pathFilter')'     #firstFilter
           |pathFilter 'and' pathFilter   #andpathFilter
           |pathFilter 'or' pathFilter      #orpathFilter
           |NOT pathFilter       #notFilter
           ;
NOT: 'not';
EQUAL: '='|'eq';
IDEQUAL:'=='|'is';
