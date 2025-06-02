package BasicMath;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int n) {
        int dup=n;
        int rev=0;
        while(n>0){
            int ld=n%10;
            n/=10;
            rev=(rev*10)+ld;
        }
        return rev==dup;
    }
}
