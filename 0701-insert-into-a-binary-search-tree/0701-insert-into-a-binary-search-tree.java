/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root == null){
            root = newNode;
            return root;
        }
        TreeNode trav = root;
        while(true){
            if(val < trav.val){
                if(trav.left == null){
                    trav.left = newNode;
                    break;
                }
                trav = trav.left;
            }
            else if(val > trav.val){
                if(trav.right == null){
                    trav.right = newNode;
                    break;
                }
                trav = trav.right;
            }
        }
        return root;
    }
}