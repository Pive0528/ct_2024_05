package org.example;

public class Main2 {
    public static void main(String[] args) {
        try {
            int rs = 계산기.나누다(15, 0);
        } catch (ArithmeticException e) {       // 예외문?
            System.out.println("0으로 못 나눠.");
        } catch (Exception e) {       // 예외문?
            System.out.println("알 수 없는 예외 상황 발생");
        }
        System.out.println(123);
    }
}


class 계산기 {
    static int 나누다(int a, int b) throws ArithmeticException {
        int rs = 0;
        rs = a/b;

        return rs;
    }
}