package kr.ac.dgd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// 책 365
public class Main {


    public static void main(String[] args) {
        System.out.println("DataTimePractice---");
        //현재 날짜 출력
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //날짜 지정해서 출력
        LocalDate targetDate = LocalDate.of(2019,11,12);
        System.out.println(targetDate);

        //현재 시간 출력
        LocalTime currentTIme = LocalTime.now();
        System.out.println(currentTIme);

        // 시간을 직접 지정
        LocalTime targetTime = LocalTime.of(12,33,55,12); //
        System.out.println(targetTime);

        //현재 날짜 & 시간
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //날짜 & 시간을 직접 지정
        LocalDateTime targetDateTime = LocalDateTime.of(2019, 11, 12, 13, 22, 33, 222);
        System.out.println(targetDateTime);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
        String nowString = now.format(dateTimeFormatter);


    }
}
