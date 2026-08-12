import java.util.*;
import java.lang.*;
import java.io.*;
public class Recursion2{
    static int cnt =0;
    //time complexity O(5) and space is also O(5).
    public static void fn(){
       if(cnt==4) {
           return;
       }
        System.out.println(cnt);
       cnt++;
        fn();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        fn();
    }

}
