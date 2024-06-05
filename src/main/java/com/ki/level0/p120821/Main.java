package com.ki.level0.p120821;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        System.out.println(new Solution().solution(new int[] {1, 2, 3, 4, 5}));
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        for (int i = num_list.length-1; i>=0; i--) {
            for (int j = 0; j<= num_list.length-1; j++) {
                num_list[j] = num_list[i];
            }
        }
        return answer;
    }
}