package baekjoon.q10000;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q10824
 *
 * https://www.acmicpc.net/problem/10824
 *
 * @author kuh
 * @since 2020.06.27
 *
 * @Q
 * 네 자연수 A, B, C, D가 주어진다. 이때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오.
 * 두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 즉, 20과 30을 붙이면 2030이 된다.
 *
 * @input
 * 첫째 줄에 네 자연수 A, B, C, D가 주어진다. (1 ≤ A, B, C, D ≤ 1,000,000)
 *
 * @output
 * A와 B를 붙인 수와 C와 D를 붙인 수의 합을 출력한다.
 */
public class Q10824 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split(" ");
        long sum = 0;
        for (int i = 0; i < inputs.length; i += 2) {
            sum += Long.parseLong(inputs[i] + inputs[i + 1]);
        }

        out.write(String.valueOf(sum));

        out.flush();
        out.close();
        in.close();
    }
}
    