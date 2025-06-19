package BasicMath;
import java.util.*;

public class ReverseAnArrayWithoutExtraSpace {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        reverse(a);
    }
    static void reverse(int[] a) {
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;end--;
        }
        printArray(a);
    }
    static void printArray(int [] a){
        for(int i:a) {
            System.out.println(i);
        }
    }
}
