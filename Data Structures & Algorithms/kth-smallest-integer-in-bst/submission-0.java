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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> new1 = new ArrayList<>();
        inorder(new1,root);
        return new1.get(k-1);
    }
    public void inorder(ArrayList nums,TreeNode root){
        if(root==null){
            return;
        }
        inorder(nums,root.left);
        nums.add(root.val);
        inorder(nums,root.right);
    }
}
