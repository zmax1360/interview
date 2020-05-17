public class ProgramBST {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBstHelper(tree,target,Integer.MAX_VALUE);
    }

    private static int findClosestValueInBstHelper(BST tree, int target, int closest) {
        if (Math.abs(target - closest) > Math.abs(tree.value - closest)){
            closest = tree.value;
        }if (target <tree.value && tree.left!=null){
            return findClosestValueInBstHelper(tree.left,target,closest);
        }else if (target >tree.value&& tree.right!=null){
            return findClosestValueInBstHelper(tree.right,target,closest);
        }else
            return closest;
    }
    static class BST {
        public int value;
        public BST left;
        public BST right;
        public BST(int value) {
            this.value = value;
        }
    }
}
