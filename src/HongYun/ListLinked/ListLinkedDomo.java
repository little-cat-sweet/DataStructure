package HongYun.ListLinked;

public class ListLinkedDomo {
    public static void main(String[] args) {
        ListLinked listLinked=new ListLinked();
       HeroNode node1=new HeroNode(1,"亚索");
       HeroNode node2=new HeroNode(2,"劫");
       HeroNode node3=new HeroNode(3,"李青");

//        listLinked.add(node1);
//        listLinked.add(node2);
//        listLinked.add(node3);
        listLinked.addByOrder(node3);
        listLinked.addByOrder(node1);
        listLinked.addByOrder(node2);
        listLinked.list();
        HeroNode node4=new HeroNode(2,"锐雯");
        HeroNode node5=new HeroNode(657,"亚索");
        listLinked.update(node4);
        listLinked.update(node5);
        listLinked.list();
        listLinked.delete(3);
        listLinked.list();

    }

}
class ListLinked{
    //创建链表头。
    HeroNode head=new HeroNode(0,"");

    //创建链表的添加的方法。
    public void add(HeroNode heroNode){
        HeroNode temp=head;
        //遍历链表
        while (temp.next != null) {
            //找到链表的最后.
            temp = temp.next;
        }
        temp.next=heroNode;
    }
    public void addByOrder(HeroNode heroNode){
        //因为头节点不能改变所以需要创建一个辅助节点。
        HeroNode temp=head;
        //一个标志符，判断节点的序号是否已经存在。
        boolean flag=false;
        while (true){
            if(temp.next==null){
                break;
            }
            if(temp.next.id>heroNode.id){
                break;
            }else if(temp.next.id==heroNode.id){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag){
            System.out.println("你所想加入的英雄的标记号已经存在,不能添加！！！");
        }else {
            heroNode.next=temp.next;
            temp.next=heroNode;
        }
    }
    public void list(){
        if(head.next==null){
            System.out.println("链表为空!!!!");
            return;
        }
        HeroNode temp=head.next;
        while(temp!=null){
            System.out.println(temp);
            temp=temp.next;
        }
    }
    //finish the information of HeroNode by HeroNode;
    public void update(HeroNode node){
        HeroNode temp=head.next;//辅助变量.
        boolean flag=true;
        if(temp==null){
            System.out.println("队列为空!!");
        }
        while (true) {
            if (temp == null) {
                //had to the end
                flag=false;
                break;
            }
            if (temp.id == node.id) {
                //found
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.name=node.name;
        }else {
            System.out.printf("没有找到编号为%d的结点\n",node.id);
        }
    }

    //得到。3
    //删除节点
    public void delete(int id) {
        HeroNode temp = head;
        boolean flag = false;
        if(temp.next==null){
            System.out.println("这个表是空表哦");
        }
        while (true){
            if(temp.next==null){
                break;
                //到达末尾。
            }
            if(temp.next.id==id){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag){
            temp.next=temp.next.next;
            System.out.println("删除成功!!");
        }else {
            System.out.printf("没有找到序号为%d的结点哦！！！\n",id);
        }
    }



}

//创建节点属性。
class HeroNode{
    public int id;
    public String name;

    public HeroNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public  HeroNode next;//指向下一个节点。
    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}