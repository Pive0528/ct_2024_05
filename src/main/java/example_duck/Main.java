package example_duck;

// 문제 : 아래가 실행되도록 해주세요.

//class Main {
//    public static void main(String[] args) {
//        칼 a칼 = new 칼();
//        a칼 = new 활();
//    }
//}
//
//class 칼 {
//
//}
//class 활 extends 칼 {
//}

//class Main {
//    public static void main(String[] args) {
//        무기 a무기 = new 칼();
//        a무기.공격();
//        // 출력 : 칼로 공격합니다.
//    }
//}
//
//class 무기 {
//    void 공격() {
//        System.out.println("칼로 공격합니다.");
//    }
//}
//
//class 칼 extends 무기 {
//
//}

class Main {
    public static void main(String[] args) {
        int i = 99999999;
        float d = i; // 여기선 자동형변환 허용
        System.out.println(d); // 여기선 자동형변환 불가능
    }
}