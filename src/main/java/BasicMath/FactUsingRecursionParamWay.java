package BasicMath;
import java.util.*;
public class FactUsingRecursionParamWay {
    public static void main(String[] args) {
        int N=5;
        System.out.println(fact(N,1));
    }
    static int fact(int N,int i){
        if(N==0){
            return i;
        }
        return fact(N-1,N*i);
    }

}
