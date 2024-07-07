package five;

public class Gato extends Animal {

    public Gato(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El " + super.name + " dice " + this.sound);
    }
}
