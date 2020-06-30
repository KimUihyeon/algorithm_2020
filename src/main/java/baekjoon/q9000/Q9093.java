package baekjoon.q9000;

import java.io.*;

/**
 * 백준 알고리즘 Q9093
 *
 * @author kuh
 * @since 2020.06.30
 *
 * @Q
 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 *
 * @input
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
 *
 * @output
 * 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
 *
 *
 */
public class Q9093 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(in.readLine());
        for(int i = 0 ; i < line ;i ++){
            String str = in.readLine();
            String[] units = split(str , ' ');

            String result = "";
            for(int j = 0 ; j < units.length; j ++){
                result += reverse(units[j]) + ' ';
            }
            out.write(result);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }

    private static String reverse(String val){
        String temp = "";
        for(int i = val.length()-1 ; i >=0 ; i --){
            temp += val.charAt(i);
        }
        return temp;
    }

    public static String[] split(String val , char splitor){
        String[] tempArr = new String[val.length()];
        String temp = "";
        int idx = 0;

        for(int i = 0 ; i < val.length() ; i ++){
            char c = val.charAt(i);

            if(c != splitor){
                temp += c;
            }

            if((c == splitor || i == val.length()-1 ) // 스플릿터를 만나거나 글이 끝났을때
                    && !temp.isEmpty() ){

                tempArr[idx] = temp;
                idx++;
                temp = "";
            }
        }

        String[] returnArr = new String[idx];
        for (int i = 0; i < idx; i++) {
            returnArr[i] = tempArr[i];
        }

        return returnArr;
    }
}
    