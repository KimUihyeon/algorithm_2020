package baekjoon.q1000;

import util.Util;

import java.io.*;

/**
 * 백준 알고리즘 Q1929
 *
 * @author Kimuihyeon
 * @since 2020.06.29
 *
 * @Q
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * @input
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 * @output
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
public class Q1929 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] sosu = new boolean[1000000 + 1];

        fill(sosu);
        tenes(sosu);

        String[] inputs = in.readLine().split(" ");
        int number1 = Integer.parseInt(inputs[0]);
        int number2 = Integer.parseInt(inputs[1]);

        print(sosu, number1, number2);

        out.flush();
        out.close();
        in.close();
    }

    public static void print(boolean[] sosu,int range1 , int range2){
        for(int i = range1 ; i <= range2; i ++){
            if(sosu[i]){
                System.out.println(i);
            }
        }
    }

    public static void fill(boolean[] sosu){
        for(int i = 0 ; i < sosu.length ; i++) {
            sosu[i] = true;
        }

    }

    public static void tenes(boolean[] sosu){
        sosu[0] = sosu[1] = false;
        for(int i = 2 ; i < sosu.length ; i++){
            if(sosu[i] == false){
                continue;
            }
            for (int j = i * 2; j < sosu.length; j = j + i) {
                if(sosu[j] == false){
                    continue;
                }
                sosu[j] = false;
            }
        }
    }
}
