import java.util.*;
import java.lang.*;
import java.io.*;
//print all subsequences --> contigious and non contigious and follows the order
//example : 3 1 2 --> subsequences empty, 3 , 1 , 2, 3 1, 1 2, 3 2, 3 1 2, not -->  3 2 1(no order followed)
public class RecursionOnSubsequences {
    static int[]a ;
    static int k =0;
    public static void subseq(int n, String res){
        if(n==k){
            System.out.println(res);
            return;
        }
        subseq(n+1,res+" "+ a[n]);
        subseq(n+1,res);
    }
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
      k = sc.nextInt();
     a=new int[]{1,2,3};
     String res = "";
        subseq(0,res);

 }
}
