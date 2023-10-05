grammar Arithmetic;

start : statementList;

statementList: statement+;

statement: assign | expr;

assign: VARIABLE '=' expr;

expr: expr op=('*' | '/') expr  #Mult
    | expr op=('+' | '-') expr  #Add
    | '(' expr ')'              #Paren
    | NUMBER                    #NUMBER
    | VARIABLE                  #VARIABLE
    ;

NUMBER: '-'? DIGIT+ ('.' DIGIT+)?;
VARIABLE: [a-zA-Z]+;

fragment DIGIT: [0-9];
fragment NEWLINE: [\r\n]+;
IGNORED: NEWLINE -> skip;
WS: [ \t\r\n]+ -> skip;