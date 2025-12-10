public class Alist {
    private int size;
    private int[] items;
    public Alist(){
        size = 0;
        items = new int[100];
    }

    public void addLast(int x){
        if (size<items.length){
        items[size] = x;
        size++;}
        else {extraSpace(int x);}
    }

    public int getLast(){
        return items[size-1];
    }

    public int get(int i){
        return items[i];
    }

    public int getSize(){
        return size;
    }

    public int removeLast(){
        int x = items[size];
        size--;
        return x;
    }

    public void extraSpace(int x){
         int[] biggerItems = new int[items.length+1];
         System.arraycopy(items,0,biggerItems,0,size);
         biggerItems[size] = x;
         items = biggerItems;
         size++;
    }

    public static void main(String[] args){

    }
}
