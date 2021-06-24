package baekjoon.q2000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q2588
 *
 * @author kuh
 * @since 2020.06.17
 *
 * @Q
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * https://www.acmicpc.net/problem/2588
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 472
 * 385
 *
 * @output
 * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 * 2360
 * 3776
 * 1416
 * 181720
 *
 */
public class Q2588 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int case1 = sc.nextInt();
        int case2 = sc.nextInt();
        String case2String = String.valueOf(case2);

        for (int i = case2String.length() - 1; i >= 0; i--) {
            int step = case1 * Integer.parseInt(String.valueOf(case2String.charAt(i)));
            System.out.println(step);
        }

        System.out.println(case1 * case2);

    }
}
