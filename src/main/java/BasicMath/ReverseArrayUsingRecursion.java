package BasicMath;
import java.util.*;
public class ReverseArrayUsingRecursion {

    public static void main(String[] args) {
        int a []={5,4,3,2,1};
        reverseArray(a,0,a.length-1);
        printArray(a);
    }
    static void reverseArray(int[] a,int start ,int end){
        if(start>end){
            return;}
        int temp=a[end];
        a[end]=a[start];
        a[start]=temp;
        reverseArray(a,start+1,end-1);
    }
    static void printArray(int [] a){
        for(int i:a) {
            System.out.println(i);
        }
    }

}
