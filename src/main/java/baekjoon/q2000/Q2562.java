package baekjoon.q2000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q2562
 *
 * @author kuh
 * @since 2020.06.25
 *
 * @Q
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 *
 * @input
 * 첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 *
 * @output
 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 *
 *
 */
public class Q2562 {
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
    