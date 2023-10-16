package org.example.distrubutor.service;

import org.example.distrubutor.persistence.ObjectWithData;
import org.example.distrubutor.persistence.Student;
import org.example.distrubutor.persistence.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentService {
    public static StudentService INSTANCE;

    public StudentService() {
    }

    public static StudentService getInstance() {
        StudentService localInstance = INSTANCE;
        if (localInstance == null) {
            synchronized (StudentService.class) {
                localInstance = INSTANCE;
                if (localInstance == null) {
                    localInstance = INSTANCE = new StudentService();
                }
            }
        }
        return localInstance;
    }

    public List<ObjectWithData> createListOfStudents(int count) {
        List<ObjectWithData> students = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            String studentName = "Студент " + i;
            students.add(new Student(studentName));
        }
        return students;
    }

    public Student randomTaskExecutor(Student student, List<ObjectWithData> tasks) {
        Random random = new Random();
        for (ObjectWithData task : tasks) {
            student.addTaskRating((Task) task, random.nextInt(((Task) task).getMaxPoints() + 1));
        }
        return student;
    }

    public List<ObjectWithData> randomTaskExecutor(List<ObjectWithData> students, List<ObjectWithData> tasks) {
        List<ObjectWithData> updatedStudents = new ArrayList<>();
        for (ObjectWithData student : students) {
            updatedStudents.add(randomTaskExecutor((Student) student, tasks));
        }
        return updatedStudents;
    }

    public List<Student> filterByGrAvPoints(List<Student> students, int sumOfMaxPoints, int minAvPoints, int maxAvPoints) {
        return students.stream()
                .filter(student -> {
                            int sumStudentPoints = student.getTaskRating().values().stream().mapToInt(Integer::intValue).sum();
                            double av = (sumStudentPoints / (double) sumOfMaxPoints) * 100;
                            return av >= minAvPoints && av <= maxAvPoints;
                        }
                ).toList();
    }
}
