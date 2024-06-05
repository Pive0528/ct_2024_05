package com.ki.level0.p120809;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        //System.out.println(new Solution().solution(new int[] {89, 90, 91}));
        System.out.println(new Solution().solution(new int[] {1, 2, 3, 4, 5}));

//        Solution a= new Solution();
//        a.solution(new int[] {1, 2, 3, 4, 5});
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        for (int i=0; i< numbers.length-1; i++) {
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}