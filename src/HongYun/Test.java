package HongYun;

import HongYun.Algorithm.SortAlgorithm.MergeSortAlgorithm.MergeSortAlgorithm;
import HongYun.Algorithm.SortAlgorithm.PileSortAlgorithm.PileSortAlgorithm;
import HongYun.Algorithm.SortAlgorithm.QuickSortAlgorithm.QuickSortAlgorithmUp;
import HongYun.Algorithm.SortAlgorithm.RadixSortAlgorithm.RadixSortAlgorithm;
import HongYun.Algorithm.SortAlgorithm.RadixSortAlgorithm.RadixSortAlgorithmUp;
import HongYun.Algorithm.SortAlgorithm.ShellSortAlgorithm.ShellMoveMethodSortAlgorithm;
import HongYun.BinarySearchTree.Node;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 这个是测试总类
 */
public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.test());

    }
    public boolean test(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==3){
                return false;
            }
        }
        return true;
    }
}


