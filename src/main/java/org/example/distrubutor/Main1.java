package org.example.distrubutor;

import org.example.distrubutor.db.DataBase;
import org.example.distrubutor.db.DataBaseImpl;
import org.example.distrubutor.db.DbCollectionNames;
import org.example.distrubutor.persistence.Group;
import org.example.distrubutor.persistence.ObjectWithData;
import org.example.distrubutor.persistence.Student;
import org.example.distrubutor.persistence.Task;
import org.example.distrubutor.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main1 {
    public static void main(String[] args) {
        DataBase database = DataBaseImpl.getInstance();
        StudentService studentService = StudentService.getInstance();

        List<ObjectWithData> students = studentService.createListOfStudents(100);
        database.saveButch(DbCollectionNames.STUDENTS_DB_COLLECTION, students);

        Group group1 = new Group("Група 1");
        Group group2 = new Group("Група 2");
        Group group3 = new Group("Група 3");

        database.saveNewEntity(DbCollectionNames.GROUPS_DB_COLLECTION, group1.getId(), group1);
        database.saveNewEntity(DbCollectionNames.GROUPS_DB_COLLECTION, group2.getId(), group2);
        database.saveNewEntity(DbCollectionNames.GROUPS_DB_COLLECTION, group3.getId(), group3);

        List<ObjectWithData> tasks = new ArrayList<>();
        int sumOfMaxPoints = 0;
        for (int i = 0; i < 10; i++) {
            int maxPoints = (int) (Math.random() * 100);
            sumOfMaxPoints += maxPoints;
            tasks.add(new Task("Task " + i, maxPoints));
        }
        database.saveButch(DbCollectionNames.TASKS_DB_COLLECTION, tasks);

        List<ObjectWithData> studentsWithExecutedTasks = studentService.randomTaskExecutor(students, tasks);
        database.updateMany(DbCollectionNames.STUDENTS_DB_COLLECTION,
                studentsWithExecutedTasks.stream().collect(Collectors.toMap(ObjectWithData::getId, Function.identity()))
        );

        List<Student> studentsWithTasks = database.getAllEntities(DbCollectionNames.STUDENTS_DB_COLLECTION)
                .stream()
                .map(e -> (Student) e)
                .toList();

        List<Student> studentsWithAvGrThen75 = studentService.filterByGrAvPoints(studentsWithTasks, sumOfMaxPoints, 75, 100);
        List<Student> studentsWithAv50_74 = studentService.filterByGrAvPoints(studentsWithTasks, sumOfMaxPoints, 50, 74);
        List<Student> studentsWithAv25_49 = studentService.filterByGrAvPoints(studentsWithTasks, sumOfMaxPoints, 25, 49);
        List<Student> studentsWithAvLessThen24 = studentService.filterByGrAvPoints(studentsWithTasks, sumOfMaxPoints, 0, 24);
        group1.setStudents(studentsWithAvGrThen75);
        group2.setStudents(studentsWithAv50_74);
        group3.setStudents(studentsWithAv25_49);
        database.updateEntity(DbCollectionNames.GROUPS_DB_COLLECTION, group1.getId(), group1);
        database.updateEntity(DbCollectionNames.GROUPS_DB_COLLECTION, group2.getId(), group2);
        database.updateEntity(DbCollectionNames.GROUPS_DB_COLLECTION, group3.getId(), group3);

        studentsWithAvLessThen24.forEach(student -> database.deleteEntity(DbCollectionNames.STUDENTS_DB_COLLECTION, student.getId()));

        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);
    }
}

