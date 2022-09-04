package HongYun.Algorithm.MateAlgorithm.KMPAlgorithm;
//This is the KMP Algorithm
public class KMPAlgorithm {
    public int KMPAlgorithm(String original,String target){
        return KMPAlgorithm(original,target,getMateTable(target));
    }
    public int KMPAlgorithm(String original,String target,int[] table){
        for(int i=0,j=0;i<original.length();i++){
            while (j>0&&original.charAt(i)!=target.charAt(j)){
                j=table[j-1];
            }
            if(original.charAt(i)==target.charAt(j)){
                j++;
            }
            if(j==target.length()){
                return i-j+1;
            }
        }
        return -1;
    }

    //Get the MateTable.
    public int[] getMateTable(String target){
        int [] table=new int[target.length()];
        table[0]=0;
        for(int i=1,j=0;i<target.length();i++){
            //This while is the core of KMPAlgorithm.
            while (j>0 && target.charAt(i)!=target.charAt(j)){
                j=table[j-1];
            }
            if(target.charAt(i)==target.charAt(j)){
                j++;
            }
            table[i]=j;
        }
        return table;
    }

}
