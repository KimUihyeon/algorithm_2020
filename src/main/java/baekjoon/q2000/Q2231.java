package baekjoon.q2000;

import java.io.*;

/**
 * 백준 알고리즘 2231
 * https://www.acmicpc.net/problem/2231
 *
 * @author kuh
 * @Q 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 * @input 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 216
 * @output 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 198
 * @since 2021.06.30
 */

public class Q2231 {
    public static void main(String[] arg) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int inputNumber = Integer.parseInt(String.valueOf(in.readLine()));

            int result = 0;

            for(int i = 0 ; i < inputNumber; i ++){
                int constructorSum = decompositionSum(i);

                if(constructorSum == inputNumber){
                    result = i;
                    break;

            }
            }

            out.write(String.valueOf(result));

        } catch (Exception e) {
        } finally {
            try {
                in.close();
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int decompositionSum(int num) {

        int sum = num ;
        while (true) {
            int val = num % 10;
            if (num / 10 == 0) {
                sum += val;
                break;
            }

            num = num / 10;

            sum += val;
        }
        return sum;
    }

}