package com.ki.level0.p120583;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        System.out.println(new Solution().solution(new int[] {9, -1, 0}));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int sum = (array.length-1)/2;
        Arrays.sort(array);
        answer=array[sum];
        return answer;
    }
}