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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;    
        Queue<TreeNode> res = new LinkedList<>();
        int level = 0;
        res.offer(root);
        while(!res.isEmpty()) {
            int size =  res.size();
            for(int i=0;i<size;i++) {
                TreeNode node = res.poll();
                if(node.left!=null) res.offer(node.left);
                if(node.right!=null)res.offer(node.right);
            }
            level++;
        }
        return level;
    }
}