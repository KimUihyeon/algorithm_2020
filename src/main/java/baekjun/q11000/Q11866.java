package baekjun.q11000;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 백준 알고리즘 Q11866
 *
 * @author Kimuihyeon
 * @since 2020.06.23
 *
 * @Q
 * 요세푸스 문제는 다음과 같다.
 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
 * 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
 * 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
 *
 * 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
 *
 * @input
 * 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 1,000)
 * 7 3
 *
 * @output
 * 예제와 같이 요세푸스 순열을 출력한다.
 * <3, 6, 2, 7, 5, 1, 4>
 *
 */
public class Q11866 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        Queue<Integer> s = new ArrayDeque<>();
        int count = 0;

        for(int i = 1 ; i <= n ; i++){
            arr[i-1] = i ;
        }

        while (arr.length != s.size()){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != -1) { // 미방문
                    if((count+1) % k == 0){
                        s.add(arr[i]);
                        arr[i] = -1; // 방문 표시
                    }
                    count++;
                }else {
                    continue;
                }
            }
        }
        print(s);
    }

    private static void print(Queue result){
        String str = "<";
        while (!result.isEmpty()){
            str+= result.poll();
            if(result.size() != 0){
                str+= ", ";
            }
        }
        str += ">";
        System.out.println(str);
    }
}