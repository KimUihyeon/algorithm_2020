package baekjun.q8000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q8393
 *
 * @author Kimuihyeon
 * @since 2020.06.18
 *
 * @Q
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * @output
 * 1부터 n까지 합을 출력한다.
 *
 */
public class Q8393 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n+1) / 2;

        System.out.println(sum);
    }
}
