package baekjun.q1000;

import java.util.Scanner;

/**
 * 백준 알고리즘 1008
 *
 * @author Kimuihyeon
 * @since 2020.06.17
 *
 * @Q
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * @output
 * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 *
 */
public class Q1008 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        double case1 = sc.nextDouble();
        double case2 = sc.nextDouble();

        System.out.println(case1 / case2);
    }
}
