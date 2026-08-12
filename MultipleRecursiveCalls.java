import java.util.*;
import java.lang.*;
import java.io.*;
public class MultipleRecursiveCalls {
  public static int fibanocci(int n){
      if(n<=1){
          return n;
      }
      return fibanocci(n-1)+fibanocci(n-2);
  }

 public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println(fibanocci(n));
 }
}
