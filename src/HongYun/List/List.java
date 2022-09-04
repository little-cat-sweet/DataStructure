package HongYun.List;
public class List <T>{
    protected Object[] element;

    protected int n;
    public List(int length){
        this.element=new Object[length];
        this.n=0;
    }
    public List(){
        this(64);
    }
    public int getSize(){
        return this.n;
    }
    public boolean isEmpty(){
        return n==0;
    }

    public void insert(int x, Object o) {
        if (o == null) {
            throw new NullPointerException("You made a null wrong");
        }
        if (this.n == this.element.length) {
            Object[] temp = this.element;
            this.element = new Object[temp.length * 2];
            System.arraycopy(temp, 0, this.element, 0, this.n);
        }
        if (x < 0) {
            for (int i = n; n > 1; i--) {
                this.element[i] = this.element[i - 1];
            }
            this.element[0] = o;
            this.n = n + 1;
        } else if (x > n-1) {
            element[n] = o;
            this.n = n + 1;
        } else {
            for (int i = n; n > x; i--) {
                this.element[i] = this.element[i - 1];
            }
            this.element[x] = o;
            this.n = n + 1;

        }
    }
    public void insert(Object o){
        insert(n,o);
    }
    public String toString(){
        StringBuilder str= new StringBuilder();
        for(int i=0;i<n;i++){
            str.append(this.element[i].toString());
        }
        return str.toString();
    }
    public void delete(int x){
        if(isEmpty()){
            throw new RuntimeException("This is a null list");
        }
        if(x<0){
            if (n - 1 >= 0) System.arraycopy(this.element, 1, this.element, 0, n - 1);
            this.n=n-1;
        }else if (x>n){
            this.element[n-1]=null;
            this.n=n-1;
        }else {
            if (n - 1 - x >= 0) System.arraycopy(this.element, x + 1, this.element, x, n - 1 - x);
            this.n=n-1;
        }
    }
    public void delete(){
        delete(n);
    }
    public Object search(int t){
        if(isEmpty()){
            throw new RuntimeException("You made null list wrong");
        }
        if(t<0 && t>n-1){
            throw new IndexOutOfBoundsException("You made a index wrong");
        }
        return this.element[t];
    }


}
