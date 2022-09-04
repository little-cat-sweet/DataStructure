package HongYun.String.MyBufferString;

public final class MyBufferString  implements java.io.Serializable{
    //The group of char.
    private char[] values;
    //The length of char's conspire(串).
    private int n;
    //The function of has a capacity's construction, and it is a no material's char's conspire.
    public MyBufferString(int capacity){
        this.values=new char[capacity];
        this.n=0;
    }
    //The function of no parameter's construction.
    public MyBufferString(){
        this(16);
    }
    //The function of a char's parameter's construction.
    public MyBufferString(String s){
        this.values=new char[s.length()+16];
        this.n=s.length();
        for(int i=0;i<n;i++){
            values[i]=s.charAt(i);
        }
    }
    //Return the length of char's conspire.
    public int length(){
        return this.n;
    }
    //Return the capacity of char's conspire.
    public int capacity(){
        return values.length;
    }
    //Return the char which char's index is i.
    public synchronized char charAt(int i){
        if(i>=0&&i<=n){
            return values[i];
        }else {
            throw new StringIndexOutOfBoundsException("You made a StringIndex wrong");
        }

    }
    //Exchange the char's conspire into String.
    public synchronized String toString(){
        return new String(this.values,0,this.n);
    }
    //Define the i's location's char's value.
    public void setChar(int i,char str){
        if(i>=0&&i<=n){
            values[i]=str;
        }else {
            throw new StringIndexOutOfBoundsException("You made a StringIndex wrong");
        }
    }
    //Insert a String into the MyBufferString.
    public synchronized MyBufferString insert(int i,String str){

        if(i>=0&&i<=n&&(str.length()+n)<=values.length){
            //Copy the last values.
            char[] lower=new char[n-i+1];
            if (lower.length >= 0) System.arraycopy(values, i , lower, 0, lower.length);
            for(int j=0;j<str.length();j++){
                values[i+j]=str.charAt(j);
            }
            if (lower.length >= 0) System.arraycopy(lower, 0, values,  i - 1 + str.length(), lower.length);
            n=i-1+str.length()+lower.length;
            if(n==values.length){
                MyBufferString myBufferString=new MyBufferString(values.length+16);
                if (this.values.length + 1 >= 0)
                    System.arraycopy(this.values, 0, myBufferString.values, 0, this.values.length + 1);
                    return myBufferString;
            }
            return this;
        }else {
            throw new StringIndexOutOfBoundsException("You made a StringIndex wrong.");
        }
    }



}
