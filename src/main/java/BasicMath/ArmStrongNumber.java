package BasicMath;
/*
* You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
* */
public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    public static boolean isArmstrong(int n) {
        int dup=n;
        int len=String.valueOf(n).length();
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+= (int) Math.pow(ld,len);
            n/=10;
        }
        return dup==sum;
    }
}
