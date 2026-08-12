import java.util.*;
import java.lang.*;
import java.io.*;
public class CheckPalindrome {
   static String s="";
   static int n =0;
    public static boolean checkPalindrome(int i){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return checkPalindrome(i+1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        n =s.length();
        boolean result = checkPalindrome(0);
        System.out.println(result);
    }
}
