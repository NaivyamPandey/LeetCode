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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode parent = null;
        TreeNode trav = root;
        while(trav != null && trav.val != key){
            parent = trav;
            if(key < trav.val){
                trav = trav.left;
            }
            else{
                trav = trav.right;
            }
        }

        if(trav == null) return root;

        if(trav.left != null && trav.right != null){
            parent = trav;
            TreeNode pred = trav.left;
            while(pred.right != null){
                parent = pred;
                pred = pred.right;
            }
            trav.val = pred.val;
            if(pred == parent.left){
                parent.left = pred.left;
            }
            else if(pred == parent.right){
                parent.right = pred.left;
            }
        }
        else if(trav.left == null){
            if(trav == root){
                root = root.right;
            }
            else if(trav == parent.left){
                parent.left = trav.right;
            }
            else if(trav == parent.right){
                parent.right = trav.right;
            }
        }
        else if(trav.right == null){
            if(trav == root){
                root = root.left;
            }
            else if(trav == parent.left){
                parent.left = trav.left;
            }
            else if(trav == parent.right){
                parent.right = trav.left;
            }
        }
        return root;
    }
}