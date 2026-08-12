import java.util.*;
import java.lang.*;
import java.io.*;
public class Recursion1{
    //time complexity O(infinite around 5000) and space is also O(infinite around 5000).
    public static void fn(){
        System.out.println(1);
        fn();
    }
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
        fn();
   }

}
