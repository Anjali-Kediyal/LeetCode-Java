class Solution {
    
    Integer[][] dp = null;
    
    public int numRollsToTarget(int n, int k, int target) {
        dp = new Integer[n+1][target+1];
       return solve(n, k, target);
    }
    
    public int solve(int dice, int faces, int target){
        
        if(target<0 || dice<0)
            return 0;
        
        if(dice==0 && target==0){
            return 1;
        }
        
        if(dp[dice][target]!=null)
            return dp[dice][target];
        
        int ans = 0;
        for(int face=1; face<=faces; face++){
            ans = (ans + solve(dice-1, faces, target-face))%1000000007;
        }
        
        dp[dice][target] = ans;
        return ans;
    }    
}
