/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

/**
 *
 * @author alaakholi
 */
public abstract class Student {

 //attributes
    protected int id;
    protected String name;
    protected String major;
    protected double grade;

// Getters for all attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGrade() {
        return grade;
    }

// Setters for all attributes   
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
// static sort method sorts the Student objects by grade in descending order 
    public static void sort(Student[] students) {
        for (int j = 0; j < students.length; j++) {
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i + 1].getGrade() > students[i].getGrade()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + ", grade=" + grade + '}';
    }

}
