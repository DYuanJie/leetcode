/**
 * 637. Average of Levels in Binary Tree 
 * BFS
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 使用队列，先进先出，每一次循环都是tree的一层
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> trees = new LinkedList<TreeNode>();
        List<Double> result = new ArrayList<Double>();
        
        if(root == null) return result;
        trees.add(root);
        while(!trees.isEmpty()){
            double sum = 0.0;
            int num = trees.size();
        
            for(int i = 0; i < num; i++){
                TreeNode cTreeNode = trees.poll();
                sum += cTreeNode.val;
                if(cTreeNode.left != null) trees.offer(cTreeNode.left);
                if(cTreeNode.right != null) trees.offer(cTreeNode.right);
            }
            result.add(sum/num);
        }
        return result;
        
    }
}