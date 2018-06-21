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

arrayDec : varType varNameTok squareOpenBracketTok squareCloseBracketTok
        (squareOpenBracketTok squareCloseBracketTok)*
        ( equalMarkTok value)?;


arrayVal : varNameTok squareOpenBracketTok integerTok squareCloseBracketTok
        ((squareOpenBracketTok integerTok squareCloseBracketTok)*);

varType :
    integerTypeTok
    | floatTypeTok
    |stringTypeTok
    |booleanTypeTok;




value:
    value mathOperatorTok value
    | openBracketTok value closeBracketTok
    | variableType
    | arrayVal
    | varNameTok;


variableType:
    integerTok
    | floatTok
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
floatTok : Float;
stringTok : String;
booleanTok: Boolean;
booleanOperatorTok : BooleanOperator;

integerTypeTok : IntegerType;
floatTypeTok : FloatType;
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

Float : Integer Dot Integer;

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
FloatType: 'float';
StringType: 'string';
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

