package com.ki.level0.p120831;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new com.ki.level0.p120807.Solution().solution(2, 3));
        //System.out.println(new com.ki.level0.p120817.Solution().solution(new int[] {89, 90, 91}));
        System.out.println(new Solution().solution(100));
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i<=n; i++) {
            if (i%2==0) {
                answer+=i;
            }
        }
        return answer;
    }
}