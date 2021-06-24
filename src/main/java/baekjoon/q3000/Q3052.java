package baekjoon.q3000;

import java.io.*;

/**
 * 백준 알고리즘
 *
 * @author kuh
 * @since 2021.06.24
 *
 * @Q
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 * 142
 * 84
 * 252
 * 420
 * 840
 * 126
 * 42
 * 84
 * 420
 * 126
 *
 * @output
 * 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 * 1
 *
 */
public class Q3052 {
    public static void main(String[] arg){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int testCase = 10;
            int[] holder = new int[42];
            for(int i = 0 ; i < testCase; i ++){
                int x = Integer.parseInt(in.readLine());
                holder[x%42]++;
            }

            int count = differentRemainder(holder) + 1;

            out.write(String.valueOf(count));
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

    public static int differentRemainder(int[] arr){
        int count = -1;
        for(int i : arr){
            if(i != 0)
                count ++;
        }
        return count;
    }
}