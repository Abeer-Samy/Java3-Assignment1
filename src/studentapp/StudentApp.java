/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author alaakholi
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

//2. Explain how can you save the number 4200200200 into variable of type int
  int number = Integer.parseUnsignedInt("4200200200");
      System.out.println(Integer.toUnsignedString(number));

System.out.println("-------------------------------------------------------------------");

/*Write an abstract class Student that includes the following hidden attributes: id(int),
name(String), major(String) and grade(double), then create setters and getters for them.
Write two classes that inherited from Student: ItStudent and ArtStudent. The grade for
ItStudent is calculated as: grade = mid*0.30 + project*0.30 + final*0.40 and the grade for
ArtStudent is calculated as: grade = mid*0.40 + report*0.10 + final*0.50. Crate main class
that achieve the following:
a. Declare and initialize an array of five Student objects from both ItStudent and ArtStudent
classes.
b. Sort the Student objects by grade in descending order using functions.
c. Save the sorted objects into text file.*/



        Student stu1 = new ItStudent(12, "ِAbeer", "Computer Scince", 30, 5, 48);
        Student stu2 = new ArtStudent(23, "Omar", "Teacher", 16, 7, 60);
        Student stu3 = new ItStudent(32, "Samy", "Software Development", 20, 9, 50);
        Student stu4 = new ArtStudent(11, "Enas", "English Art", 27, 6, 55);
        Student stu5 = new ArtStudent(20, "Majed", "History", 16, 9, 50);
        

        Student[] students = {stu1, stu2, stu3, stu4};
        System.out.println("---before sorting---");
        for(Student s :students)
            System.out.println(s);
       
        // invoke sort static functioin to sort students according to grade
        Student.sort(students);
        System.out.println("---after sorting---");
        for(Student s :students)
            System.out.println(s);
        
        // store at file
        PrintWriter pw = new PrintWriter(new File("src/studentApp/student.data"));
        for (Student s : students) {
            pw.println(s);
        }
        pw.close();

        
    }
}
