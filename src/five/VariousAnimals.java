package five;

public class VariousAnimals extends Animal{
    public VariousAnimals(String name, String sound) {
        super(name, sound);
    }



    @Override
    public void emitirSonido() {
        System.out.println("El " +super.name + "hace " + super.sound);
    }
}
