package arbol;

public class OperacionLargo extends Operacion {

    public OperacionLargo(Operacion operacion) {
        super(operacion, Tipo.CADENA);  // Llama al constructor de Operacion con el tipo correcto
    }

    @Override
    public Object ejecutar() {
        String cadena = izquierda.ejecutar().toString();  // Asume que operacion retorna una cadena
        return cadena.length();
    }
}
