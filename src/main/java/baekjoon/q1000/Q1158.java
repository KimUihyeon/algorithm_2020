package baekjoon.q1000;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q1158
 *
 * @author kuh
 * @since 2020.06.30
 *
 * @Q
 * 요세푸스 문제는 다음과 같다.
 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
 *
 * @output
 * 예제와 같이 요세푸스 순열을 출력한다.
 */
public class Q1158 {

    private static BufferedWriter out;

    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = in.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        boolean[] arr = new boolean[N];
        int[] yosepus = new int[N];

        int i = 0;
        int index = 0;
        int cousor = 0;

        for (int k = 0; k < arr.length; k++) {
            arr[k] = true;
        }


        while (true) {
            if (index == arr.length) {
                break;
            }

            if (arr[i]) {
                cousor++;
                if (cousor == K) {
                    arr[i] = false;
                    yosepus[index] = i + 1;
                    index++;
                    cousor = 0;
                }
            }

            i++;
            if (i == N) {
                i = 0;
            }
        }

        print(yosepus);

        in.close();
        out.flush();
        out.close();
    }

    private static void print(int[] arr) throws IOException {
        String result = "<";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (arr.length - 1 != i) {
                result += ", ";
            }

        }
        result += ">";

        out.write(result);
        out.newLine();
    }
}
    