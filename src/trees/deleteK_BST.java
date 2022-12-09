package trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class deleteK_BST {
    Queue<Integer> q = new LinkedList<>();
    public  int[] printPreOrder(TreeNode A){
        preOrder(A);
        int N = q.size();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = q.element();
            q.remove();
        }
        return arr;
    }
    public  void preOrder(TreeNode root){
        if(root!=null){
            preOrder(root.left);
            q.offer(root.data);
            preOrder(root.right);
        }
    }
    public static TreeNode getMax(TreeNode root){
        while(root.right!=null){
            root = root.right;
        }
        return root;
    }
    public static boolean isLeaf(TreeNode root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }

    public static TreeNode deleteK(TreeNode root,int k){
        if(root==null){
            return null;
        } else if (root.data>k) {
            root.left =  deleteK(root.left,k);
        } else if (root.data<k) {
            root.right =  deleteK(root.right,k);
        }else{
            //Case 1:- when root==k
            if(isLeaf(root)){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            TreeNode maxNode = getMax(root.left);
            root.data = maxNode.data;
            root.left = deleteK(root.left,maxNode.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(20);
        t1.left = t2;
        t1.right = t3;
        t2.left = new TreeNode(2);
        TreeNode t4 = new TreeNode(7);
        t4.left = new TreeNode(6);
        t4.right = new TreeNode(8);
        t2.right = t4;
//        t3.left = new TreeNode(null);
        TreeNode t5 = new TreeNode(22);
        t3.right = t5;
        TreeNode t6 = new TreeNode(21);
        t5.left = t6;
        TreeNode t7 = new TreeNode(50);
        t5.right = t7;
        t7.left = new TreeNode(23);
        System.out.println(getMax(t1.left));
        System.out.println(isLeaf(t6));
        deleteK_BST pPre = new deleteK_BST();
        System.out.println(Arrays.toString(pPre.printPreOrder(t1)));
        System.out.println(deleteK(t1,22));
        System.out.println(Arrays.toString(pPre.printPreOrder(t1)));
    }
}
