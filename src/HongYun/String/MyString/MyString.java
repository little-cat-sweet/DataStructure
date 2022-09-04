package HongYun.String.MyString;

public final class MyString implements Comparable<MyString>,java.io.Serializable {
    private final char[] values;
    public MyString(){
        this.values=new char[0];
    }
    public MyString(String str){
        this.values=new char[str.length()];
        for(int i=0;i<str.length();i++){
            this.values[i]=str.charAt(i);
        }
    }
    public MyString(char[] values,int start,int end){
        if(start>=0&&start<=end&&end<=values.length-1){
            this.values=new char[(end-start)+1];
            System.arraycopy(values, start, this.values, 0, this.values.length);


        }else {
            throw new IndexOutOfBoundsException("Your made a index wrong");
        }

    }
    public MyString(char[] values){
        this(values,0,values.length-1);
    }
    public MyString(MyString str){
        this(str.values);
    }
    public int length(){
        return this.values.length;
    }
    public String toString(){
        return new String(this.values);
    }
    public char charAt(int i){
        if(i>=0&&i<values.length){
            return values[i];
        }else {
            throw new StringIndexOutOfBoundsException("You made a StringIndex wrong");
        }
    }
    //The subString is to make another MyString from the old, and the start is the new's first index location
    //the end is the new's last location.
    public MyString subString(int start, int end){
        //The note below this line is my way, and it is also work.
/***
      char[] lowString=new char[end-start+1];
//        if(start>=0&&start<end&&end<=values.length-1){
//            System.arraycopy(values, start + 0, lowString, 0, end - start + 1);
//        }else {
//            throw  new  StringIndexOutOfBoundsException("You made a StringIndex wrong!");
//        }
//        MyString myString=new MyString(lowString);
//        return myString;
 ***/
        if(start==0&&end==values.length-1){
            return this;
        }
        if(start>=0&&start<=end&&end<=values.length-1){
            return new MyString(values,start,end);
        }else {
            throw new StringIndexOutOfBoundsException("You made a StringIndex wrong");
        }
    }
    public MyString subString(int begin){
        if(begin==0){
            return this;
        }
        if(begin>0&&begin<=values.length-1){
            return new MyString(values,begin,values.length-1);
        }
        else {
            throw new StringIndexOutOfBoundsException("You made a StringIndex wrong.");
        }
    }
    public MyString concat(MyString str){
        if(str==null){
            return this;
        }
        int oldSize=this.values.length;
        int newSize=str.values.length;
        int size=this.values.length+str.values.length;
        char[] cc=new char[size];
        int i=0;
        for(i=0;i<oldSize;i++){
            cc[i]=this.values[i];
        }
        System.arraycopy(str.values, 0, cc, i, newSize);
        return new MyString(cc);
    }
    public boolean equals(MyString str){
        if(this.values.length==str.values.length){
            for(int i=0;i<this.values.length;i++){
                if(this.values[i]!=str.values[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }


    @Override
    public int compareTo(MyString o) {
        for(int i=0;i<this.values.length&&i<o.values.length;i++){
            if(this.values[i]!=o.values[i]){
                //Return the D-value of both of this's and o's str.value.size.
                return this.values[i]-o.values[i];
            }
        }
        //Return the D-value of both of this's and o's size.
        return this.values.length-o.values.length;
    }
//    public int indexOfMyString(MyString string){
//
//        return 1;
//
//    }
}
