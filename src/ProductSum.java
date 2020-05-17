import java.util.*;

public class ProductSum {
    public static void main(String[] args) {
        List<Integer> sub1 = Arrays.asList(7,-1);
        List<Integer> sub3 = Arrays.asList(-13,8);
        List<Object> sub2 = Arrays.asList(6,sub3,4);
        List<Object> test= Arrays.asList(5,2,sub1,3,sub2);
        System.out.println(productSum(test));

    }
    public static int productSum(List<Object> array) {
        // Write your code here.

        return productSumHelper(array,1);
    }
    public static int productSumHelper(List<Object> array,int multiplier) {
        int sum =0;
        for(Object o :array){
            if(o instanceof List){
                @SuppressWarnings("unchecked")
                List<Object> ls=  (List<Object>) o;
                sum += productSumHelper(ls,multiplier+1);
            }else{
                sum +=(int)o;
            }

        }
        return sum*multiplier;
    }
}
