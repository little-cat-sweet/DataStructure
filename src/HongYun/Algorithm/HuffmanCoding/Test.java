package HongYun.Algorithm.HuffmanCoding;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HuffmanCoding huffmanCoding=new HuffmanCoding();
//        String str="长路漫漫，唯剑作伴。";
//        System.out.println(Arrays.toString(huffmanCoding.zip(str)));
//        System.out.println(huffmanCoding.getHuffmanCode());
        String str1="i like like like java do you like a java";
        byte[] bytes=huffmanCoding.zip(str1);
        String recover=huffmanCoding.decode(bytes);
        System.out.println(Arrays.toString(bytes));
        System.out.println(recover);
     }
}
