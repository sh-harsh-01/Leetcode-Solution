class Solution {
    int [][]dp = new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        String t = new StringBuilder(s).reverse().toString();
        for(int i=0;i<1001;i++)
        Arrays.fill(dp[i],-1);
        return solve(s,t,0,0);
    }
    public int solve(String s, String t, int i,int j){
        if(i>=s.length() || j>= t.length()) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]= 1+solve(s,t,i+1,j+1);
        }
        else{
            return dp[i][j]=Math.max(solve(s,t,i+1,j),solve(s,t,i,j+1));
        }
    }
}