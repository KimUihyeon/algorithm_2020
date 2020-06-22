package baekjun.q10000;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q10872
 *
 * @author Kimuihyeon
 * @Q
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
 *
 * @output
 * 첫째 줄에 N!을 출력한다.
 *
 * @since 2020.06.22
 */
public class Q10872 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] factorial  = new int[12];
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i-1] * (i+1);
        }

        System.out.println(factorial[N-1]);
    }
}
