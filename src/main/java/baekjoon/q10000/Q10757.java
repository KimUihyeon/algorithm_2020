package baekjoon.q10000;

import java.io.*;
public class Q10757 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String[] readLines = in.readLine().split(" ");
            String reversA = reversNumber(readLines[0]);
            String reversB = reversNumber(readLines[1]);
            int numberMaxLength = max(reversA.length(), reversB.length());
            String reversAnswer = "";

            boolean addOnce = false;

            for (int i = 0; i < numberMaxLength; i++){

                int moteA = charToInteger(extractNumber(reversA, i));
                int moteB = charToInteger(extractNumber(reversB, i));
                int moteSum = moteB + moteA;

                if(addOnce){
                    moteSum = moteSum + 1;
                    addOnce = false;
                }

                if(moteSum >= 10){
                    moteSum = moteSum -10;
                    addOnce = true;
                }

                reversAnswer += String.valueOf(moteSum);
            }

            if(addOnce){
                reversAnswer += String.valueOf(1);
            }

            out.write(reversNumber(reversAnswer));
            out.write(System.lineSeparator());
        }catch (IOException e){
        }finally {
            try{
                in.close();
                out.flush();
                out.close();
            }catch (IOException io){

            }
        }
    }

    public static int charToInteger(char i){
        return i - 48;
    }

    public static char extractNumber(String number, int index){
        if(number.length() > index){
            return number.charAt(index);
        }
        else {
            return String.valueOf(0).charAt(0);
        }
    }

    public static String reversNumber(String number){
        String revers = "";
        for(int i = number.length()-1 ; i >= 0; i--)
            revers += number.charAt(i);

        return revers;
    }

    public static int max(int num1, int num2) {
        return num1 < num2 ? num2 : num1;
    }
}