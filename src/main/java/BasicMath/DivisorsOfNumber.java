package BasicMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DivisorsOfNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisors(44)));
    }
    public static int[] divisors(int n) {
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                l.add(i);
                if(i!=(n/i)){
                    l.add(n/i);
                }
            }
        }
        l.sort(null);
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
