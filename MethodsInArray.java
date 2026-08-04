import java.util.*;
import java.lang.*;
import java.io.*;

class Tuple implements Comparable<Tuple>{
       public int a,b;
        public Tuple(int a, int b){
            this.a=a;
            this.b=b;
        }

        @Override
        public String toString(){
            return a+" "+b;
        }

        @Override
        public int compareTo(Tuple o){
            if(this.b!=o.b){
                return this.b-o.b;
            } else {
                return this.a-o.a;
            }
        }

    }
public class MethodsInArray {

    public static void main(){
            Tuple [] arr = new Tuple[4];
            arr[0] = new Tuple(10, 11);
            arr[1] = new Tuple(20, 11);
            arr[2] = new Tuple(100, 5);
            arr[3] = new Tuple(5, 100);
         //   arr[4] = new Tuple(0, 0);
            Arrays.sort(arr);
            for(int i=0;i<4;i++){
                System.out.println(arr[i].toString());
            }
    }
}
