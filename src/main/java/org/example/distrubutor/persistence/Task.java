package org.example.distrubutor.persistence;

import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
public class Task extends ObjectWithData {
    private String name;
    private int maxPoints;

    public Task(String name, int maxPoints) {
        this.setId(UUID.randomUUID());
        this.name = name;
        this.maxPoints = maxPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Task task = (Task) o;
        return maxPoints == task.maxPoints
                && Objects.equals(name, task.name)
                && Objects.equals(getId(), task.getId()
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
