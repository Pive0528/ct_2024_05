package com.ki.level0.p120816;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        //System.out.println(new Solution().solution(new int[] {89, 90, 91}));
        System.out.println(new Solution().solution(7, 10));
    }
}
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n%slice>0) {
            answer=n/slice+1;
        }
        else {
            answer=n/slice;
        }
        return answer;
    }
}