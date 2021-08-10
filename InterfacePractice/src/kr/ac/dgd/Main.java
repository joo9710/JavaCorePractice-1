package kr.ac.dgd;

import java.util.ArrayList;
import java.util.List;

import kr.ac.dgd.pizza.JjhPizza;
import kr.ac.dgd.pizza.PizzaBaker;
import kr.ac.dgd.student.ElementaryStudent;
import kr.ac.dgd.student.HighSchoolStudent;
import kr.ac.dgd.student.Student;

public class Main {

    public static void main(String[] args) {
        // interface 구현 문제
        List<Student> students = new ArrayList<Student>();
        students.add(new ElementaryStudent("elemStudent1", "A"));
        students.add(new ElementaryStudent("elemStudent1", "B"));
        students.add(new ElementaryStudent("elemStudent1", "C"));
        students.add(new HighSchoolStudent("HighStudent1", 99));
        students.add(new HighSchoolStudent("HighStudent2", 88));
        students.add(new HighSchoolStudent("HighStudent3", 77));
        students.add(new HighSchoolStudent("HighStudent4", 66));

        for (Student s : students){
            s.printStudentInfo();
        }
    }
}
