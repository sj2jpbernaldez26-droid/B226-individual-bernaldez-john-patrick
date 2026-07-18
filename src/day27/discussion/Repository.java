/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day27.discussion;

import java.util.ArrayList;
import java.util.List;


public class Repository {
    
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
       
        students.add(new Student(1, "Jerry Matubis", 12, "BSIT", "5th"));
        students.add(new Student(2, "Lester Osana", 19, "BSCPE", "4th"));
        
        return students;
    }
}
