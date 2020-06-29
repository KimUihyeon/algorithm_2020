package baekjoon.q11000;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q11655
 *
 * @author kuh
 * @since 2020.06.28
 *
 * @Q
 * ROT13은 카이사르 암호의 일종으로 영어 알파벳을 13글자씩 밀어서 만든다.
 * 예를 들어, "Baekjoon Online Judge"를 ROT13으로 암호화하면 "Onrxwbba Bayvar Whqtr"가 된다. ROT13으로 암호화한 내용을 원래 내용으로 바꾸려면 암호화한 문자열을 다시 ROT13하면 된다. 앞에서 암호화한 문자열 "Onrxwbba Bayvar Whqtr"에 다시 ROT13을 적용하면 "Baekjoon Online Judge"가 된다.
 * ROT13은 알파벳 대문자와 소문자에만 적용할 수 있다. 알파벳이 아닌 글자는 원래 글자 그대로 남아 있어야 한다. 예를 들어, "One is 1"을 ROT13으로 암호화하면 "Bar vf 1"이 된다.
 * 문자열이 주어졌을 때, "ROT13"으로 암호화한 다음 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문자열 S가 주어진다. S의 길이는 100을 넘지 않는다.
 *
 * @output
 * 첫째 줄에 S를 ROT13으로 암호화한 내용을 출력한다.
 */
public class Q11655 {

    private final static int NUMBER = 0;
    private final static int UPPER = 1;
    private final static int LOWER = 2;
    private final static int SPACE = 4;


    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        out.write(encryption(input));

        out.flush();
        out.close();
        in.close();
    }


    private static String encryption(String str){
        String encryptionString = "";
        for (int i = 0; i < str.length(); i++) {
            encryptionString += rot13(str.charAt(i));
        }
        return encryptionString;
    }

    private static char rot13(char c){
        int charType = charAnalysis(c);

        switch (charType){
            default:
            case NUMBER:
            case SPACE:{
                return c;
            }
            case UPPER:{
                return (char) (((c - 'A' + 13) % 26) + 'A');
            }
            case LOWER :{
                return (char) (((c - 'a' + 13) % 26) + 'a');
            }
        }
    }


    private static int charAnalysis(char c) {
        if (c >= 'A' && c <= 'Z') {
            return UPPER;
        } else if (c >= 'a' && c <= 'z') {
            return LOWER;
        } else if (c == ' ') {
            return SPACE;
        } else if (c >= '0' && c <= '9') {
            return NUMBER;
        }
        return -1;
    }

}
    