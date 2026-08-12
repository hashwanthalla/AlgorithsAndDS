import java.util.*;
import java.lang.*;
import java.io.*;

public class ProblemsOnFunctionalRecursion {
    static int[]a;
    static int n=0 ;
    public static void recursiveSwap(int i){
         if(i>=n/2){
             return;
         }
         int temp = a[i];
         a[i] =a[n-i-1];
         a[n-i-1]=temp;
     recursiveSwap(i+1);
    }

    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      a= new int[]{1, 2, 3, 4, 5};
      n=a.length;
      recursiveSwap(0);
      System.out.println(Arrays.toString(a));
  }
}
