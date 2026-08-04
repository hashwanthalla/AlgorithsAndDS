import java.lang.*;
import java.util.*;
import java.io.*;
public record Fibonocci() {

    public static int fibonocci(int n){
        if(n==1||n==2){
            return 1;
        } else {
            return fibonocci(n-1)+fibonocci(n-2);
        }


    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        } else{
            return n*factorial(n-1);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       for(int i=1;i<=100;i++){
        // System.out.println(i+" "+ fibonocci(i));
        System.out.println(i+" "+ factorial(i));
       }
    }
    
}
