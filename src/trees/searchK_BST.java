package trees;

public class searchK_BST {
    public static boolean search(TreeNode root , int k){
        if(root == null){
            return false;
        }if(root.data == k){
            return true;
        }if(root.data>k){
            return search(root.left,k);
        }
        return search(root.right,k);

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
        System.out.println(search(t1,23));

    }
}
