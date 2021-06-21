package baekjoon.q2000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q2447
 *
 * @author kuh
 * @since 2021.06.23
 *
 * @Q
 *
 * @input
 *
 * @output
 *
 *
 */
public class Q2447 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int sampleCount = 9;
        int[] arr = new int[9];
        int maxValue = -1;
        int maxIndex = -1;

        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length ; i ++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
                maxIndex = i + 1;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndex);


    }
}
