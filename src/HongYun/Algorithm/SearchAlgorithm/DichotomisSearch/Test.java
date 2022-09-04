package HongYun.Algorithm.SearchAlgorithm.DichotomisSearch;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 34, 54, 65, 67, 67};
        DichotomisSearch dichotomisSearch = new DichotomisSearch();
        System.out.println(dichotomisSearch.search(arr, 0, arr.length - 1, 88));
        DichomisSearchUp dichomisSearchUp = new DichomisSearchUp();
        System.out.println(dichomisSearchUp.search(arr,0,arr.length-1,67));
    }
}