import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] array= {12,3,1, 2, -6, 5, -8, 6};
        List<Integer[]> res= threeNumberSum(array,0);
        res.stream().forEach(a -> Arrays.stream(a).forEach(b->System.out.println(b)));
    }
//    public static int[] twoNumberSum(int[] array, int targetSum) {
//        // Write your code here.
//        HashMap<Integer,Integer> arrayMap = new HashMap<>();
//        int[] result = new int[2];
//        for(int a: array){
//            if(arrayMap.get(targetSum - a)!=null){
//                result[0]=a;
//                result[1]=targetSum - a;
//            }else{
//                arrayMap.put(a,a);
//            }
//        }
//        return result;
//    }
public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
    HashMap<Integer,Integer> arrayMap = new HashMap<>();
    ArrayList<Integer[]> result =new ArrayList();
    for (int i = 0; i < array.length - 2; i++) {
        int curr_sum = targetSum - array[i];
        for(int j = i+1;j<array.length;j++){
            if(arrayMap.containsKey(curr_sum-array[j])){
                Integer[] threeNumber = new Integer[3];
                threeNumber[0] =array[i];
                threeNumber[1]= array[j];
                threeNumber[2]= curr_sum-array[j];
                result.add(threeNumber);

            }else {
                arrayMap.put(array[j],array[j]);
            }
        }

    }
        return result;
    }



}
