package LeedCode.SomeGoodAndSolved;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-04-15 09
 */
public class DpExample {
    //213
    public int rob(int[] nums) {
        if(nums.length<=3){
            int max=0;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        int [] dp1=new int[nums.length+1];
        int j=1;
        for(int i=1;i<nums.length;i++){
            dp1[j+1]=Math.max(dp1[j],dp1[j-1]+nums[i]);
            j++;
        }
        int [] dp2=new int[nums.length];
        int poke=1;
        dp2[1]=nums[0];
        for(int i=1;i<nums.length-1;i++){
            dp2[poke+1]=Math.max(dp2[poke],dp2[poke-1]+nums[i]);
            poke++;
        }
        return Math.max(dp1[dp1.length-1],dp2[dp2.length-1]);
    }
}
