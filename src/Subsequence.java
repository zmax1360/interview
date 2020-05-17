import java.util.*;
import java.util.stream.Collectors;

public class Subsequence {
    public static void main(String[] args) {
        List<Integer> array= Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer>  sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        System.out.println(isValidSubsequence(array,sequence));
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int sequenceSize = sequence.size();
        if(sequence== null ||sequenceSize ==0){
            return false;
        }
        if(array.size()<sequenceSize){
            return false;
        }
        HashMap<Integer,Integer> sequenceMap = new HashMap<>();
        sequence.stream().forEach( a->sequenceMap.put(a,a));
            for(int a:array){
                if(sequenceMap.containsKey(a)){
                    sequenceSize--;
                }
            }
            return sequenceSize==0?true:false;
    }
    public static int getNthFib(int n) {
        // Write your code here.


        if(n == 0){
            return 0;
        }
        int[] seq = new int[n];
        if(n == 1){
            return 1;
        }
        return getNthFib(n-1)+getNthFib(n-2);
    }
}
