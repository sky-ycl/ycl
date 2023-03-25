package month03.week03.day05;

import node.treeNode.TreeNode;

public class Day05_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode node = new TreeNode(val);
        dfs(root, val, node);
        return root;
    }
    public void dfs(TreeNode root, int val, TreeNode node) {
        if (root.val < val) {
            if (root.right == null) {
                root.right = node;
                return;
            }
            dfs(root.right, val, node);
        }
        if (root.val > val) {
            if (root.left == null) {
                root.left = node;
                return;
            }
            dfs(root.left, val, node);
        }
    }
}