package baekjoon.q11000;

import java.io.*;

/**
 * 백준 알고리즘 Q11726
 *
 * @author Kimuihyeon
 * @Q
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 *
 * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 *
 * @input
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 *
 * @output
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 * @since 2020.07.07
 */
public class Q11726 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dp = new int[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        int num = Integer.parseInt(in.readLine());
        for (int i = 3; i < num + 1; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }


        out.write(dp[num] + "");
        in.close();
        out.flush();
        out.close();
    }
}
