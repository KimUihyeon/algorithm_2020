package baekjoon.q2000;

import java.io.*;

/**
 * 백준 알고리즘 2869
 * https://www.acmicpc.net/problem/2869
 *
 * @author kuh
 * @Q 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 * @input 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 * 2 1 5
 * @output 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 * 4
 * @since 2021.06.26
 */

public class Q2869 {
    public static void main(String[] arg) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] inputs = in.readLine().split(" ");
            int A = Integer.parseInt(inputs[0]);
            int B = Integer.parseInt(inputs[1]);
            int V = Integer.parseInt(inputs[2]);

            double minWorkTime =(double)(V - A) / (double) (A - B);

            int realWorkTime = gauss(minWorkTime) + 1;


//            int day = ((V -A ) / deltaV) + 1;
//
//            while (true) {
//                day++;
//
//                V -= A;
//                if (V <=0)
//                    break;
//
//                V += B;
//            }

            out.write(String.valueOf(realWorkTime));
            out.write(System.lineSeparator());

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

    private static int gauss(double val){
        int val2 = (int)val;
        if(val == val2){
            return (int)val;
        }
        else {
            return (int)val + 1;
        }

    }
}