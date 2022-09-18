public class MaximumScorefromPerformingMultiplicationOperations {
    int n,m;
    public int maximumScore(int[] nums, int[] multipliers) {
        n= nums.length;
        m=multipliers.length;
        int l=0;
        int r=n-1;
        int index=0;
        return new MaximumScorefromPerformingMultiplicationOperations().helper(nums,multipliers,l,index,new Integer[n][m]);
    }

    private int helper(int[] nums, int[] multipliers, int l,int index,Integer[][]dp) {
        int r=l-1-(index-l);
        if(index>=m){
            return 0;
        }
        if (dp[l][index] != null) return dp[l][index];
        int x=multipliers[index];
        int res = Math.max(
                nums[l] * multipliers[index] + helper(nums, multipliers, l+1, index+1, dp),
                nums[r] * multipliers[index] + helper(nums, multipliers, l, index+1, dp));

        dp[l][index] = res;
        return res;
    }
}
/*
class Solution {
    int N, M;
    public int maximumScore(int[] nums, int[] multipliers) {
        N = nums.length;
        M = multipliers.length;
	    return helper(nums, multipliers, 0, 0, new Integer[M][M]);
    }

    private int helper(int[] nums, int[] multipliers, int left, int index, Integer[][] dp) {
	    int right = N - 1 - (index - left);
	    if (index == M) return 0;

	    if (dp[left][index] != null) return dp[left][index];

	    int res = Math.max(
            nums[left] * multipliers[index] + helper(nums, multipliers, left+1, index+1, dp),
            nums[right] * multipliers[index] + helper(nums, multipliers, left, index+1, dp));

        dp[left][index] = res;
	    return res;
    }
}
*/
