package HongYun.CanculatorByStack;
//simulate a calculator
public class Calculator {
    public int calculate(String expression) {
        //this is the numStack;
        Stack<Node<Integer>> numStack = new Stack<>(80);
        //this is the charStack;
        Stack<Node<Character>> charStack = new Stack<>(80);
        Integer res = 0;
        Integer num1 = 0;
        Integer num2 = 0;
        char oper = 0;
        int index = 0;
        char sign=' ';
        //use the index to make the calculate end.
        while (index<expression.length()){
            //get out the sign.
            sign=expression.substring(index,index+1).charAt(0);
            index=index+1;
            //judge the sign is the * / + -.
            if(charStack.isSign(sign)){
                //Whether the signStack is empty???
                // if the signStack is empty
                // just push the sign which just get out into the signStack.
                //if not make a judge the priority and do the designed function.
                if(charStack.isEmpty()){
                    Node<Character> signNode=new Node<>();
                    signNode.data=sign;
                    charStack.push(signNode);
                }else {
                    if(charStack.priority(charStack.peek())>=charStack.priority(sign)){
                        num1=numStack.pop().data;
                        num2=numStack.pop().data;
                        oper=charStack.pop().data;
                        //you have to add the new sign after the old has been out.
                        Node<Character> newSignNode=new Node<>();
                        newSignNode.data=sign;
                        charStack.push(newSignNode);
                        res=charStack.cal(num1,num2,oper);
                        Node<Integer> resNode=new Node<>();
                        resNode.data=res;
                        numStack.push(resNode);
                    }else {
                        //If the newSignStack's priority is bigger than the signStack's peek's
                        //priority ,and just get the newSign into the signStack.
                        Node<Character> newSign=new Node<>();
                        newSign.data=sign;
                        charStack.push(newSign);
                    }
                }
            }else {
                //If the sign is not Sign,then the sign is a numberSign,and just get the sign
                //into the numStack.
                Node<Integer> newNumNode=new Node<>();
                //Use the newNumSign to store the Integer's type of the newNumNode.data
                int newNumSign=0;
                newNumSign=Integer.parseInt(String.valueOf(sign));
                /*if you add the content which is below this line ,then it could be every calculation,but because this
                //the limit of idea's system ,it can't be word .So I have to simplify the function calculate the numbers
                //just 0 to nine*/
                //int endIndex=0;
//                char newSign;
//                endIndex=index+1;
//                while (true){
//                    newSign=expression.substring(endIndex,endIndex+1).charAt(0);
//                    if(charStack.isSign(newSign)){
//                        break;
//                    }else {
//                        endIndex=endIndex+1;
//                        newNumSign=newNumSign*10+newSign;
//                    }
//
//                }
                newNumNode.data=newNumSign;
                //index=endIndex;
                numStack.push(newNumNode);

            }
        }
        //If after the expression has been scanned ,and the charStack still isn't empty,the do the
        //function which is below of this line.
        if(!charStack.isEmpty()){
            while (!charStack.isEmpty()){
                Node<Integer> num1node=new Node<>();
                Node<Integer> num2node=new Node<>();
                Node<Character> operNode=new Node<>();
                num1node=numStack.pop();
                num2node=numStack.pop();
                operNode=charStack.pop();
                num1=num1node.data;
                num2=num2node.data;
                oper=operNode.data;
                res=charStack.cal(num1,num2,oper);
                //Make a new newNumNode to get the result.
                Node<Integer> newNumNode=new Node<>();
                newNumNode.data=res;
                numStack.push(newNumNode);

            }
        }
        //If the charStack isn't empty.just get out of the numStack's last node's data,which is the calculation's result.
        return numStack.pop().data;




    }

}
