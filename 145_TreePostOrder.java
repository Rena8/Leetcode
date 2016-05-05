/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreePostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        if(root == null) return result;
    
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
    
        while(!stack.isEmpty()){
            root = stack.pop();
            result.addFirst(root.val);
            if(root.left != null){
                stack.push(root.left);
            }
            if(root.right != null){
                stack.push(root.right);
            }
        }
    
        return result;   
        }
}

