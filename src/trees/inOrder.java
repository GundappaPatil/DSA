package trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class inOrder {
    Queue<Integer> q = new LinkedList<>();
    public int[] printInOrder(TreeNode A){
        inOrder(A);
        int N = q.size();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = q.element();
            q.remove();
        }
        return arr;
    }
    public void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            q.offer(root.data);
            inOrder(root.right);
        }
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
        inOrder p = new inOrder();
        System.out.println(Arrays.toString(p.printInOrder(t1)));
    }
}
