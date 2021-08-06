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
        List<PizzaBaker> pizzaBakers = new ArrayList<>();

        pizzaBakers.add(new JjhPizza("jjh특제빵", "jjh재료들"));

    }
}
