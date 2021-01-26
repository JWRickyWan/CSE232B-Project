grammar XPath;
NAME: '[a-zA-Z0-9]+';
FILE:[a-zA-Z0-9_]+'.xml';
absolutePath:
      doc SLASH relativePath #absolutePathChild
      |doc DOUBLESLASH relativePath #DescendentAbsolutePath
      ;
SLASH:'/';
DOUBLESLASH: '//';

doc: 'doc("'filename'")';
filename:FILE;

relativePath:
             tagName        #tag
             |ASTRID         #all
             |DOT            #self
             |DDOT           #parentDirectory
             |TEXTFUNC       #textFunction
             |'@'attName     #attribute
             |'('relativePath')' #PathInParenthesis
             |relativePath SLASH relativePath #self
             |DOUBLESLASH relativePath #selfOrdescendentPath
             |relativePath'['pathFilter']'  #pathWithFilter
             |relativePath','relativePath   #SequenceOfPaths
             ;
ASTRID:'*';
DOT:'.';
DDOT:'..';
TEXTFUNC:'text()';
attName:NAME;
tagName:NAME;

pathFilter:relativePath
           relativePath EQUAL relativePath  #PathValueEqual
           |relativePath IDEQUAL relativePath    #PathIdEqual
           |'('pathFilter')'     #firstFilter
           |pathFilter 'and' pathFilter   #andpathFilter
           |pathFilter 'or' pathFilter      #orpathFilter
           |NOT pathFilter       #NotFilter
           ;
NOT: 'not';
EQUAL: '='|'eq';
IDEQUAL:'=='|'is';
