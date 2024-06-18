package homework;
// 1부터 n이하의 소수의 개수 구하기
class Main {
    public static void main(String[] args) {
        int rs = Math.one_to_n_prime_numbers_count(5);
        System.out.println("rs: " + rs);
        // rs: 4

        rs = Math.one_to_n_prime_numbers_count(10  );
        System.out.println("rs: " + rs);
        // rs: 6

        rs = Math.one_to_n_prime_numbers_count(13);
        System.out.println("rs: " + rs);
        // rs: 6

        rs = Math.one_to_n_prime_numbers_count(29);
        System.out.println("rs: " + rs);
        // rs: 6

        rs = Math.one_to_n_prime_numbers_count(1000);
        System.out.println("rs: " + rs);
        // rs: 6
    }
}

class Math {
    public static int one_to_n_prime_numbers_count(int a) {
        int sum = 0;
        int sum2 = 0;
        for (int j = 1; j<=a; j++) {
            for (int i = 1; i<=j; i++) {
                if (j%i==0) {
                    sum+=1;
                    //System.out.printf("j: %d, i: %d, sum: %d, sum2: %d\n",j,i,sum,sum2);
                }
            }
            if (sum==2) {
                sum2=sum2+1;
                //System.out.printf("j: %d, sum: %d\n",j,sum);
                sum=0;
            }
            else if (sum!=2) {
                sum=0;
            }
        }
        int rs = sum2;
        return rs;
    }
}

//class Main {
//    public static void main(String[] args) {
//        boolean rs = Math.isPrimeNumber(1);
//        System.out.println("1은 소수인가?: " + rs);
//
//        rs = Math.isPrimeNumber(2);
//        System.out.println("2은 소수인가?: " + rs);
//
//        rs = Math.isPrimeNumber(4);
//        System.out.println("4은 소수인가?: " + rs);
//
//        rs = Math.isPrimeNumber(7);
//        System.out.println("7은 소수인가?: " + rs);
//
//    }
//}
//
//class Math {
//    public static boolean isPrimeNumber(int a) {
//        int sum = 0;
//        for (int i = 1; i<=a; i++) {
//            if (a%i==0) {
//                sum+=1;
//            }
//        }
//        if (sum==2) {
//            return true;
//        }
//        else {
//            return false;
//        }
//
//    }
//}