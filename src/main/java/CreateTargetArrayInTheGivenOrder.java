import java.util.LinkedList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        printArray(createTargetArray(nums,index));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n=index.length;
        List<Integer> l=new LinkedList<>();
        int [] target=new int[n];
        for(int i=0;i<n;i++){
            l.add(index[i],nums[i]);
        }
        for(int i=0;i<n;i++){
            target[i]=l.get(i);
        }
        return target;
    }

    public static void printArray(int[] result){
        for(int i: result){
            System.out.print(i+" ");
        }
    }

}
/*
1389. Create Target Array in the Given Order

Given two arrays of integers nums and index. Your task is to create target array under the following rules:
Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
It is guaranteed that the insertion operations will be valid.


Example 1:
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]

Example 2:
Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]

Example 3:
Input: nums = [1], index = [0]
Output: [1]


Constraints:
1 <= nums.length, index.length <= 100
nums.length == index.length
0 <= nums[i] <= 100
0 <= index[i] <= i
 */