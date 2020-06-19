package baekjun.q10000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q11051
 *
 * @author Kimuihyeon
 * @since 2020.06.19
 *
 * @Q
 * 자연수 N과 정수 K가 주어졌을 때 이항 계수 (N,K)를 10007나눈 나머지를 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 N과 K가 주어진다. (1 ≤  ≤ 10, 0 ≤  ≤ )
 *
 * @output
 * (N,K) 를  10007나눈 나머지를 표시
 */
public class Q11051 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] dp  = new int[N+1][N+1];
        dp[0][0] = dp[1][0] = dp[1][1] = 1;
        int division = 10007;

        for(int i = 2 ; i < N+1 ; i++){
            for(int j = 0 ; j< N+1 ; j++){
                if(i<j){
                    break;
                }
                else if( j == i ||  j == 0){
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = ( dp[i-1][j-1] +  dp[i-1][j] ) % division;
                }
            }
        }
        System.out.println(dp[N][K]);
    }

    /**
     * @description
     * 초기에는 파스칼의 삼각표 로 풀었는데,
     * 오버플로우 문제, 시간제한 떄문에
     * 동적계획법으로 변경함 ..!
     */
    public static int c(int n,int k){
        if(k == 0 || k == n){
            return 1;
        }
        return c(n-1 , k-1) +c(n-1 , k);
    }

}

