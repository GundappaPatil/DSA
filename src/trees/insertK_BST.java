package trees;

public class insertK_BST {
    public static TreeNode insert(TreeNode root , int k){
        if(root==null){
            return new TreeNode(k);
        }
        if(root.data>k){
            root.left = insert(root.left,k);
        }else{
            root.right = insert(root.right,k);
        }
        System.out.println(root.data);
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
        System.out.println(insert(t1,9));
    }
}
