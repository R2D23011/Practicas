package FiveExtra;

import java.util.ArrayList;

public class Employees {
    public static void showEmployeesInfo(){

        ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
        gerentes.add(new Gerente("Carlos Acevedo"));
        gerentes.add(new Gerente("Luis Alvarado"));

        ArrayList<GerentedeProyectos> gerentedeProyectos = new ArrayList<GerentedeProyectos>();
        gerentedeProyectos.add(new GerentedeProyectos("Maria Machado"));
        gerentedeProyectos.add(new GerentedeProyectos("Vidal Martinez"));

        ArrayList<Programadores> programadores = new ArrayList<Programadores>();
        programadores.add(new Programadores("Pepito Perez"));
        programadores.add(new Programadores("Ramon Rosales"));

        int Last = gerentes.size() + programadores.size() + gerentedeProyectos.size() + (-1);

        for (Gerente g: gerentes){
            System.out.println(g.getInfo());
        }

        for (GerentedeProyectos g: gerentedeProyectos){
            System.out.println(g.getInfo());
        }

        for (Programadores p:programadores){
            System.out.println(p.getInfo());
        }
    }
}
