class Solution {
    public int maxProfit(int k, int[] prices) {
        int [][][] dp = new int [prices.length+1][2][k+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(0,1,k,prices,dp);
    }
    public int solve(int i, int buy, int cap,int []prices,int [][][]dp){
        if(i>=prices.length || cap ==0) return 0;

        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];
        int profit =0;
        if(buy == 1 ){
            profit = Math.max(-prices[i]+solve(i+1,0,cap,prices,dp),solve(i+1,1,cap,prices,dp));
        }else{
            profit = Math.max(prices[i]+solve(i+1,1,cap-1,prices,dp),solve(i+1,0,cap,prices,dp));
        }
        return dp[i][buy][cap] = profit;
    }
}