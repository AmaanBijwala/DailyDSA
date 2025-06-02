package BasicMath;

/*
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

*/
public class ReverseANumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(4567));
    }


        public static int reverseNumber(int n) {
            int rev=0;
            while(n>0){
                int ld=n%10;
                n/=10;
                rev=(rev*10)+ld;
            }
            return rev;
        }

}
