package HongYun.Algorithm.MateAlgorithm.ViolenceMateAlgorithm;
//This is the violenceMateAlgorithm.
public class ViolenceMateAlgorithm {
    public int violenceMateAlgorithm(String des,String target){
        char[] desArr=des.toCharArray();
        char[] targetArr=target.toCharArray();
        int desLength=desArr.length;
        int targetLength=targetArr.length;
        int i=0;
        boolean flag=false;
        while (i<=desLength-targetLength){
            int t=i;
            int t1=0;
            while (t1<targetLength){
                if(desArr[t]==targetArr[t1]){
                    t=t+1;
                    t1=t1+1;
                }else {
                    break;
                }
            }
            if(t1==targetLength){
                flag=true;
                break;
            }
            i=i+1;
        }
        if(flag){
            return i;
        }else {
            return -1;
        }


    }

}
