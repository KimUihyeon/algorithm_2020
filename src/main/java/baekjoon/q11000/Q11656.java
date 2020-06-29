package baekjoon.q11000;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q11656
 *
 * @author kuh
 * @since 2020.06.27
 *
 * @Q
 * 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
 *
 * baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
 *
 * 문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.
 *
 *
 * @input
 * 첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000보다 작거나 같다.
 *
 * @output
 * 첫째 줄부터 S의 접미사를 사전순으로 한 줄에 하나씩 출력한다.
 */
public class Q11656 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String input =in.readLine();
        String[] suffix = new String[input.length()];

        for(int i = 0 ; i < input.length() ; i++){
            suffix[i] = getSuffix(input , i);
        }


        selection_sort(suffix);

        for(int i = 0 ; i < input.length() ; i++){
            out.write(suffix[i]);
            out.newLine();
        }


        in.close();
        out.flush();
        out.close();
    }

    private static String getSuffix(String str ,int startIndex){
        String suffix = "";

        for(int j = startIndex ; j < str.length() ; j ++){
            suffix += str.charAt(j);
        }
        return suffix;
    }

    private static void selection_sort(String[] arr){
        int minIdx = -1 ;
        String minValue = "";
        for(int i = 0 ; i < arr.length-1 ; i ++){
            minValue = arr[i];
            minIdx = i;

            for(int j = i ; j < arr.length; j ++ ){
                if( minValue.compareTo(arr[j]) > 0){
                    minIdx = j;
                    minValue = arr[j];
                }
            }
            swap(arr , i , minIdx);
        }

    }

    private static void swap(String[] arr , int idx1 , int idx2){
        String temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
    