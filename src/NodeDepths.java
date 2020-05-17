import java.util.*;
public class NodeDepths {
    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        int sumDepth = 0;
        List<Level> stack = new ArrayList<>();

        stack.add(new Level(root,0) );
        while(stack.size()>0){
            Level top = stack.remove(stack.size()-1);
            BinaryTree node = top.root;
            int depth = top.depth;
            if(node == null) continue;
            sumDepth += depth;
            stack.add(new Level(node.left,depth+1) );
            stack.add(new Level(node.right,depth+1) );
        }
        return sumDepth;
    }

    static class Level{
        public BinaryTree root;
        public int depth;
        public Level(BinaryTree root,int depth){
            this.root = root;
            this.depth = depth;
        }
    }
    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
