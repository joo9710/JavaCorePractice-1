package kr.ac.dgd;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Collection (List : ArrayList)

        System.out.println("배열의 경우");
        // 배열의 경우
        String[] strs5 = {"1", "2", "3", "4", "5"}; // 배열의 길이는 5
        // strs에 있는 데이터를 모두 출력하시오
        for(String s : strs5){
            System.out.println(s);
        }
        // 배열의 길이
        System.out.println("str5의 길이: " + strs5.length);

        // strs에 "6"을 추가하시오.: java에서 배열은 초기 선언시 배열의 길이를 선언 해야 한다.
        // 길이가 6인 strs6배열을 추가하고
        // strs5의 내용을 strs6에 복사하고
        // 이걸 좀 더 쉽게 할 수 없을까?
        System.out.println("==============================");
        System.out.println("ArrayList의 경우");

        List<String> strList = new ArrayList<String>(); // strList의 배열의 길이를 선언시에 지정할 필요가 없고, 데이터가 추가, 삭제 될때마다 길이가 동적으로 변화한다.
        strList.add("1"); // index 0
        strList.add("2"); // index 1
        strList.add("3"); // index 2
        strList.add("4"); // index 3
        strList.add("5"); // index 4

        // list의 길이
        System.out.println("list의 길이(\"6추가전\"): " + strList.size());

        // strList에 "6"을 추가하시오
        strList.add("6");

        // list의 길이
        System.out.println("list의 길이(\"6추가 후\"): " + strList.size());

        // strList 중에 "2"를 삭제하시오
        strList.remove(1);
        System.out.println("\"2\" 삭제 후");
        // strList의 내용을 전부 출력하시오
        for(String s: strList){
            System.out.println(s);
        }

        // strList에서 "4"인것의 인덱스 번호는 몇번일까?
        int indexOf4 = strList.indexOf("4");
        System.out.println("strList에서 \"4\"인것의 인덱스 번호: " + indexOf4);




    }
}
