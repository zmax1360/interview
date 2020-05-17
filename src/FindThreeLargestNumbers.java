public class FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] largestNumber = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for(int i:array){
            updateLargestNumber(largestNumber,i);
        }
        return largestNumber;
    }

    private static void updateLargestNumber(int[] largestNumber, int num) {
        if(num>largestNumber[2]){
            shiftleft(largestNumber,2,num);
        }else if (num>largestNumber[1]){
            shiftleft(largestNumber,1,num);
        }else if (num>largestNumber[0]){
            shiftleft(largestNumber,0,num);
        }
    }

    private static void shiftleft(int[] sorted, int index, int newNumber) {
       for(int i =0; i<=index;i++){
           if(i==index){
               sorted[i]=newNumber;
           }else{
               sorted[i]=sorted[i+1];
           }
       }


    }


}
