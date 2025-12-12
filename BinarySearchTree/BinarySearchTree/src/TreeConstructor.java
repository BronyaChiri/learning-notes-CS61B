public class TreeConstructor  {
    public static BinarySearchTree arrayToTree(int[] array){
        int n = array.length;
        int i=0;
        TreePair tempPair = new TreePair(array[i],i);
        BinarySearchTree root = new BinarySearchTree(tempPair);
        for (i=1;i<n;i++){
            tempPair = new TreePair(array[i],i);
            addPair(tempPair,root);
        }
        return root;
    }

    public static void addPair(TreePair Pair,BinarySearchTree Tree){
        if (Pair.key==Tree.value.key) {System.out.println("Already exist!");return;}
        BinarySearchTree T = new BinarySearchTree(Pair);
        if (Pair.key>Tree.value.key) {
            if (Tree.rigPoint==null) {Tree.rigPoint = T;}
            else addPair(Pair,Tree.rigPoint);
        }
        else {
            if (Tree.lefPoint==null) {Tree.lefPoint = T;}
            else addPair(Pair,Tree.lefPoint);
        }
    }

    public static int search(int n,BinarySearchTree Tree){
        if (n==Tree.value.key) return Tree.value.val;
        else if (n>Tree.value.key) {
            if (Tree.rigPoint==null) {System.out.println("Not Found!");return -1;}
            else return search(n,Tree.rigPoint);
        }
        else {
            if (Tree.lefPoint==null) {System.out.println("Not Found!");return -1;}
            else return search(n,Tree.lefPoint);
        }
    }

    public static void main(String []args){
        int[] a={33, 6, 26, 2, 24, 69, 50, 28, 17, 42, 73, 23, 31, 56, 100};
        BinarySearchTree Tree1 = null;
        Tree1 = arrayToTree(a);
        System.out.println(search(69,Tree1));
    }
}
