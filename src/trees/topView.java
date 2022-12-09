package trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class topView {
    public static ArrayList<Integer> solve(TreeNode A) {
        Queue<Pair> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        q.add(new Pair(A,0));

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){

                Pair num = q.poll();
                TreeNode Node = num.t;
                int Level = num.x;

                if(!hs.contains(Level)){
                    ans.add(Node.data);
                    hs.add(Level);
                }

                if(Node.left!=null){
                    q.add(new Pair(Node.left,Level-1));
                }


                if(Node.right!=null){
                    q.add(new Pair(Node.right,Level+1));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
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
        System.out.println(solve(t1));
    }
}
