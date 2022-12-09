package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class leftView {
    public static ArrayList<Integer> levelOrder(TreeNode A) {
        if(A==null){
            return null;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(A);
        while(q.size()>0){
//            ArrayList<Integer> level = new ArrayList<>();
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                TreeNode temp = q.element();
                q.remove();
//                level.add(temp.data);
                if(temp.left!=null){
                    q.add(temp.left);
                }if(temp.right!=null){
                    q.add(temp.right);
                }
                if(i==0){
                    ans.add(temp.data);
                }
            }
//            ans.add(level);
        }
        return ans;
    }

    public static void main(String[] args) {

        Queue<TreeNode> q = new ArrayDeque<>();

        TreeNode t1 = new TreeNode(11);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(15);
        t1.left = t2;
        t1.right = t3;
        t2.left = new TreeNode(2);
        TreeNode t4 = new TreeNode(9);
        t4.left = new TreeNode(13);
        t2.right = t4;
        t3.left = new TreeNode(7);
        TreeNode t5 = new TreeNode(21);
        t3.right = t5;
        TreeNode t6 = new TreeNode(18);
        t5.left = t6;
        t6.left = new TreeNode(16);
        System.out.println(levelOrder(t1));
    }
}
