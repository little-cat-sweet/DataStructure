package HongYun.DoubleWayListLinked;

public class DoubleWayListLinked {
    Node head=new Node(0,"");

    public boolean isEmpty(){
        Node temp=head;
        return temp.next == null;
    }
    //show the doublewaylistlinked!!!
    public void list(){
        if(head.next==null){
            System.out.println("double way listlinked is empty");
            return;
        }
        Node temp=head.next;
        while (temp!=null){
            System.out.println(temp.toString());
            temp=temp.next;
        }
    }
    //add one node to the doublewaylistlinked's last location!!
    public void add(Node node){
        if(head.next==null){
            head.next=node;
            return;
        }
        Node temp=head.next;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.pre=temp;//because it's the double way!!
        System.out.println("add has been succeed!!!");

    }
    //delete by the node'id!!!
    public void delete(int id){
        if(head.next==null){//this is a empty double way listlinked!!!!
            return;
        }
        Node temp=head.next;
        boolean flag=false;
        while (true){
            if(temp==null){
                //has find the last node.
                break;
            }
            if(temp.id==id){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag){
            if(temp.pre!=null){
                temp.pre.next=temp.next;

            }
            if(temp.next!=null){
                temp.next.pre=temp.pre;
            }
            if(temp.pre==null && temp.next==null){
                System.out.println("this doublewaylistlinked can't be deleted ,case this is the last node!");
            }
        }else {
            System.out.println("delete failed!!! , because the id is not in this doublewaylistlinked!!!");
        }


//        while (temp!=null){
//            if(temp.id==id){
//                flag=true;
//                break;
//            }
//            temp=temp.next;
//
//        }
//        if(flag){
//                temp.next.pre = temp.pre;
//                temp.pre.next = temp.next;
//                System.out.println("delete succeed!!!!");
//        }
//        if(!flag){
//            System.out.println("not found the Node which you want to delete");
//        }

    }
    public void update(Node node){
        Node temp=head;
        if(isEmpty()){
            System.out.println("this is a empty double way listlinked!!!");
        }
        while (temp.next!=null){
            while (temp.id!=node.id){
                temp=temp.next;
            }
        }
//        while (temp.next!=null){
//            if(temp.id==node.id){
//                temp.name=node.name;
//                System.out.println("update succeed!!!");
//                break;
//            }
//            temp=temp.next;
//        }

    }
}
