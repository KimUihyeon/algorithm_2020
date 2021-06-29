package baekjoon.q10000;

import java.io.*;

/**
 * 백준 알고리즘 10870
 * https://www.acmicpc.net/problem/10870
 *
 * @author kuh
 * @since 2021.06.29
 *
 * @Q
 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 * 10
 *
 * @output
 * 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 * 55
 *
 */

public class Q10870 {
    public static void main(String[] arg){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));


        try{
            int input = Integer.parseInt(String.valueOf(in.readLine()));

            int[] fibonacci = getFibonacci(input);

            out.write(String.valueOf(fibonacci[input]));
            out.write(System.lineSeparator());
        }catch (Exception e){
        }finally {
            try {
                in.close();
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int[] getFibonacci(int size){
        int[] fibonacci = new int[size + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2 ; i < fibonacci.length ; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci;
    }
}