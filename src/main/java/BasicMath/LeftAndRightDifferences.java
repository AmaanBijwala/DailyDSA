package BasicMath;

public class LeftAndRightDifferences {

        public int[] leftRightDifference(int[] nums) {
            int n=nums.length;
            if(n==1)
                return new int[]{0};
            int r[]=new int[n];
            int l[]=new int[n];
            l[0]=0;
            r[n-1]=0;
            int arr[]=new int[n];
            int c=1;
            for(int i=0;i<n-1;i++){
                l[c]=l[c-1]+nums[i];
                c++;
            }
            c=n-2;
            for(int i=n-1;i>0;i--){
                r[c]=r[c+1]+nums[i];
                c--;
            }
            for(int i=0;i<n;i++){
                arr[i]=Math.abs(l[i]-r[i]);
            }

            return arr;
        }
    }