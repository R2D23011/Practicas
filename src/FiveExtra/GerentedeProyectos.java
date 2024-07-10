package FiveExtra;

public class GerentedeProyectos extends Employee{
    private final String funciones = "Organizar proyectos";
    private int empleadosACargo = 3;

    public GerentedeProyectos(String name) {
        super(name);
    }

    public String getFunciones() {
        return funciones;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nFunciones: " + getFunciones() +"\n"+getEmpleadosACargo() + " empleados a cargo\n" ;
    }
}
