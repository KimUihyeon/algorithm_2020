package baekjoon.q10000;

import javax.swing.text.html.MinimalHTMLWriter;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q10093
 *
 * @author kuh
 * @since 2020.06.25
 *
 * @Q
 * 두 양의 정수가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 두 정수 A와 B가 주어진다. (1 ≤ A, B ≤ 1015, A와 B의 차이는 최대 100,000)
 *
 * @output
 * 첫째 줄에 두 수 사이에 있는 수의 개수를 출력한다.
 * 둘째 줄에는 두 수 사이에 있는 수를 오름차순으로 출력한다
 *
 *
 */
public class Q10093 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long max = max(A , B);
        long min = min(A , B);

        System.out.println(count(min , max));

        for(long i = min +1 ; i < max ; i++){
            System.out.print(i + " ");
        }
    }

    private static long count(long min, long max){
        if ( max == min ){
            return 0;
        }
        else {
            return max - min -1 ;
        }
    }

    private static long min(long a, long b){
        return a >= b ? b : a;
    }


    private static long max(long a, long b){
        return a <= b ? b : a;
    }
}
    