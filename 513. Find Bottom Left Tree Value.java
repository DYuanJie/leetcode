/**
Given a binary tree, find the leftmost value in the last row of the tree.
BFS算法
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int result = 0, height = 0;
    public int findBottomLeftValue(TreeNode root) {
        getBottomLeftValue(root, 1);
        return result;
    }
    
    private void getBottomLeftValue(TreeNode tn, int deep){
        if(height < deep){
            height = deep;
            result = tn.val;
        }
        if(tn.left != null){
            getBottomLeftValue(tn.left, deep + 1);
        }
        if(tn.right != null){
            getBottomLeftValue(tn.right, deep + 1);
        }
    }
}