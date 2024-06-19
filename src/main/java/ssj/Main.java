package ssj;

public class Main {
    public static void main(String[] args) {
        사람 사람1 = new 사람("김철수");
        System.out.println("==사람1 정보==");
        System.out.printf("이름: %s\n", 사람1.이름);
        System.out.printf("나이: %d\n", 사람1.나이);

        사람 사람2 = new 사람("김영희");
        System.out.println("==사람2 정보==");
        System.out.printf("이름: %s\n", 사람2.이름);
        System.out.printf("나이: %d\n", 사람2.나이);
    }
}

class 사람 {
    String 이름; int 나이;

    사람(String 이름) {
        System.out.println("생성자 호출됨");
        this.이름 = 이름;
        this.나이 = 22;
    }
}