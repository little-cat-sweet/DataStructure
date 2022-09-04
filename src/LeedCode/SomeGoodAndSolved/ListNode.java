package LeedCode.SomeGoodAndSolved;

import java.util.ArrayList;
import java.util.List;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-03-25 08
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        ListNode temp=this;
        StringBuilder stringBuilder1=new StringBuilder();
        while (temp!=null){
            stringBuilder1.append(String.valueOf(temp.val));
            stringBuilder1.append(",");
            temp=temp.next;
        }
        return String.valueOf(stringBuilder1);
    }
}

class Solution{
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;

        List<Integer> list=new ArrayList<>();
        while (temp!=null&&temp.next!=null){
            if(temp.val == temp.next.val){
                list.add(temp.val);
                while (temp.next!=null&&temp.val==temp.next.val){
                    temp=temp.next;
                }
            }
            temp=temp.next;
        }


        ListNode temp1=new ListNode();
        temp1.next=head;
        ListNode yummy=temp1;
        for(int i=0;i<list.size();i++){
            if(temp1.next!=null&&temp1.next.val!=list.get(i)){
                temp1=temp1.next;
                i--;
                continue;
            }
            while (temp1.next!=null&&temp1.next.val==list.get(i)){
                temp1.next=temp1.next.next;
            }
//            i++;
//            boolean flag=false;
//            if(i<list.size()&&temp1.next.val!=list.get(i)){
//                flag=true;
//            }
//            i--;
//            if(flag){
//                temp1=temp1.next;
//                i--;
//            }
        }
        return yummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(0);
        ListNode listNode2=new ListNode(1);
        ListNode listNode3=new ListNode(2);
        ListNode listNode4=new ListNode(2);
        ListNode listNode5=new ListNode(3);
        ListNode listNode6=new ListNode(4);
//        ListNode listNode7=new ListNode(6);
//        ListNode listNode8=new ListNode(6);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
//        listNode6.next=listNode7;
//        listNode7.next=listNode8;
        Solution solution=new Solution();
        System.out.println(solution.deleteDuplicates(listNode1));
    }
}


