package FiveExtra;

public class Gerente extends Employee{
    private final String funciones = "Dar ordenes, mantener la integridad de la tienda";
    private int empleadosACargo = 6;


    public Gerente(String name) {
        super(name);
    }

    public String getFunciones() {
        return funciones;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(int empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "Funciones: " + getFunciones() + "\n" + getEmpleadosACargo() + " empleados a cargo\n";
    }
}
