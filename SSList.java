public class SSList {
    IntNode first;

    public SSList(int x){
        this.first = new IntNode(x,null);
        
    }

    public static void main(String[] args){
        SSList L = new SSList(3);
        L.addLast(5);
        System.out.println(L.getFirst());

        System.out.println(L.size());
    }

    public void addFirst(int x){
        this.first = new IntNode(x,this.first);
    }
    public int getFirst(){
        return this.first.item;
    }
    public void addLast(int x){
        IntNode p = this.first ;
        while(p.next!=null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
    }
    public int size(){
        return size(this.first);
    }
    
    private int size(IntNode i){
        IntNode p = i;
        if(p.next==null) return 1;
        else {return 1+size(p.next);}

    }
    
}
