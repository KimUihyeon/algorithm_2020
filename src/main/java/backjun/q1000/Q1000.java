package backjun.q1000;

import java.util.Scanner;

/**
 * 백준 알고리즘 1000
 *
 * @author Kimuihyeon
 * @since 2020.06.17
 *
 * @Q
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * @output
 * 첫째 줄에 A+B를 출력한다.
 *
 */

public class Q1000 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int case1 = sc.nextInt();
        int case2 = sc.nextInt();

        System.out.println(case1 + case2);
    }
}
