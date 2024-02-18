package CodingPractice;

import javax.swing.tree.TreeCellRenderer;
import java.util.*;

public class LevelOrderTraversal {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public static void main(String args[]){

    }

    public static void ltrav(TreeNode root){
        if(root == null) return;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                if(queue.peek().left != null){

                }
            }
        }


    }

}
