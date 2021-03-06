package baekjoon.q10000;

import java.io.*;

/**
 * @author kuh
 * @since 2021.06.21
 *
 *
 * @Q
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 5
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 *
 * @output
 * 2
 * 5
 * 7
 * 17
 * 7
 *
 */
public class Q10950 {
    public static void main(String[] arg){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int testCase = Integer.parseInt(in.readLine());

            for(int i = 0 ; i < testCase ; i++){
                String[] readLines = in.readLine().split(" ");
                int x = Integer.parseInt(readLines[0]);
                int y = Integer.parseInt(readLines[1]);

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