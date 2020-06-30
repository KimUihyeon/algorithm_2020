package baekjoon.q10000;

import java.io.*;
/**
 * 백준 알고리즘 Q10828
 *
 * @author kuh
 * @Q
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 다섯 가지이다.
 *
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *
 * @input
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * @output
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 *
 *
 * @since 2020.06.30
 */
public class Q10828 {
    private static BufferedWriter out;
    private static Stack stack;

    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(in.readLine());
        stack = new Stack(line);
        for (int i = 0; i < line; i++) {
            String[] input = in.readLine().split(" ");

            String command = input[0];
            int value = Integer.MIN_VALUE;
            if(input.length > 1){
                value  = Integer.parseInt(input[1]);
            }
            stackManager(command, value);
        }


        in.close();
        out.flush();
        out.close();
    }

    private static void stackManager(String commandStr, int value) throws IOException {
        String outputString = "";
        if ("empty".equals(commandStr)) {
            outputString = stack.isEmpty() + "";
        } else if ("size".equals(commandStr)) {
            outputString = stack.size() + "";
        } else if ("pop".equals(commandStr)) {
            outputString = stack.pop() + "";
        } else if ("push".equals(commandStr)) {
            stack.push(value);
        } else if ("top".equals(commandStr)) {
            outputString = stack.top() + "";
        } else {
            throw new IllegalArgumentException("잘못된 파라미터");
        }

        if(!outputString.isEmpty()){
            out.write(outputString);
            out.newLine();
        }
    }

    public static class Stack {
        private int[] arr;
        private int size;

        //push
        //pop
        //size
        //empty
        public Stack() {
            this.arr = new int[10];
            this.size = 0;
        }

        public Stack(int len) {
            this.arr = new int[len];
        }

        public int pop() {
            int value = top();
            if(value != -1){
                size--;
                if (size < 0) {
                    size = 0;
                }
            }
            return value;
        }

        public int size() {
            return this.size;
        }

        public int isEmpty() {
            return this.size < 1 ? 1 : 0;
        }

        public void push(int val) {
            if (arr.length < size) {
                int newLength = (int) (arr.length * 2);
                int[] tempArr = new int[newLength];
                for (int i = 0; i < this.size; i++) {
                    tempArr[i] = this.arr[i];
                }
                this.arr = tempArr;
            }
            this.arr[size] = val;
            this.size++;
        }

        public int top() {
            if (size < 1) {
                return -1;
            }
            int value = arr[size - 1];
            return value;
        }
    }
}
    