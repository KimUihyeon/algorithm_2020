package baekjoon.q1000;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q1463
 *
 * @author kuh
 * @since 2020.07.02
 *
 * @Q
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 *
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 *
 * @input
 * 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
 *
 * @output
 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 */
public class Q1463 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(in.readLine());
        int count = 0 ;

        while(true){
            if(X == 1){
                break;
            }
            if(X%3 == 0){
                X /= 3;
            }
            else if(X%2 == 0){
                X /= 2;
            }
            else {
                X = X -1;
            }
            count++;
        }

        out.write(count + "");

        in.close();
        out.flush();
        out.close();

    }
}
    