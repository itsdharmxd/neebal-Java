package com.practice;

import java.util.*;


public class Practice {
    public static void main(String[] args) {

        Student student2=new Student("Dharmesh","UEMK",5);
        Student student1=new Student("Upadhyay","UEMK",9);
        System.out.println(student2.getSchool());

       List<Student> studentList=new ArrayList<Student>();

        studentList.add(student1);
        studentList.add(student2);

        for(Student student:studentList){
            if(student.getRollNo()<6){
                System.out.println(   student.toString());
            }
        }
        Set<Student>studentSet=new HashSet<>(studentList);

        Iterator<Student> iterator=studentSet.iterator();

        while (iterator.hasNext()){

            studentSet.remove( iterator.next());

        }
        iterator=studentSet.iterator();

        while (iterator.hasNext()){

            studentSet.remove( iterator.next());

        }




    }
}
