package baekjoon.q15000;


import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 백준 알고리즘 Q15552
 *
 * @author Kimuihyeon
 * @Q
 * @input
 * @output
 * @since 2020.06.26
 */
public class Q15552 {
    public static void main(String[] arg) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(input.readLine());

        for (int i = 0; i < testCase; i ++) {
            String[] inputs = input.readLine().split(" ");

            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            String sum = String.valueOf(a + b);

            output.write( sum);
            output.newLine();
        }
        output.flush();
        output.close();
    }
}
