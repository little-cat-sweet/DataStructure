package HongYun.Algorithm.SortAlgorithm;

import HongYun.Algorithm.SortAlgorithm.ShellSortAlgorithm.ShellMoveMethodSortAlgorithm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] arr={45,2,3,45,54,34,65,65};
        ShellMoveMethodSortAlgorithm shellMoveMethodSortAlgorithm=new ShellMoveMethodSortAlgorithm();
        shellMoveMethodSortAlgorithm.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
