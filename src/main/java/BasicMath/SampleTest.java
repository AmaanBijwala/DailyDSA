package BasicMath;

public class SampleTest {
    public static void main(String[] args)
    {
        int n=14;
        //String s=Integer.toBinaryString(n);
        String s="";
        while(n>0){
            int r=n%2;
            s=r+s;
            n/=2;
        }

        System.out.println(s);

        int ans=0;
        int power=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1')
                ans+=Math.pow(2,power);
            power++;
        }
        System.out.println("decode : "+ans);

    }



}

