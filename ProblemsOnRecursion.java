import java.util.*;
import java.lang.*;
import java.io.*;

public class ProblemsOnRecursion {

    //time complexity O(n) and space complexity O(n).
    public static void printNameNtimes(int i, int n){
    if(i>n){
        return;
    }
    System.out.println("Hashwanth Alla");
    printNameNtimes(i+1,n);
  }
    //time complexity O(n) and space complexity O(n).
  public static void printLinearlyFrom1ToN(int i, int n){
      if(i>n){
          return;
      }
      System.out.println(i);
      printLinearlyFrom1ToN(i+1,n);
  }

    //time complexity O(n) and space complexity O(n).
  public static void printLineralyFromNto1(int n){
    if(n==0){
        return ;
    }
    System.out.println(n);
      printLineralyFromNto1(n-1);
  }

    //time complexity O(n) and space complexity O(n).
  public static void backtrack1toN(int n){
      if(n==0){
          return;
      }
      backtrack1toN(n-1);
      System.out.println(n);
  }
    //time complexity O(n) and space complexity O(n).
  public static void backtrackNto1(int i, int n){
        if(i>n){
            return;
        }
        backtrackNto1(i+1,n);
        System.out.println(i);
  }

 public static void main(){
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
     //print name n times using recursion
     printNameNtimes(1,n);
     //print linearly from 1 to n using recursion
     printLinearlyFrom1ToN(1,n);
     //print linearly from n to 1 using recursion
     printLineralyFromNto1(n);
     //print linearly from 1 to n using backtracking
     backtrack1toN(n);
     //print linearly from n to 1 using backtracking
     backtrackNto1(1,n);
 }
}
