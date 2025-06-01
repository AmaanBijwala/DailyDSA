import  java.util.*;
public class CountDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println(countDigit(6));
    }
    public static int countDigit(int n) {
        if(n==0) return 1;
        int counter=0;
        while(n>0){
            n=n/10;
            counter++;
        }
        return counter;
    }
}
