package HongYun.Algorithm.SearchAlgorithm.InsertSearch;

import HongYun.Algorithm.SearchAlgorithm.DichotomisSearch.DichotomisSearch;

public class Test {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        InsertValueSearch insertSearch=new InsertValueSearch();
        System.out.println(insertSearch.search(arr,0,arr.length-1,7));
        DichotomisSearch dichotomisSearch=new DichotomisSearch();
        System.out.println(dichotomisSearch.search(arr,0,arr.length-1,7));
    }
}
