package baekjoon.q2000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q2743
 *
 * @author kuh
 * @since 2020.06.27
 *
 * @Q
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 *
 * @output
 * 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 *
 */
public class Q2743 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().length());
    }
}
    