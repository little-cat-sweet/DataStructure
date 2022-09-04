package LeedCode;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-03-16 10
 */
public class Test1 {

    public int findSubstringInWraproundString(String p) {

        int[] dp = new int[26];
        int cur = 1;
        dp[p.charAt(0) - 'a'] = 1;
        for(int i = 1; i < p.length(); i ++){
            if((p.charAt(i) - p.charAt(i - 1) + 25) % 26 == 0){
                cur ++;
            }else{
                cur = 1;
            }
            dp[p.charAt(i) - 'a'] = Math.max(cur, dp[p.charAt(i) - 'a']);
        }
        int res = 0;
        for(int value : dp){
            res += value;
        }
        return res;
    }
}