package baekjoon.q17000;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/**
 * 백준 알고리즘 Q17413
 *
 * @author kuh
 * @since 2020.07.08
 *
 * @Q
 * 문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
 * 먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
 * 알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
 * 문자열의 시작과 끝은 공백이 아니다.
 * '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
 * 태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
 * 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.
 *
 * @input
 * 첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.
 *
 * @output
 * 첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.
 */
public class Q17413 {
    public static void main(String[] arg) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        Stack<String> stack = new Stack<>();

        boolean isTag = false;

        for(int i = 0 ; i < input.length(); i ++){
            char c  = input.charAt(i); // 태그인지 검사
            
            if(c == '<'){ // 태그 시작
                if(!stack.empty()){
                    String reverseStr = stackFullString(stack);
                    out.write(reverseStr);
                }

                isTag = true;
                out.write(c);
            }
            else if( c == '>'){
                out.write(c);
                isTag = false;
            }
            else {
                if(!isTag){ // 태그 아님
                    stack.push(c+"");
                }
                else {
                    out.write(c);
                }
            }
        }

        String reverseStr = stackFullString(stack);
        out.write(reverseStr);


        in.close();
        out.flush();
        out.close();
    }

    private static String stackFullString(Stack<String> stack) {
        String str = "";
        while (!stack.empty()) {
            str += stack.pop();
        }
        return str;
    }
}
    