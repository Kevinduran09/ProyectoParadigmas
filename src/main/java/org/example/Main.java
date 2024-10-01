package org.example;
import cup.parser;
import cup.sym;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
//
// .
import java_cup.runtime.*;
import arbol.Instruccion;

import java.io.StringReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Instruccion> AST_arbolSintaxisAbstracta=null;
        try {

            String codigoFuente =
                    "x=3;" +
                            "imprimir(x);"; // Agregar la instrucción FINALIZAR al final del código

//            System.out.println(codigoFuente);
            // Crear un StringReader para leer la cadena directamente
            StringReader reader = new StringReader(codigoFuente);

            // Crear una instancia del lexer y parser usando el StringReader
            Lexico lexico = new Lexico(reader);


//            procesarTokens(lexico);

            parser parser = new parser(lexico);

            // Ejecutar el parser
            Symbol resultado = parser.parse();

            // Si el resultado es una lista de instrucciones, ejecutarlas
            AST_arbolSintaxisAbstracta=parser.getAST();
            for (Instruccion instruccion : AST_arbolSintaxisAbstracta) {
                instruccion.ejecutar();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}