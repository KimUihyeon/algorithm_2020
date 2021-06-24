package baekjoon.q11000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q11048
 *
 * @author kuh
 * @since 2020.06.23
 *
 * @Q
 * 준규는 N×M 크기의 미로에 갇혀있다. 미로는 1×1크기의 방으로 나누어져 있고, 각 방에는 사탕이 놓여져 있다.
 * 미로의 가장 왼쪽 윗 방은 (1, 1)이고, 가장 오른쪽 아랫 방은 (N, M)이다.
 * 준규는 현재 (1, 1)에 있고, (N, M)으로 이동하려고 한다. 준규가 (r, c)에 있으면, (r+1, c), (r, c+1), (r+1, c+1)로 이동할 수 있고,
 * 각 방을 방문할 때마다 방에 놓여져있는 사탕을 모두 가져갈 수 있다. 또, 미로 밖으로 나갈 수는 없다.
 * 준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수의 최댓값을 구하시오.
 *
 * @input
 * 첫째 줄에 미로의 크기 N, M이 주어진다. (1 ≤ N, M ≤ 1,000)
 *
 * 둘째 줄부터 N개 줄에는 총 M개의 숫자가 주어지며, r번째 줄의 c번째 수는 (r, c)에 놓여져 있는 사탕의 개수이다.
 * 사탕의 개수는 0보다 크거나 같고, 100보다 작거나 같다.
 *
 * @output
 * 첫째 줄에 준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수를 출력한다.
 */
public class Q11048 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] miro = new int[n][m];
        int[][] dp = new int[n][m];

        for (int i = 0; i < miro.length; i++) {
            for (int j = 0; j < miro[i].length; j++) {
                miro[i][j] = sc.nextInt();
            }
        }
        dp[0][0] = miro[0][0];


        for (int i = 0; i < miro.length; i++) {
            for (int j = 0; j < miro[i].length; j++) {
                if(i == 0 && j == 0){
                    continue;
                }

                int max = -1;

                if(i >= 1 && dp[i-1][j] + miro[i][j] > max){
                    max = dp[i-1][j] + miro[i][j];
                }
                if(j >= 1 && dp[i][j-1] + miro[i][j] > max){
                    max = dp[i][j-1] + miro[i][j];
                }
                if(i >= 1 && j >= 1 && dp[i-1][j-1] + miro[i][j] > max){
                    max = dp[i-1][j-1] + miro[i][j];
                }
                dp[i][j] = max;
            }
        }
//        Util.print(dp);
        System.out.println(dp[n-1][m-1]);
    }

}
