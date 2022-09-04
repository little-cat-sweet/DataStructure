package HongYun.String.MyString;

public class Test {
    public static void main(String[] args) {
        char[] arr={'长','路','漫','漫','唯','剑','热','伴','神'};
        char[] arr1={'长','路','漫','漫','唯','剑','作','伴','神'};
        MyString myString1=new MyString(arr);
        MyString myString2=new MyString(arr1);
        System.out.println(myString1.equals(myString2));
        System.out.println(myString1.compareTo(myString2));
        System.out.println(arr[0]-arr1[0]);
        MyString myString=myString1.concat(myString2);
        System.out.println(myString);
        System.out.println(myString1.compareTo(myString2));
    }
}
