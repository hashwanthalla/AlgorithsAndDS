import java.util.*;
import java.lang.*;
import java.io.*;

public class ProblemsOnFunctionalRecursion {
    static int[]a;
    public static void recursiveSwap(int l , int r){
         if(l>=r){
             return;
         }
         int temp = a[l];
         a[l] =a[r];
         a[r]=temp;
     recursiveSwap(l+1,r-1);
    }

    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      a= new int[]{1, 2, 3, 4, 5};
      recursiveSwap(0,a.length-1);
      System.out.println(Arrays.toString(a));
  }
}
