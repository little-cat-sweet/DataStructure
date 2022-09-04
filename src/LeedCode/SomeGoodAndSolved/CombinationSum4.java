package LeedCode.SomeGoodAndSolved;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-04-24 09
 */
public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        int [] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<target+1;i++){
            for(int value:nums){
                if(value<=i){
                    dp[i]+=dp[i-value];
                }
            }
        }
        return dp[target];
    }

}
