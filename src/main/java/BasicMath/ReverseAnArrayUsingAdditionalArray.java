package BasicMath;
/*
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
*/
public class ReverseAnArrayUsingAdditionalArray {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int size=a.length;
        reverse(a,size);
    }
    static void reverse(int[] a,int size){
        int ans[]=new int[size];
        int j=0;
        for(int i=size-1;i>=0;i--){
            ans[j++]=a[i];
        }
        printArray(a);
    }
    static void printArray(int [] a){
        for(int i:a) {
            System.out.println(i);
        }
    }

}
