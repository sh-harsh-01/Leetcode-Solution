class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(root, targetSum, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> ans) {
        if (root == null) return;
        sum -= root.val;
        temp.add(root.val);

        if(sum==0 && root.left==null && root.right == null){
            ans.add(new ArrayList<>(temp));
        }

        solve(root.left,sum,temp,ans);
        solve(root.right,sum,temp,ans);
        temp.remove(temp.size()-1);
    }
}