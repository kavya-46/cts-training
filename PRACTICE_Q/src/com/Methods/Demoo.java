package com.Methods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "-" + name;
    }
}

public class Demoo {
    public static void main(String[] args) {
        Set<Integer> studentIds = new HashSet<>();
        Map<Integer, Student> studentMap = new HashMap<>();

        addStudent(studentIds, studentMap, 101, "Kavya");
        addStudent(studentIds, studentMap, 102, "Jayaram");
        addStudent(studentIds, studentMap, 103, "Sagar");
        addStudent(studentIds, studentMap, 101, "Bhanu"); // duplicate test

        System.out.println("\nStudent Records:");
        for (int id : studentMap.keySet()) {
            System.out.println(studentMap.get(id));
        }

        int searchId = 102;
        System.out.println("\nSearch ID " + searchId + ": " + studentMap.getOrDefault(searchId, null));

        //studentMap.remove(103);
        //studentIds.remove(103);

        System.out.println("\nAfter removal:");
        studentMap.values().forEach(System.out::println);
    }

    static void addStudent(Set<Integer> ids, Map<Integer, Student> map, int id, String name) {
        if (ids.add(id)) {
            map.put(id, new Student(id, name));
        } else {
            System.out.println("Duplicate ID not allowed: " + id);
        }
    }
}
