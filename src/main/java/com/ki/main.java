package com.ki;         // 패키지 com 안에 있는 또 다른 패키지 ki안에 들어있음

import java.awt.*;      // 포인트 함수를 사용할 수 있도록 해주는 모듈
import java.util.Arrays;       // Arrays함수를 사용할 수 있도록 해주는 모듈

class main {        // main 클래스
    public static void main(String[] args) {
        String msg = greet("Jin");      // greet라는 함수에 msg라는 변수로 정의되어있는 "Jin"문자열을 집어넣음
        // 문자열만 담을 수 있는 변수 msg에 greet 함수 실행 결과를 넣음
        System.out.println(msg);              // msg를 출력

        Point point = createPoint(5, 10);     // createPoint라는 함수에 point라는 변수로 정의되어있는 5, 10 숫자를 집어넣음
        System.out.println("Point create at (" + point.x + "," + point.y + ")");    // "Point create at (, )"과 변수 point(x, y) 출력

        int[] evens = firstEvenNumbers(5);      // firstEvenNumbers라는 함수에 evens라는 변수로 정의되어있는 5숫자를 집어넣음
        //
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));     // "first 5 even numbers : "과 변수이자 배열 evens 출력

    }

    public static String greet(String name) {       // 함수 greet, String name은 입력될 문자열의 변수명을 뜻함.
        // 문자열 매개변수 1개를 받는 greet 메서드, static == 인스턴스화 없이 사용(new x)
        return "Hello, " + name + "!";              // "Hello, " "!"를 확정출력, 그리고 입력된 문자열 name을 중간에 출력
    }

    public static Point createPoint(int x, int y) { // 함수 createPoint, x, y은 입력될 숫자 두개의 변수명을 뜻함.
        return new Point(x, y);                     // x, y에 담긴 숫자를 그대로 point에 담아서 출력을 도와줌
    }

    public static int[] firstEvenNumbers(int n) {   // 함수 firstEvenNumbers, n은 입력될 숫자의 변수명을 뜻함.
        int[] evenNumbers = new int[n];             // n이라는 크기를 가진 배열 evenNumbers를 의미함

        for (int i = 0, num = 2; i < n; i++, num += 2){  // i=0, num는 2, i는 입력된 숫자 n보다 작으며 num은 for문이 반복될때마다 2씩 증가한다.
            evenNumbers[i] = num;                   // evennumbers의 i번째 공간에 num이 들어간다. ex) 첫번째 공간에 들어가는 숫자는 2
        }
        return evenNumbers;     // evenNumbers를 리턴(출력)
    }
}
