import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] test = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(binarySearch(test,33));
    }
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        return binarySearchHelper(array,target,0,array.length-1);
    }
    public static int binarySearchHelper(int[] array, int target,int left,int right) {
        // Write your code here.
        if(left > right){
            return -1;
        }
        int mid = (left + right)/2;
       int pMatch = array[mid];
       if(target == pMatch){
           return mid;
       }else if(target<pMatch){
           return binarySearchHelper(array,target,left,mid-1);
       }else {
           return binarySearchHelper(array,target,mid+1,right);
       }
    }
}
