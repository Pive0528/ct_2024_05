package com.ki.level0.p120889;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        // System.out.println(new Solution().solution(2, 3));
        System.out.println(new Solution().solution(new int[] {1,2,3}));
    }
}
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[2]<(sides[0]+sides[1])) {
            return 1;
        }
        else {
            return 2;
        }
    }
}