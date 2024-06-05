package com.ki.level0.p120813;

public class Main {
    public static void main(String[] args) {
        //com.ki.level0.p120831.Solution n = new com.ki.level0.p120831.Solution();
        // System.out.println(new com.ki.level0.p120807.Solution().solution(2, 3));
        //System.out.println(new com.ki.level0.p120817.Solution().solution(new int[] {89, 90, 91}));
        System.out.println(new Solution().solution(15));
    }
}

class Solution {
    public int[] solution(int n) {
        int a = n/2;
        if (n % 2 == 1) {
            a = n/2+1;
        }
        int j=0;
        int[] answer = new int[a];

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[j++] = i;
            }
        }
        return answer;
    }
}


// 원본
//class Solution {
//    public int[] solution(int n) {
//        int[] answer = {};
//        return answer;
//    }
//}