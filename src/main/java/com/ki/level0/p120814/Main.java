package com.ki.level0.p120814;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        //System.out.println(new Solution().solution(new int[] {89, 90, 91}));
        System.out.println(new Solution().solution(15));

    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n/7;
        if (n%7>0) {
            answer=answer+1;
        }
        return answer;
    }
}