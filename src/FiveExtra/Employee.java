package FiveExtra;

public class Employee {
    private String name;
    private static int id = 1;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id++;
    }

    public static void setId(int id) {
        Employee.id = id;
    }


    public String getInfo(){
        return "id: " + getId() + "\n" + getName();
    }
}
