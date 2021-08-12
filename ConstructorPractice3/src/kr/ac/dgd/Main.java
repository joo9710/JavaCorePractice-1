package kr.ac.dgd;

public class Main {

    public static void main(String[] args) {
        System.out.println("ConstuctorPractice3");
        // p 205
        Member member1 = new Member("name",180,70,"korea");
        System.out.println(member1.getName());
        System.out.println(member1.getHeight());
        System.out.println(member1.getWeight());
        System.out.println(member1.getNation());
    }
}