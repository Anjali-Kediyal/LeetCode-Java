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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        /* BFS Approach */
        if(root==null) return null;
        if(depth==1){
            TreeNode node= new TreeNode(val);
            node.left=root;
            return node;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=1;
        while(!q.isEmpty()){
           int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                if(level==depth-1){
                    TreeNode tempL=cur.left;
                    TreeNode tempR=cur.right;
                    cur.left=new TreeNode(val,tempL,null);
                    cur.right=new TreeNode(val,null,tempR);
                }else{
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
                }
            }
            level++;
        }
        return root;
    }
}
