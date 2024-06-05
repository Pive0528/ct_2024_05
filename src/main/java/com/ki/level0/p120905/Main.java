package com.ki.level0.p120905;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        System.out.println(new Solution().solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12}));
    }
}
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int j = 0;
        for (int i = 0; i< numlist.length-1; i++) {
            if (numlist[i] %3==0) {
                answer[j] += numlist[i];
                j+=1;
            }
        }
        return answer;
    }
}