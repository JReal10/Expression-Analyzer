grammar Simple;

program   : 'begin' statement+ 'end';

statement : assign | add | print ;

assign    :  VAR '=' (NUM | VAR) ;
print     : 'print' '(' (NUM | VAR) ')' ;
add       :  VAR ('+=' | '+') (NUM | VAR)  ;

VAR     : [a-zA-Z]+ ;
NUM     : ('-')?[0-9]+ ;
WS      : [ \t\r\n]+ -> skip;