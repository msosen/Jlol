/**
 * Define a grammar called Hello
 */
 /**
  * Parser Rules
  */
grammar myGrammar;
/**
 * Lexer Rules
 */
// konsultacje wtorek /// od 17:30-19 po 19
// ewentualnie poniedzialek -


startq : instructionsBlock+ EOF;

instructionsBlock :
    declaration
    | ifStatement
    | assignment;

declaration : (variableDec | arrayDec) xdTok;

variableDec : varType varNameTok
        ( equalMarkTok value)?;

stringDec: stringTypeTok varNameTok (equalMarkTok stringTok);

arrayDec : varType varNameTok squareOpenBracketTok squareCloseBracketTok
        (squareOpenBracketTok squareCloseBracketTok)*
        ( equalMarkTok value)?;


arrayVal : varNameTok squareOpenBracketTok integerTok squareCloseBracketTok
        ((squareOpenBracketTok integerTok squareCloseBracketTok)*);

varType :
    integerTypeTok
    | doubleTypeTok
    | stringTypeTok
    |booleanTypeTok;




value:
    value mathOperatorTok value
    | openBracketTok value closeBracketTok
    | variableType
    | arrayVal
    | varNameTok;


variableType:
    integerTok
    | doubleTok
    | stringTok;



ifStatement : ifTok openBracketTok logicalStatement closeBracketTok thenTok blockOpenBracketTok
            instructionsBlock blockCloseBracketTok
            ((elsifTok openBracketTok logicalStatement closeBracketTok instructionsBlock)*
             elseTok instructionsBlock)?;

logicalStatement:
    value booleanOperatorTok value     #logicalStatementBooleanExpr
    | booleanTok                       #logicalStatementBoolean;


assignment : (declaration | varNameTok) equalMarkTok value xdTok;



equalMarkTok : EqualMark;
varNameTok : VarName;
squareOpenBracketTok : SquareOpenBracket;
squareCloseBracketTok : SquareCloseBracket;
openBracketTok : OpenBracket;
closeBracketTok : CloseBracket;
blockCloseBracketTok : BlockCloseBracket;
blockOpenBracketTok : BlockOpenBracket;

mathOperatorTok : MathOperator;
integerTok : Integer;
doubleTok : Double;
stringTok : String;
booleanTok: Boolean;
booleanOperatorTok : BooleanOperator;

integerTypeTok : IntegerType;
doubleTypeTok : DoubleType;
stringTypeTok : StringType;
booleanTypeTok : BooleanType;

ifTok : If;
elsifTok: Elsif;
elseTok: Else;
thenTok: Then;
xdTok: XD;


fragment Digit : [0-9];
fragment Char : [a-z] ;             // match lower-case identifiers
fragment CharSequence : Char+;


XD : 'XD';
BlockOpenBracket: '{';
BlockCloseBracket: '}';

Integer : Digit+;

Double : Integer Dot Integer;

String : QuoteMark CharSequence QuoteMark;

MathOperator : '+' | '-' | '*' | '/';
BooleanOperator : '<'|'<='|'>'|'>='|'=='|'!=';
LogicalOperator : 'and' | 'or';
Boolean : 'true' 'false';
If : 'if';
Elsif: 'elsif';
Else: 'else';
Then: 'then';
IntegerType: 'int';
DoubleType: 'double';
StringType: 'String';
BooleanType : 'boolean';
VarName : Char (Char | Digit)*;
EqualMark : '=' ;
Dot : '.';
QuoteMark : '"';
Semicolon :';';
OpenBracket : '(';
CloseBracket : ')';
SquareOpenBracket : '[';
SquareCloseBracket : ']';

Text : (Char)* ;
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

