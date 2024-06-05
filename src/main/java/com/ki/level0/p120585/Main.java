package com.ki.level0.p120585;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        //System.out.println(new Solution().solution(new int[] {89, 90, 91}));
        System.out.println(new Solution().solution(new int[] {149, 180, 192, 170}, 167));
    }
}
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] > height) {
                answer+=1;
            }
        }
        return answer;
    }
}