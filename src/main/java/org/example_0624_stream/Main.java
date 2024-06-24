package org.example_0624_stream;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 일반
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i=0; i<arr.length; i++) {
            arr[i] *= Math.pow(arr[i], 2);
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));



    }
}
