import java.util.ArrayList;
import java.util.List;

public class BranchSumProgram {
    public static void main(String[] args) {
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(4);
        BinaryTree node5 = new BinaryTree(5);
        BinaryTree node6 = new BinaryTree(6);
        BinaryTree node7 = new BinaryTree(7);
        BinaryTree node8 = new BinaryTree(8);
        BinaryTree node9 = new BinaryTree(9);
        BinaryTree node10 = new BinaryTree(10);
        node1.right = node3;node1.left=node2;
        node2.left = node4;node2.right=node5;
        node3.left = node6;node3.right=node7;
        node4.left = node8;node4.right=node9;
        node5.left = node10;node5.right=null;
        ;
        branchSums(node1).stream().forEach(a-> System.out.print(a));
    }
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> sums = new ArrayList<>();
         calculateBranchSums(root, 0, sums);
        return sums;
    }
    public static void calculateBranchSums(BinaryTree root,int runningSum, List<Integer> sums){
       int newRunningSum = runningSum + root.value;
        if(root.left==null && root.right==null){
            sums.add(newRunningSum);
            return;
        }
        calculateBranchSums(root.left,newRunningSum,sums);
        calculateBranchSums(root.right,newRunningSum,sums);
    }
}
