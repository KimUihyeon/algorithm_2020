package baekjoon.q9000;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/**
 * 백준 알고리즘 Q9012
 *
 * @author kuh
 * @Q
 * @input
 * @output
 * @since 2020.06.30
 */
public class Q9012 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(in.readLine());
        for(int i = 0 ; i < testCase ; i ++){
            String input = in.readLine();
            boolean isVps = vps(input);

            out.write(isVps ? "YES" : "NO");
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }

    private static boolean vps(String str){
        Stack<Character> cStack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i ++){
            char a = str.charAt(i);
            if(a == '('){
                cStack.push(a);
            }else {
                if(cStack.empty()){
                    return false;
                }
                cStack.pop();
            }
        }

        if(!cStack.empty()){
            return false;
        }
        else{
            return true;
        }
    }
}
    