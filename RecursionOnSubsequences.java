import java.util.*;
import java.lang.*;
import java.io.*;
//print all subsequences --> contigious and non contigious and follows the order
//example : 3 1 2 --> subsequences empty, 3 , 1 , 2, 3 1, 1 2, 3 2, 3 1 2, not -->  3 2 1(no order followed)
//time complexity is 2 power n and space complexity is o(n)(stack of n size everytime)
public class RecursionOnSubsequences {
    static int[]a ;
    static int k =0;
    static int sum =0;
    public static void subseq(int n, String res,int localSum){
        if(n==k){
            if(localSum == sum) {
                System.out.println(res);
            }
            return;
        }
        subseq(n+1,res+" "+ a[n],localSum+a[n]);
        subseq(n+1,res, localSum);
    }
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
      k = sc.nextInt();
      sum=sc.nextInt();
     a=new int[]{1,2,3};
     String res = "";
        subseq(0,res,0);

 }
}
