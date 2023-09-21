package ZooApp;

public class Lion extends Animal implements ZooAnimal {
    int maneLength;

    public Lion(String name, int maneLength) {
        super(name);
        this.maneLength = maneLength;
    }

    @Override
    public void voice() {
        System.out.println(name +"."+" Які звуки видає?: " + "Гарчить");
    }

    @Override
    public void play() {
        System.out.println(name +"."+" Чим займається?: " + "Грається з львицею");
    }
}


