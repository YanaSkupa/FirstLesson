package org.example.distrubutor.persistence;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@Data
public class Student extends ObjectWithData {
    private String name;
    private int rating;
    private Map<Task, Integer> taskRating = new HashMap<>();

    public Student(String name, int rating) {
        this.setId(UUID.randomUUID());
        this.name = name;
        this.rating = rating;
    }
    public Student(String name) {
        this.setId(UUID.randomUUID());
        this.name = name;
    }

    public void addTaskRating(Task task, Integer rating) {
        taskRating.put(task, rating);
    }

}

