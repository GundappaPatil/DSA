package trees;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    TreeNode t;
    int x;

    Pair(TreeNode t, int x) {
        this.t = t;
        this.x = x;
    }
}
public class verticalTravers {

    public static ArrayList<ArrayList<Integer>> verticalTravers(TreeNode root){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

              ArrayList<Integer> ar = new ArrayList<>();
        if(root==null){
            return null;
        }

        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            int node = temp.t.data;
            int d = temp.x;
            ar = new ArrayList < Integer > ();
            if (hm.containsKey(d)) {
                ar = hm.get(d);
                ar.add(node);
            } else {
                ar.add(node);
            }

            hm.put(d, ar);
            if (temp.t.left != null) {
                q.add(new Pair(temp.t.left, d - 1));
            }
            if (temp.t.right != null) {
                q.add(new Pair(temp.t.right, d + 1));
            }
        }
        for (int x: hm.keySet()) {
            ArrayList < Integer > f = hm.get(x);
            ans.add(f);
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
        System.out.println(verticalTravers(t1));

    }
}

