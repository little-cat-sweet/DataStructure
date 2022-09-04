package HongYun.Algorithm.UniqueAlgorithm;

public class ELaSaiReAlgorithm {
    public static void main(String[] args) {
        ELaSaiReAlgorithm eLaSaiReAlgorithm=new ELaSaiReAlgorithm();
        System.out.println(eLaSaiReAlgorithm.countPrimes(10));
    }

    public int countPrimes(int n) {
        int[] arr = new int[n];
        int[] main=new int[n];
        for(int j=0;j<n;j++){
            main[j]=j+1;
        }

        for(int i=0;i<main.length;i++){
            if(main[i]!=0){
                if(isPrimes(main[i])){
                    int time=2;
                    if(main[i]==2){
                        int j=i+2;
                        while (j<main.length-1){
                            main[j]=0;
                            j=j+2;
                        }
                    } else {
                        while (i * time + 1 <= main.length - 1) {
                            main[i * time + 1] = 0;
                            time = time + 1;
                        }
                    }
                }else {
                    main[i]=0;
                }
            }
        }
        int result=0;
        for (int value : main) {
            if (value != 0) {
                result++;
            }
        }
        return result;

    }

    public boolean isPrimes(int n){
        if(n<2){
            return false;
        }else {
            for (int i=2;i<n-1;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
