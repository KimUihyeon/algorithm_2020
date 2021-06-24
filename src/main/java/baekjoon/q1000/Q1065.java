package baekjoon.q1000;

import java.util.Scanner;

/**
 * 백준 알고리즘 Q1065
 *
 * @author kuh
 * @since 2020.06.18
 *
 * @Q
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * @output
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 *
 */
public class Q1065 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int case1 = sc.nextInt() + 1;
        int cnt = 0 ;

        for(int i= 1 ; i < case1 ; i++){
            if(IsHansu(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }


    public static boolean IsHansu(int num) {

        String number = String.valueOf(num);
        int prevAberration = Integer.MAX_VALUE;
        for (int i = 0; i < number.length() - 1; i++) {
            int currentAberration = (int) number.charAt(i) - (int) number.charAt(i + 1);
            if(prevAberration == Integer.MAX_VALUE){
                prevAberration = currentAberration;
            }

            if (currentAberration != prevAberration) {
                return false;
            }
            prevAberration = currentAberration;
        }

        return true;
    }
}
