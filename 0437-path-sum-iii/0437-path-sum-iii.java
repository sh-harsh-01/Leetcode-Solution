class Solution {
    int ans =0;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> map = new HashMap<>();
        map.put(0L,1);
        solve(root,targetSum,map,0);
        return ans;
    }
    public void solve(TreeNode root, int tar,Map<Long,Integer> map,long curr){
        if(root==null) return;
        curr+=root.val;
        if(map.containsKey(curr-tar)) ans+=map.get(curr-tar);
        map.put(curr,map.getOrDefault(curr,0)+1);
        solve(root.left,tar,map,curr);
        solve(root.right,tar,map,curr);
        map.put(curr,map.get(curr)-1);
    }
}