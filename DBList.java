public class DBList <chess> {
    public int size;
    public IntNode first,last,seminor;
    public DBList(chess x){
        this.seminor = new IntNode(x,null,null);
        this.first = new IntNode(x,this.seminor,this.seminor);
        this.last = first;
        this.size = 1;
        this.seminor = new IntNode(x,this.first,this.last);
    }
    private class IntNode {
        public chess item;
        public IntNode next;
        public IntNode prev;

        public IntNode(chess item,IntNode next,IntNode prev){
            
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
    public void addFirst(chess x){
        this.first = new IntNode(x,this.first,seminor);
        size += 1;
    }
    public void addLast(chess x){
        this.last = new IntNode(x,seminor,last);
        size += 1;
    }
    public static void main(String[] args){
        DBList l = new DBList(3);
        l.addFirst(2);
        l.addLast(5);
        
        l.print();
    }
    public chess getFirst(){
        return this.first.item;
    }
    public chess getLast(){
        return this.last.item;
    }
    public void print(){
        IntNode p = this.first;
        while(p.next!=this.last.ite m){System.out.println(p.item);
        p = p.next;}
    }
}
