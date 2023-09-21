package ZooApp;

public class Penguin extends Animal implements ZooAnimal {
    boolean canFly;

    public Penguin(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void voice() {
        System.out.println(name +"."+" Які звуки видає?: " + "Вокалізує");
    }

    @Override
    public void play() {
        System.out.println(name +"."+" Чим займається?: " + " Котуситься на животику");
    }
}
