package util;

@FunctionalInterface
interface Functional{
    void loop(int index,Object data);
}

public class Util {

    public static void print(Object[][] arr, Functional function){
        for(int i = 0 ; i < arr.length; i++){
            print(arr, function);
        }
    }
    public static void print(Object[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            print(arr[i]);
            System.out.println("");
        }
    }

    public static void print(Object[]arr ,Functional functional){
        for(int i = 0 ; i < arr.length; i++){
            functional.loop(i, arr[i]);
        }
    }
    public static void print(Object[]arr){
        print(arr, (a,d)->{
            System.out.print(d + "\t");
        });
    }

}
