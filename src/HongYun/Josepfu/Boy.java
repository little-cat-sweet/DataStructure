package HongYun.Josepfu;
//construct the Josepfu's node.
public class Boy {
    public int id;

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boy(int id) {
        this.id = id;
    }

    public Boy next;
}
