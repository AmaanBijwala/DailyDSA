package BasicMath;

public class GCD_HDF {
    public static void main(String[] args) {
        System.out.println(GCD(33,11));
    }
    public static int GCD(int n1, int n2) {
        while(n1>0 && n2>0){
            if(n1>n2) n1=n1%n2;
            else n2=n2%n1;
        }
        if(n1==0) return n2;
        return n1;
    }
}
