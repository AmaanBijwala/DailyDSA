import java.util.*;
public class CountDigitsOfNumberUsingLog {
    public static void main(String[] args) {
        System.out.println(countDigit(4567));
    }
    public static int countDigit(int n) {
       return n==0?1:(int)Math.log10(n)+1;
    }
}
