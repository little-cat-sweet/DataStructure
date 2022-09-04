package HongYun.Algorithm.SortAlgorithm.QuickSortAlgorithm;
//This is the class which is to solve the QuickSortAlgorithm.
public class QuickSortAlgorithmUp {
    public void sort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        if(l>r){
            return;
        }
        int povit = arr[left];
        int temp = 0;
        while (l<r) {
            while (arr[r] >= povit && l<r) {
                r=r-1;
            }
            while (arr[l] <= povit && r>l) {
                l=l+1;
            }
            if(l<r){
                temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        arr[left]=arr[l];
        arr[l]=povit;

        sort(arr,left,r-1);
        sort(arr,l+1,right);
    }
}
