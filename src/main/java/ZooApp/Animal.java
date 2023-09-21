package ZooApp;


public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public String toString() {
        return "Тварина: " + name;
    }

}
interface ZooAnimal {
    void voice();
    void play();
}