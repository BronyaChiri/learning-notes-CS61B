public class swiftSort {
    public swiftSort(){}
    public static void swift(int[] list){
        int i=0,j=0,t=0,k=0;
        for (i=1;i<list.length;i++){
            for (j=0;j<i;j++){
                if (list[i]<list[j]) {
                    t=list[i];
                for (k=i;k>j;k--){
                 list[k]=list[k-1];}
                 list[j] = t;
                break;}
            }
        }

    }

    public static void printList(int[] list){
        int i=0;
        System.out.print("[");
        for (i=0;i<list.length;i++){
            System.out.print(list[i]+", ");
        }
        System.out.print("]");
    }

    public static void main(String []args){
        int[] a = {24, 100, 49, 23, 16, 13, 33, 69, 54, 98, 3,
                2, 29, 40, 84, 35, 27, 37, 98, 26, 59, 59, 6, 82, 49, 89, 56, 38, 60, 96, 64};
        // swiftSort beautiful = new swiftSort();
        swift(a);
        printList(a);

    }
}
