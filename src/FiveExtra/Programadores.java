package FiveExtra;

public class Programadores extends Employee {
    private final String funciones = "Programar adecuadamente siguiendo los parametros";

    public Programadores(String name) {
        super(name);
    }

    public String getFunciones() {
        return funciones;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nFunciones: " + getFunciones() + "\nSin empleados a cargo\n" ;
    }
}
