class Solution {
    int ans = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        solve(root);
        return ans;
    }

    public void solve(TreeNode root) {
        if (root == null)
            return;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null)
                ans += root.left.val;
        }
        solve(root.left);
        solve(root.right);
    }
}