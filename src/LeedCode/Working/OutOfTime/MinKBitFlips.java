package LeedCode.Working.OutOfTime;

//995
public class MinKBitFlips {
    public int minKBitFlips(int[] A, int K) {
        boolean flag=true;
        int count=0;

        for(int i=0;i<A.length-(K-1);i++){
            if(A[i]==0){
                flip(A,i,K);
                count++;
            }
        }
        for (int value : A) {
            if (value == 0) {
                flag = false;
                break;
            }
        }
        if(flag){
            return count;
        }else {
            return -1;
        }

    }
    public void flip(int[] arr,int location,int time){
        for(int i=0;i<time;i++){
            if(arr[location+i]==0){
                arr[location+i]=1;
            }else {
                arr[location+i]=0;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={0,0,1};
        MinKBitFlips minKBitFlips=new MinKBitFlips();
        minKBitFlips.flip(arr,0,3);
        int [] test={0,1,0};

        System.out.println(minKBitFlips.minKBitFlips(test,1));
    }
}
