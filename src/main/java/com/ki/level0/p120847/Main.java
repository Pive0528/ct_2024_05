package com.ki.level0.p120847;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        System.out.println(new Solution().solution(new int[] {0, 31, 24, 10, 1, 9}));
    }
}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer=numbers[(numbers.length-1)]*numbers[(numbers.length-2)];
        return answer;
    }
}