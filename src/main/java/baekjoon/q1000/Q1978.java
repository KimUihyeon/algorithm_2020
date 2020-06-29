package baekjoon.q1000;

import util.Util;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘  Q1978
 *
 * @author kuh
 * @since 2020.06.28
 *
 *
 * @Q
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 *
 * @output
 * 주어진 수들 중 소수의 개수를 출력한다.
 */
public class Q1978 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(in.readLine());
        String[] inputs = in.readLine().split( " ");
        boolean[] sosu =  new boolean[1001];
        int sosuCount = 0;

        for (int i = 0; i < sosu.length; i++) {
            sosu[i] = true;
        }
        tenes(sosu);


        for(int i = 0 ; i < testCase ; i ++){
            int number = Integer.parseInt(inputs[i]);
            if(sosu[number]){
                sosuCount++;
            }
        }

        out.write(sosuCount + "");

        in.close();
        out.flush();
        out.close();
    }

    public static void tenes(boolean[] arr){
        arr[0] = arr[1] = false;
        for(int i = 2 ; i < arr.length ; i ++){
            if(!arr[i]){
                continue;
            }
            for(int j = i * i ; j < arr.length; j = j + i){
                arr[j] = false;
            }
        }
    }
}
    