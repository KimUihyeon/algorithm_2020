package baekjoon.q10000;

import java.io.*;

/**
 * @author kuh
 * @since 2021.06.23
 *
 *
 * @Q
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * @input입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 입력의 마지막에는 0 두 개가 들어온다.
 * 5
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 * 0 0
 *
 * @output
 * 2
 * 5
 * 7
 * 17
 * 7
 *
 */
public class Q10952 {
    public static void main(String[] arg){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            while(true){

                String[] readLines = in.readLine().split(" ");
                int x = Integer.parseInt(readLines[0]);
                int y = Integer.parseInt(readLines[1]);
                if (x == 0 && y == 0)
                    break;

                int sum = x + y ;
                out.write(String.valueOf(sum));
                out.write(System.lineSeparator());
            }


        }catch (Exception e){
        }finally {
            try{
                in.close();
                out.flush();
                out.close();
            }catch (IOException io){

            }
        }

    }
}