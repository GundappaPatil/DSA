package trees;

import java.util.Stack;

public class inorderIterative {
    public static void inOrderIterative(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || st.size()>0){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }else{
                TreeNode temp = st.peek();
                st.pop();
                System.out.print(temp.data+",");
                curr = temp.right;
            }
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

        inOrderIterative(t1);
    }
}
