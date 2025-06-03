package BasicMath;

public class AddUsingRecursion {
    public static void main(String[] args) {
        System.out.println(NnumbersSum(5));
    }
    public static int NnumbersSum(int n) {
        if(n<0)
            return 0;
        return n+NnumbersSum(n-1);
    }
}
