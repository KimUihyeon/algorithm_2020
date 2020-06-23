package baekjoon.q1000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q1157
 *
 * @author Kimuihyeon
 * @since 2020.06.19
 *
 * @Q
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 *
 * @input
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * Mississipi
 * zZa
 *
 * @output
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * ?
 * Z
 */
public class Q1157 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] alphabet = new int[26];

        int max = -1;
        char result = '?';

        for(int i = 0; i< input.length(); i++){
            int index = (int) toUpper(input.charAt(i)) - (int)'A';
            alphabet[index]++;
        }

        for(int i=0 ; i< alphabet.length ; i++){
            if(alphabet[i] > max){
                max = alphabet[i];
                result = (char) (i + (int)'A');
            }else if(max == alphabet[i]){
                result = '?';
            }
        }

        System.out.println(result);
    }

    private static char toUpper(char c){
        if( c <= 'z' && c>= 'a' ){
            return (char)(c - 32);
        }
        return c;
    }
}
