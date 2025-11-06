public class Intlist{

    public int first;
    public Intlist rest;

    public Intlist(int f , Intlist r ){
        this.first = f;
        this.rest= r;
    }
    
    public int size(){

        if (this.rest == null) return 1;
        else return 1 + this.rest.size();
    }

    public int itersize(){
        int totalSize=1;
        Intlist p = this;
        while (p.rest!=null){
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    public int get(int i){
        if (i==0) return this.first;
        else return this.rest.get(i-1);
    }



    public static void main(String[] args){
         Intlist L = new Intlist(15,null);
         L = new Intlist(10,L);
         L = new Intlist(5,L);
         System.out.println(L.itersize());
         System.out.println(L.itersize());

    }

}