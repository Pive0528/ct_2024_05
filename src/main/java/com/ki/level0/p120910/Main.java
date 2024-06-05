package com.ki.level0.p120910;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        //System.out.println(new Solution().solution(new int[] {89, 90, 91}));
        System.out.println(new Solution().solution(2, 10));
    }
}
class Solution {
    public int solution(int n, int t) {
        int answer = 1;
        for (int i =1; i<=t; i++) {
            //n*n*i=answer;
        }
        return answer;
    }
}