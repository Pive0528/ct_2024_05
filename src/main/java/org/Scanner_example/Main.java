package org.Scanner_example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] b = sc.nextLine().split(" ");


//        long sum = 0;
////        long num1 = Long.parseLong(b[0]);   // 정석대로 풀기.
////        long num2 = Long.parseLong(b[1]);   // 추가요소있을시 난해함
////        long num3 = Long.parseLong(b[2]);
//
////        for (int i = 0; i < b.length; i++) {   // 아래와 같은 결과
////            sum += Long.parseLong(b[i]);
////        }
//
//        for (String b2 : b) {           // 위와 같은 결과. 향상된 for문. b의 모든 개체 순회
//                                        // b2는 변수명. 아무거나 가능
//            sum += Long.parseLong(b2);  // 숫자(long)으로 변환
//        }

        long sum = Arrays.stream(b)     // 스트림에 배열을 담는다.
                .peek(e -> System.out.println(e))   // 뭔일이 일어나고있는가?
                .mapToLong(e -> Long.parseLong(e))  // 숫자(long)으로 변환
                .sum();                             // 담기


        System.out.print("정답: "+sum);


    }
}
