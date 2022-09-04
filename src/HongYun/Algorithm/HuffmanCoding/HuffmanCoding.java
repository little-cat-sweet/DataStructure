package HongYun.Algorithm.HuffmanCoding;

import java.util.*;

public class HuffmanCoding {
    public Node getRoot() {
        return root;
    }
    //It is the str's String arr, and it is used in method zip();
    private char[] words2;
    //Storing the different word.
    private char[] words1;
    //Storing the root of TheHuffmanTree.
    public Node root=null;
    //Storing the huffman's every word's code.
    private Map<Character,StringBuilder> codes;
    //Get the HuffmanTree of str.
    private Node MakeTheHuffmanTree(String str){
        this.words2=new char[str.length()];
        for(int i=0;i<str.length();i++){
            words2[i]=str.charAt(i);
        }
        char[] arrChar=getEveryChar(str);
        int[] arrNum=getTheValueNumber(str);

        List<Node> nodes=new ArrayList<>();
        for(int i=0;i<arrChar.length;i++){
            nodes.add(new Node(arrNum[i],arrChar[i]));
        }
        Collections.sort(nodes);
        while (nodes.size()>1){
            Collections.sort(nodes);
            Node leftNode=nodes.get(0);
            Node rightNode=nodes.get(1);
            Node newNode=new Node(nodes.get(0).value+nodes.get(1).value, (char) 0);
            newNode.left=leftNode;
            newNode.right=rightNode;
            nodes.add(newNode);
            nodes.remove(leftNode);
            nodes.remove(rightNode);
        }
        root=nodes.get(0);
//        MakeCodingValue(node);
        return nodes.get(0);
    }
    //Show the structure of the HuffManTree.
    public void preOrder(){
        if(root==null){
            throw new NullPointerException("The HuffManTree is not exist.");
        }
        root.preOrder();

    }
    //Get the String is char.
    private char[] getEveryChar(String str) {
        //Store the unique char of String.
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            boolean flag1 = false;
            for (char c : arr) {
                if (c == 0) {
                    break;
                }
                if (c == str.charAt(i)) {
                    flag1 = true;
                    break;
                }
            }
            if (!flag1) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 0) {
                        arr[j] = str.charAt(i);
                        break;
                    }
                }
            }
        }

        //Get the real size(the value which equals 0 should get out of the arr ) of arr.
        int size=0;
        int i=0;
        while (arr[i]!=0){
            size=size+1;
            i=i+1;
        }
        char[] arr1=new char[size];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        words1=arr1;
        return arr1;
    }
    //Get the number of every different value.
    private int[] getTheValueNumber(String str){
        char [] arr=getEveryChar(str);
        return getTheValueNumber(arr,str);


    }
    private int[] getTheValueNumber(char[] arr,String str){
        int [] arrNumber=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==arr[i]){
                    arrNumber[i]=arrNumber[i]+1;
                }
            }
        }
        return arrNumber;

    }
    //Storing the every step's value.
    private StringBuilder stringBuilder=new StringBuilder();
    //Storing the result of coding.
    private Map<Character,StringBuilder> Codes=new HashMap<>();
    //Coding the huffmanTree.
    private Map<Character, StringBuilder> GetCodes(Node node, char code, StringBuilder stringBuilder){
        StringBuilder stringBuilder1=new StringBuilder(stringBuilder);
        if (code != 0) {
            stringBuilder1.append(code);
        }

        if(node!=null){
            if(node.c==0){//The node's c is null.
                //Handling the left's tree.
                GetCodes(node.left,'0',stringBuilder1);
                //Handling the right's tree.
                GetCodes(node.right,'1',stringBuilder1);
            }else {
                Codes.put(node.c,stringBuilder1);
            }
        }
        codes=Codes;
        return Codes;


    }
    //Add the root's node, and just give the Codes.
    private Map<Character,StringBuilder> GetCodes(Node node){
        if(node==null){
            throw new NullPointerException("There is no root's node");
        }

        return GetCodes(node, (char) 0,stringBuilder);
    }
    //Overrides the zip.
    public byte[] zip(String words){
        Node node=MakeTheHuffmanTree(words);
        Map<Character,StringBuilder> Codes=GetCodes(node);
        return zip(words2,Codes);

//        zip(words,Codes);
    }

    public byte[] zip(char[] word,Map<Character,StringBuilder> map){
        //Get the huffmanCoding.
        StringBuilder stringBuilder1=new StringBuilder();
        for (char word2 : word) {
            stringBuilder1.append(map.get(word2));
        }
        //The Code below this line is to get the huffmanCode's byte[];
        //Storing the byte[] arr's length.
        int len=0;
        if(stringBuilder1.length()%8==0){
            len=stringBuilder1.length()/8;
        }else {
            len=stringBuilder1.length()/8+1;
        }
        //The huffmanCodes's byte[];
        byte [] huffmanCodes=new byte[len];
        //Signing the location of
        int index=0;
        for(int i=0;i<stringBuilder1.length();i+=8){
            String strByte="";
            if(i+8>stringBuilder1.length()){
                strByte=stringBuilder1.substring(i);
            }else {
                strByte=stringBuilder1.substring(i,i+8);
            }
            //The radix in chinese is 进制。
            huffmanCodes[index]=(byte) Integer.parseInt(strByte,2);
            index=index+1;
        }
        return huffmanCodes;
    }
    //This is one method of decompression, it is get the HuffmanCode.
    public StringBuilder getHuffmanCode(){
        Map<Character,StringBuilder> codes=GetCodes(root);
        //Get the huffmanCode.
        StringBuilder str=new StringBuilder();
        for (char c : words1) {
            str.append(codes.get(c));
        }
        return str;
    }
    //Making the byte to the BitString.
    private static String byteToBitString(boolean flag,byte b){
        int temp=b;
        if(flag){
            temp|=256;
        }
        String str=Integer.toBinaryString(temp);
        if(flag){
            return str.substring(str.length()-8);
        }else {
            return str;
        }
    }
    //Simplifying the decode method.
    public String decode(byte[] arr){
        return decode(arr,codes);
    }
    //The core method of compress.
    public String decode(byte[] arr,Map<Character,StringBuilder> map){
        //It is to store the recovered code..
        StringBuilder stringBuilder = new StringBuilder();
        //Storing the result of this method.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = i == arr.length - 1;
            stringBuilder.append(byteToBitString(!flag, arr[i]));
        }
        Map<String, Character> map1 = new HashMap<>();
        for (Map.Entry<Character, StringBuilder> entry : map.entrySet()) {
            map1.put(entry.getValue().toString(),entry.getKey());
        }
        //Poking the location which is having a relation about i. The i(below this line) and the count
        //is make a range which is define the stringBuilder(below this line)'s substring's range.
        int index = 1;
        for(int i=0;i<stringBuilder.length()&& index<stringBuilder.length();){
            boolean flag=true;
            while (flag){
                String test=stringBuilder.substring(i,index);
                Character everyResult=map1.get(test);
                if(everyResult==null){
                    index=index+1;
                }else {
                    result.append(everyResult);
                    flag=false;
                }
            }
            i=index;
            index=i+1;
        }
        return result.toString();


    }




}
