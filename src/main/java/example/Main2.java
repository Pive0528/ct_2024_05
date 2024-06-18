package example;

public class Main2 {
    public static void main(String[] args) {
        boolean rs = Math.isEvenNumber(2);
        System.out.println(rs);

        rs = Math.isEvenNumber(3);
        System.out.println(rs);

        rs = Math.isEvenNumber(2);
        System.out.println(rs);

        rs = Math.isEvenNumber(2);
        System.out.println(rs);

    }
}

class Math {
    static boolean isEvenNumber(int a) {
        return true;
    }
}