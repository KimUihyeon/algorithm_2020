package baekjoon.q16000;

import java.io.*;
import java.util.Scanner;

/**
 * 백준 알고리즘 Q16194
 *
 * @author kuh
 * @Q
 * @input
 * @output
 * @since 2020.07.02
 */
public class Q16194 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int num =  Integer.parseInt(in.readLine());
        String[] temp =  in.readLine().split(" ");
        int[] price = new int[temp.length];
        for(int i = 0 ; i < temp.length; i ++){
            price[i] = Integer.parseInt(temp[i]);
        }

        int[] dp = new int[num];
        dp[1] = price[0];

        for(int i = 0 ; i< dp.length ;i ++){

            
        }



        in.close();
        out.flush();
        out.close();

    }
}
    