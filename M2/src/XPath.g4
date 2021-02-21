grammar XPath;

absolutePath:
      doc '/' relativePath  #absolutePathChild
      |doc '//' relativePath  #DescendentAbsolutePath
      ;
doc: 'doc(' QUOTE filename QUOTE ')'
    |'document(' QUOTE filename QUOTE ')';

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
tagName:NAME;
attName:NAME;
NOT: 'not';
EQUAL: '='|'eq';
IDEQUAL:'=='|'is';
filename:NAME('.' NAME)?;
TEXTFUNC:'text()';
QUOTE:'"'|'“'|'”';
NAME: [a-zA-Z0-9_-]+;
WS: [ \t\r\n]+ -> skip;
