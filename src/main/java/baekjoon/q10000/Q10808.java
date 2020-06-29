package baekjoon.q10000;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q10808
 *
 * @author kuh
 * @since 2020.06.28
 *
 * @Q
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 *
 * @output
 * 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 */
public class Q10808 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < input.length(); i++) {
            short index = (short) (input.charAt(i) - 'a');
            alphabet[index]++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            out.write(alphabet[i] + " ");
        }

        out.flush();
        out.close();
        in.close();
    }
}
    