package HongYun.Josepfu;

public class Josepfu {
    Boy first=null;
    public void addBoy(int numbers){
        if (numbers < 1) {
            System.out.println("you have gaven a wrong number!!!");
            return;
        }
        Boy curBoy=null;

        for(int i=1;i<=numbers;i++){
            Boy boy=new Boy(i);
            if(i==1){
                first=boy;
                boy.next=first;
                curBoy=first;
            }else {
                curBoy.next=boy;
                boy.next=first;
                curBoy=boy;
            }
            //solve the problem that the numbers=1
//            Boy boy=new Boy(i);
//            first.next = boy;
//            boy.next=first;
//            curBoy=boy;

        }
    }
    public void showBoy(){
        if(first==null){
            System.out.println("this is a empty Josepfu!!!");
            return;
        }
        System.out.printf("the boy's id is %d\n",first.id);
        Boy curBoy=first.next;
        while (curBoy!=first){
            System.out.printf("the boy's id is %d\n",curBoy.id);
            curBoy=curBoy.next;
        }

    }
    /*
    begin是开始报数的位置，
    step是每次报数的次数。
    nums是总共有多少报数的人。
     */
    public void CountBoy(int begin,int step,int nums){
        if(step>nums || begin>nums || nums<1 || begin<1){
            System.out.println("please take a look!!!");
            return;
        }
        if(first==null) {
            System.out.println("please take a look !!!");
        }else {
            //先确定first的位置。
            for(int i=1;i<begin;i++){
                first=first.next;
            }
            Boy helper=first.next;
            while (helper.next!=first){
                helper=helper.next;
            }
            while (first!=first.next){
                //将helper与first移到k-1处
                for(int m=0;m<step-1;m++){
                    first=first.next;
                    helper=helper.next;
                }
                System.out.printf("%d\n",first.id);
                helper.next=first.next;
                first=first.next;

            }
            System.out.println(first.id);
        }



    }
}
