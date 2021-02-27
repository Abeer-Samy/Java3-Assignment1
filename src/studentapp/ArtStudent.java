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
public class ArtStudent extends Student {

    public ArtStudent(int id, String name, String major,int mid,int report, int fin) {
        this.id = id;
        this.name = name;
        this.major = major;
        grade = mid * 0.40 + report * 0.10 + fin*50;

    }

   

    
    
}
