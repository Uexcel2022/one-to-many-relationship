package com.uexcel;

import java.util.List;

import com.uexcel.entity.Department;
import com.uexcel.entity.Faculty;
import com.uexcel.persistence.CustomEntityManager;

import jakarta.persistence.EntityManager;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EntityManager entityManager = CustomEntityManager.getEntityManager();

        try {

            entityManager.getTransaction().begin();
            // Faculty faculty = new Faculty();
            // faculty.setFacultyName("Management");
            // Department department = new Department();
            // department.setDepartmentName("Management Technoloy");
            // Department department2 = new Department();
            // department2.setDepartmentName("Marketing");
            // faculty.setDepartment(List.of(department, department2));
            // entityManager.persist(faculty);
            // entityManager.getTransaction().commit();

            Faculty faculty = entityManager.find(Faculty.class, 1);
            System.out.println(faculty);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

    }
}
