package com.ki.level0.p120818;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        //System.out.println(new Solution().solution(new int[] {89, 90, 91}));
        System.out.println(new Solution().solution(1231231));
    }
}

class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
            answer = (int) (price * 0.8);
        }
        else if (price >= 300000) {
            answer = (int) (price * 0.9);
        }
        else if (price >= 100000) {
            answer = (int) (price * 0.95);
        }
        else {
            answer=price;
        }
        return answer;
    }
}