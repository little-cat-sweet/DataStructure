package LeedCode.SomeGoodAndSolved;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-04-19 09
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        if(candidates.length==0){
            return res;
        }
        Deque<Integer> path=new ArrayDeque<>();
        dfs(candidates,res,target,path,0);
        return res;
    }
    public void dfs(int[] candidates,List<List<Integer>> res,int target,Deque<Integer> path,int begin){
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(path));
        }
        for(int i=begin;i<candidates.length;i++){
            path.addLast(candidates[i]);
            dfs(candidates,res,target-candidates[i],path,i);
            path.removeLast();
        }
    }
}
