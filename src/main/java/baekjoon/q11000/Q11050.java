package baekjoon.q11000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q11050
 *
 * @author Kimuihyeon
 * @since 2020.06.19
 *
 * @Q
 * 자연수 N과 정수 K가 주어졌을 때 이항 계수 (N,K) 를 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 N과 K가 주어진다. (1 ≤  ≤ 10, 0 ≤  ≤ )
 *
 * @output
 * (N,K) 를 출력한다.
 *
 */
public class Q11050 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(c(N,K));

    }

    public static int c(int n,int k){
        if(k == 0 || k == n){
            return 1;
        }
        return c(n-1 , k-1) +c(n-1 , k);
    }
}
