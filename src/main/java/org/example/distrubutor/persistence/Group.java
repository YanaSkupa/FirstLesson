package org.example.distrubutor.persistence;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Group extends ObjectWithData {
    private final String name;
    private String description;
    private List<Student> students;

    public Group(String name, String description) {
        this.setId(UUID.randomUUID());
        this.name = name;
        this.description = description;
        this.students = new ArrayList<>();
    }

    public Group(String name) {
        this.setId(UUID.randomUUID());
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Group name: ").append(getName()).append("\n");
        b.append("Students ").append(students.size()).append(": \n");
        students.forEach(student -> b.append(student).append("\n"));
        return b.toString();
    }
}
