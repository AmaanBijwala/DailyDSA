package BasicMath;
import java.util.*;
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        System.out.println(fact(N));
    }
    static int fact(int N){
      if(N==0)
          return 1;
      return N*fact(N-1);
    }
}
