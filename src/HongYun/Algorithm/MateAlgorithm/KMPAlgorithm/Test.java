package HongYun.Algorithm.MateAlgorithm.KMPAlgorithm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        KMPAlgorithm kmpAlgorithm=new KMPAlgorithm();
        String original="长路漫漫，唯剑作伴";
        String target="作伴哇";
        System.out.println(kmpAlgorithm.KMPAlgorithm(original,target));
    }
}
