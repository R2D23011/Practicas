package five;

public class Perro extends Animal {
    public Perro(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro " + super.name + "hace: " + super.sound);;
    }
}
