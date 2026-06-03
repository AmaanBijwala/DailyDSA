package BasicMath;
import java.util.*;
public class AdjacentIncreasingSubarraysDetectionI {
    public static void main(String[] args)
    {
        List<Integer> nums=Arrays.asList(2,5,7,8,9,2,3,4,3,1); int k=3;
        System.out.println(hasIncreasingSubarrays(nums, k));
    }

        public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
            int n=nums.size();
            for(int i=0;i<=n-2*k;i++){
                boolean firstInc=true;
                boolean secondInc=true;
                for(int j=i;j<i+k-1;j++){
                    if(nums.get(j)>=nums.get(j+1)){
                        firstInc=false;
                        break;
                    }
                }
                for(int j=i+k;j<i+2*k-1 && firstInc;j++){
                    if(nums.get(j)>=nums.get(j+1)){
                        secondInc=false;
                        break;
                    }
                }
                if(firstInc && secondInc)
                    return true;
            }
            return false;
        }



}


/*
258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0

Constraints:
0 <= num <= 231 - 1
Follow up: Could you do it without any loop/recursion in O(1) runtime?
 */