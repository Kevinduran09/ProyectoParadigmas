package org.example;
import java_cup.runtime.Symbol;
import cup.sym;
/* Definición del analizador léxico para el lenguaje */
%%
%class Lexico
%unicode
%cup
%public
%line
%char
%ignorecase
%init{
   yyline = 1;
   yychar = 1;
%init}

/* reglas */
NUMERO  = [0-9]+
DECIMAL=[0-9]+("."[  |0-9]+)
ID =[a-zA-Z][a-zA-Z0-9]*
CARACTER            =   [\']([^\t\'\"\n]|(\\\")|(\\n)|(\\\')|(\\t))?[\']
BLANCOS=[ \r\t]+
CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]

%%
/* Palabras clave */
"imprimir"  { return new Symbol(sym.IMPRIMIR,yyline,yychar, yytext()); }
"leer"      { return new Symbol(sym.LEER,yyline,yychar, yytext()); }
"si"        { return new Symbol(sym.SI,yyline,yychar, yytext()); }
"entonces"  { return new Symbol(sym.ENTONCES,yyline,yychar, yytext()); }
"sino"      {return new Symbol(sym.SINO,yyline,yychar, yytext());}
"="   { return new Symbol(sym.ASIGNACION,yyline,yychar, yytext()); }
"definir" { return new Symbol(sym.DEFINIR,yyline,yychar, yytext()); }
/*FUNCIONES PROPIAS*/
"largo"             { return new Symbol(sym.LARGO); }
"abs"               { return new Symbol(sym.ABS); }
"potencia"          { return new Symbol(sym.POTENCIA); }
"raiz"              { return new Symbol(sym.RAIZ); }
"minimo"           { return new Symbol(sym.MINIMO); }
"maximo"        { return new Symbol(sym.MAXIMO); }

/* Operadores aritméticos */
"+"         { return new Symbol(sym.SUMA,yyline,yychar, yytext()); }
"-"         { return new Symbol(sym.RESTA,yyline,yychar, yytext()); }
"*"         { return new Symbol(sym.MULTIPLICACION,yyline,yychar, yytext()); }
"/"         { return new Symbol(sym.DIVISION,yyline,yychar, yytext()); }
","         { return new Symbol(sym.COMA,yyline,yychar, yytext()); }
/* Operadores de comparación */
">"         { return new Symbol(sym.MAYOR,yyline,yychar, yytext()); }
"<"         { return new Symbol(sym.MENOR,yyline,yychar, yytext()); }
">="        { return new Symbol(sym.MAYOR_IGUAL,yyline,yychar, yytext()); }
"<="        { return new Symbol(sym.MENOR_IGUAL,yyline,yychar, yytext()); }

/* Delimitadores */
";"         { return new Symbol(sym.PUNTOCOMA,yyline,yychar, yytext()); }
"("         { return new Symbol(sym.PARENTESIS_ABRE,yyline,yychar, yytext()); }
")"         { return new Symbol(sym.PARENTESIS_CIERRA,yyline,yychar, yytext()); }
"{" {return new Symbol(sym.LLAVIZQ,yyline,yychar, yytext());}
"}" {return new Symbol(sym.LLAVDER,yyline,yychar, yytext());}
\n { yyline++; yychar = 1; } // Incrementar línea y reiniciar el contador de caracteres
.  { yychar++; } // Incrementar el contador de caracteres para cualquier otro carácter

{BLANCOS} {}
{CARACTER}  {return new Symbol(sym.CARACTER,yyline,yychar, yytext());}
{ID}        {return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
{NUMERO}         {return new Symbol(sym.ENTERO,yyline,yychar, yytext());}
{DECIMAL}        {return new Symbol(sym.DECIMAL,yyline,yychar, yytext());}
{CADENACOMILLASDOBLES} {return new Symbol(sym.CADENA,yyline,yychar, (yytext()).substring(1,yytext().length()-1));}

. {
    System.err.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
}