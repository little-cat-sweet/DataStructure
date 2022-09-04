package LeedCode.SomeGoodAndSolved;

import java.util.*;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-03-11 08
 */
public class CalculateMedium {
    public int calculate(String s) {
        Queue<String> BoNan=getNiBoLan(s);
        Stack<String> result=new Stack<>();
        while (!BoNan.isEmpty()){
            if(!BoNan.peek().equals("+")&&!BoNan.peek().equals("-")&&!BoNan.peek().equals("*")&&!BoNan.peek().equals("/")){
                result.push(BoNan.poll());
            }else {
                int right=Integer.parseInt(result.pop());
                int left=Integer.parseInt(result.pop());
                if(!BoNan.isEmpty()){
                    switch (BoNan.peek()) {
                        case "+":
                            result.push(String.valueOf(right + left));
                            BoNan.poll();
                            break;
                        case "-":
                            result.push(String.valueOf(left - right));
                            BoNan.poll();
                            break;
                        case "*":
                            result.push(String.valueOf(left * right));
                            BoNan.poll();
                            break;
                        case "/":
                            result.push(String.valueOf(left / right));
                            BoNan.poll();
                            break;
                    }
                }
            }
            if(BoNan.isEmpty()){
                break;
            }
        }

        return Integer.parseInt(result.pop());

    }
    private Queue<String> getNiBoLan(String s){
        Stack<Character> sign=new Stack<>();
        Queue<String> result=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            if(s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)!='*'&&s.charAt(i)!='/'){
                StringBuilder number1=new StringBuilder();
                while (s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)!='*'&&s.charAt(i)!='/'&&s.charAt(i)!=' '){
                    if(s.charAt(i)==' '){
                        i++;
                        continue;
                    }
                    number1.append(s.charAt(i));
                    i++;
                    if(i==s.length()){
                        break;
                    }
                }
                result.add(String.valueOf(number1));
                i--;
            }else {
                if(s.charAt(i)=='/'||s.charAt(i)=='*'){
                    if(sign.empty()){
                        sign.push(s.charAt(i));
                    }else {
                        while ((sign.peek()!='+'&&sign.peek()!='-')&&!sign.empty()){
                            result.add(String.valueOf(sign.pop()));
                            if(sign.empty()){
                                break;
                            }
                        }
                        sign.push(s.charAt(i));
                    }
                }else {
                    if(sign.empty()){
                        sign.push(s.charAt(i));
                    }else {
                        while (!sign.empty()) {
                            result.add(String.valueOf(sign.pop()));
                            if(sign.empty()){
                                break;
                            }
                        }
                        sign.push(s.charAt(i));
                    }
                }
            }
        }
        while (!sign.empty()){
            result.add(String.valueOf(sign.pop()));
            if(sign.empty()){
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CalculateMedium calculateMedium=new CalculateMedium();
        System.out.println(calculateMedium.calculate("2*3*4"));
    }
}
