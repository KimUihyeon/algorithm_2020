package util;

public class Util {
    public static void print(int[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            print(arr[i]);
            System.out.println("");
        }
    }

    public static void print(int[]arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
