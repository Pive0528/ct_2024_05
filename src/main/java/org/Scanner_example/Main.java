package org.Scanner_example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] b = sc.nextLine().split(" ");

        long sum = 0;
        long num1 = Long.parseLong(b[0]);   // 정석대로 풀기.
        long num2 = Long.parseLong(b[1]);   // 추가요소있을시 난해함
        long num3 = Long.parseLong(b[2]);

        for (int i = 0; i < 2; i++) {   // 아래와 같은 결과
            sum += Long.parseLong(b[i]);
        }

        for (String b2 : b) {           // 위와 같은 결과. 향상된 for문
                                        // b2는 변수명. 아무거나 가능
            sum += Long.parseLong(b2);
        }



        System.out.print(num1+num2+num3);


    }
}
