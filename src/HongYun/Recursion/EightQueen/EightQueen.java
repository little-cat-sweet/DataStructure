package HongYun.Recursion.EightQueen;
//Solve the eight queens's question.
public class EightQueen {
    //The i is the timeWatcher.
    public int i=0;
    int max=8;
    //Make a array to get the solution.
    int [] arr=new int [max];
    //Show the solutions.
    private void print(){
        for (int value : arr) {
            System.out.print(value + "");
        }
        System.out.println("");
    }
    //This is the underlying solution of eightQueen.
    private void check(int n){
        if(n==max){
           print();
           i=i+1;
        }else {
            for(int i=0;i<max;i++){
                //Putting the newQueen on the first line.
                arr[n]=i;
                if(judge(n)){
                    //If it does't make a despite.
                    check(n+1);
                }
            }
        }

    }
    //Get the time which is the check's work times.
    public int getTimes(){
        int j=0;
        j=i;
        return j;
    }
    //Check the newQueen is making a despite or not.
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            //arr[i]==arr[n]:Judge that whether the new is on the someone's line.
            //Math.abs(n-i)==Math.abs(arr[n]-arr[i]):Judge that whether the new is on the someone's slash.
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
