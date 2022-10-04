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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(null == root){
            return false;
        }
        
        targetSum = targetSum - root.val;
        
        if(null == root.left && null == root.right && targetSum == 0){
            return true;
        }else{
            return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        }
    }
}
