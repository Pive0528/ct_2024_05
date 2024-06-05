package com.ki.level0.p120824;

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
        for (int i = 0; i< num_list.length-1; i++) {
            if (answer[i]%2==0) {
                answer[0] += 1;
            }
        }
        return answer;
    }
}