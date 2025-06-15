package BasicMath;

import java.util.HashMap;
import java.util.Map;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 0, 0, 7};
        process(a);
    }
    static void process(int[] a){
        int c=0;
        for(int i:a){
            if(i!=0){
                a[c++]=i;
            }
        }
        while(c<a.length){
            a[c++]=0;
        }
        printArray(a);
    }
    static void printArray(int a[]){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
