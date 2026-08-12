import java.lang.*;
import java.util.*;
import java.io.*;
public class SumFirstNNumbersRecursion {
   public static void parametarised(int i, int sum){
       if(i<1){
          System.out.println(sum);
          return;
       }
       parametarised(i-1,sum+i);
   }
   public static int functional(int i){
       if(i<1){
           return 0;
       }
       return i+functional(i-1);
   }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parametarised(n,0);
        int result = functional(n);
        System.out.println(result);
    }
}
