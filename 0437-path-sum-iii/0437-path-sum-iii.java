class Solution {
    int ans =0;
    public int pathSum(TreeNode root, int targetSum) {
        traverse(root,(long)targetSum);
        return ans;
    }
    public void traverse(TreeNode root, long sum){
        if(root==null) return;
        ans +=check(root,sum);
        traverse(root.left,sum);
        traverse(root.right,sum);
    }
    public int check(TreeNode root, long sum){
        if(root==null) return 0;
        sum-=root.val;
        int c =0;
        if(sum==0) c++;
        c+=check(root.left,sum);
        c+=check(root.right,sum);
        return c;
    }

}