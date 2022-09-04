package LeedCode.SomeGoodAndSolved;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-04-18 09
 */
public class RemoveDuplicates {
    //26
    public int removeDuplicates(int[] nums) {
        int r=0;
        int l=0;
        while (r<=nums.length-1){
            if (nums[r] != nums[l]) {
                nums[l + 1] = nums[r];
                l++;
            }
            r++;
        }
        return l+1;
    }
}
