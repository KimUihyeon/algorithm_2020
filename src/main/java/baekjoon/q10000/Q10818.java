package baekjoon.q10000;

import java.io.*;

/**
 * 백준 알고리즘 10818
 *
 * @author Kimuihyeon
 * @since 2021.06.24
 *
 * @Q
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 5
 * 20 10 35 30 7
 *
 * @output
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * 7 35
 *
 */
public class Q10818 {
    public static void main(String[] arg){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int testCase = Integer.parseInt(in.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            String[] inputs = in.readLine().split(" ");
            for (int i = 0; i < inputs.length; i++) {
                int x = Integer.parseInt(inputs[i]);
                if(x > max)
                    max = x;

                if(x < min)
                    min = x;
            }
            String result = min + " " + max;

            out.write(result);
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

}