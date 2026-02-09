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
    class Pair {
    TreeNode node;
    int hd;
    int level; 
    Pair(TreeNode n, int h,int l) {
        node = n;
        hd = h;
        level = l;
    }
}
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0,0));
        while(!q.isEmpty()) {
            Pair p = q.poll();
            TreeNode curr = p.node;
            int hd = p.hd;
            int level = p.level;
            if(!map.containsKey(hd)) {
                map.put(hd, new TreeMap<>());
            }
            if(!map.get(hd).containsKey(level)) {
                map.get(hd).put(level, new PriorityQueue<>());
            }
            map.get(hd).get(level).offer(curr.val);
            if(curr.left!=null) q.offer(new Pair(curr.left,hd-1,level+1));
            if(curr.right!=null) q.offer(new Pair(curr.right,hd+1,level+1));
        }
        for(TreeMap<Integer, PriorityQueue<Integer>> level : map.values()) {
            List<Integer> list = new ArrayList<>();
            for(PriorityQueue<Integer> nodes : level.values()) {
                while(!nodes.isEmpty()) {
                list.add(nodes.poll());
                }
            }
            res.add(list);
        }
        return res;
    }
}