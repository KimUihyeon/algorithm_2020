package baekjoon.q10000;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q10820
 *
 * @author kuh
 * @since 2020.06.27
 *
 *
 * @Q
 * 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
 * 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
 *
 * @input
 * 첫째 줄부터 N번째 줄까지 문자열이 주어진다. (1 ≤ N ≤ 100) 문자열의 길이는 100을 넘지 않는다.
 *
 * @output
 * 첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력한다
 */
public class Q10820 {

    private static final short LOWERCASE = 0;
    private static final short UPPERCASE = 1;
    private static final short NUMBER = 2;
    private static final short SPACE = 3;

    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while ((input = in.readLine()) != null && input.length() != 0) {
            int[] charCase = charAnalysis(input);

            for (int j = 0; j < charCase.length; j++) {
                out.write(charCase[j] + " ");

            }
            out.newLine();
        }

        out.flush();
        out.close();
        in.close();
    }

    private static int[] charAnalysis(String str) {
        int[] charCase = new int[4];
        for (int i = 0; i < str.length(); i++) {
            charCase[charType(str.charAt(i))]++;
        }
        return charCase;
    }

    private static short charType(char c) {
        if (c >= 'a' && c <= 'z') {
            return LOWERCASE;
        } else if (c >= 'A' && c <= 'Z') {
            return UPPERCASE;
        } else if (c >= '0' && c <= '9') {
            return NUMBER;
        } else if (c == ' ') {
            return SPACE;
        }

        return -1;
    }
}
    