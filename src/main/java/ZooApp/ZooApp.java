package ZooApp;


import java.util.ArrayList;
import java.util.List;

public class ZooApp {
        public static void main(String[] args) {
        Lion lion = new Lion("Лев Сімба", 12);
        Elephant elephant = new Elephant("Поважний Слон", 250);
        Penguin penguin = new Penguin("Пінгвін Чічі", false);

        ZooVisitor visitor = new ZooVisitor("Аніта","Студент", "+380111111");
        List<ZooVisitor> visitorRecords = new ArrayList<>();
        visitorRecords.add(visitor);

        lion.voice();
        lion.play();
        visitor.addUniqueParameter(lion.name + ": Дальність зору " + lion.maneLength + " м");

        elephant.voice();
        elephant.play();
        visitor.addUniqueParameter(elephant.name + ": Хобот " + elephant.trunkLength + " см");

        penguin.voice();
        penguin.play();
        visitor.addUniqueParameter(penguin.name + ": Може летіти? " + penguin.canFly);

        visitorRecords.forEach(ZooVisitor::printVisitorRecord);

    }

}

