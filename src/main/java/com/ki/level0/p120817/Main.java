package com.ki.level0.p120817;

public class Main {
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(new Solution().solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i =0; i<numbers.length; i++) {
            answer+=numbers[i];
        }
        return answer/numbers.length;
    }
}