package org.Scanner_practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;

        while (true) {
            System.out.println("숫자: ");
            try {
                a = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();  // 버퍼를 비운다?
                System.out.println("똑바로 입력하세요.");
            }
        }
        System.out.printf("입력된 숫자: %d", a);

        sc.close();
    }
}
