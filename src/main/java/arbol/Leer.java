package arbol;

import java.util.Scanner;

public class Leer implements Instruccion {
    private String identificador;

    public Leer(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public Object ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese valor para " + identificador + ": ");
        int valor = sc.nextInt();
        // Almacenar el valor en una tabla de símbolos o en algún contenedor de variables
        TablaSimbolos.asignar(identificador, valor);
        return null;
    }
}
