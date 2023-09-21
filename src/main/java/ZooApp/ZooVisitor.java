package ZooApp;

import java.util.ArrayList;
import java.util.List;

public class ZooVisitor {
    private final List<String> visitorRecord = new ArrayList<>();
    private final String name;
    private final String ticketType;
    private final String phoneNumber;

    public ZooVisitor(String name, String ticketType, String phoneNumber) {
        this.name = name;
        this.ticketType = ticketType;
        this.phoneNumber = phoneNumber;
    }
    public void addUniqueParameter(String parameter) {
        visitorRecord.add(parameter);
    }

    public void printVisitorRecord() {
        System.out.println("Імʼя відвідувача: " + this.name);
        System.out.println("Номер телефону: " + this.phoneNumber);
        System.out.println("Тип квитка: " + this.ticketType);
        System.out.println("Запис відвідувача зоопарку:");
        for (int i = 0; i < visitorRecord.size(); i++) {
            System.out.println("Унікальний параметр " + (i + 1) + ": " + visitorRecord.get(i));
        }
    }
}
