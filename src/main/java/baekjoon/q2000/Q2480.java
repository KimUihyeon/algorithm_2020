package baekjoon.q2000;

import java.util.Scanner;

/**
 * @author kuh
 * @since 2020.06.25
 *
 * @Q
 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 *
 * 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)*1,000원의 상금을 받게 된다.
 * 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)*100원의 상금을 받게 된다.
 * 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)*100원의 상금을 받게 된다.
 * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3*100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2*1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6*100으로 계산되어 600원을 상금으로 받게 된다.
 *
 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 *
 * @input
 *
 * @output
 */
public class Q2480 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int testCase = 3;
        int[] dice = new int[6];

        int diceValue = -1;
        int prizeCase = -1;  // 1 , 2, 3

        for(int i = 0 ; i < testCase; i ++){
            int current = sc.nextInt();
            dice[current-1] ++;
        }

        for(int i = 0 ; i< dice.length ; i++){
            int countingDice = dice[i];
            if( countingDice == 1 ){
                diceValue = i +1 ;
                prizeCase = countingDice;
            }
            else if( countingDice == 2 || countingDice == 3){
                diceValue = i +1;
                prizeCase = countingDice;
                break;
            }
        }

        prizeMoney(prizeCase, diceValue);
    }

    private static void prizeMoney(int prizeCase, int value){
        int money = 0;
        switch (prizeCase){
            default:
            case 1 :{
                money = value * 100;
                break;
            }
            case 2: {
                money = value * 100 + 1000;
                break;
            }
            case 3: {
                money = value * 1000 + 10000;
                break;
            }
        }

        System.out.println(money);
    }

}
