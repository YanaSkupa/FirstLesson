package ZooApp;

public class Elephant extends Animal implements ZooAnimal {
    int trunkLength;

    public Elephant(String name, int trunkLength) {
        super(name);
        this.trunkLength = trunkLength;
    }

    @Override
    public void voice() {
        System.out.println(name +"."+" Які звуки видає?: " + "Трубить хоботком");
    }

    @Override
    public void play() {
        System.out.println(name +"."+" Чим займається?: " + " Купається у ставочку");
    }
}
