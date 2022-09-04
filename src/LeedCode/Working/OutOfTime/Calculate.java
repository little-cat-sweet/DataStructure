package LeedCode.Working.OutOfTime;

import java.util.ArrayList;
import java.util.Stack;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-03-10 17
 */
public class Calculate {
    public int calculate(String s) {
        return 1;

    }
    private ArrayList<String> makeLRear(String s){
        ArrayList<String> result=new ArrayList<>();
        Stack <Character> sign=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                if(sign.empty()){
                    sign.push(s.charAt(i));
                }else {
                        if(s.charAt(i-1)!='(') {
                            result.add(String.valueOf(sign.pop()));
                            sign.push(s.charAt(i));
                        }else {
                            sign.push(s.charAt(i));
                        }

                }
            }else if(s.charAt(i)=='('){
                sign.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                while (sign.peek()!='(') {
                    result.add(String.valueOf(sign.pop()));
                }
                sign.pop();
            }else {
                ArrayList<String> number=getNumber(s,i,s.length());
                result.add(number.get(0));
                i=Integer.parseInt(number.get(1))-1;
            }
        }
        if(!sign.empty()){
            result.add(String.valueOf(sign.pop()));
        }
        return result;
    }
    private ArrayList<String> getNumber(String s,int index,int length){
        ArrayList<String> resultFinal=new ArrayList<>();
        StringBuilder result=new StringBuilder();
        int time=index;
        while (s.charAt(time)!='+'&&s.charAt(time)!='-'&&s.charAt(time)!='('&&s.charAt(time)!=')'){
            if (s.charAt(time) != ' ') {
                result.append(s.charAt(time));
            }
            time++;
            if(time==length){
                break;
            }
        }
        resultFinal.add(String.valueOf(result));
        resultFinal.add(String.valueOf(time));

        return resultFinal;
    }

    public static void main(String[] args) {
        String s="1+3+(1+2)+1";
        Calculate calculate =new Calculate();
        System.out.println(calculate.makeLRear(s));
    }
}
