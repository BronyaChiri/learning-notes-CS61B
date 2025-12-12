/* 二叉搜索树
*  search() use the key to find value in the tree
* add()  add a pair Node or leaf
* construct  array->Tree
* every node is a pair which is a key paired with a value
*  isLeaf()
* */

public class BinarySearchTree {
    TreePair value;
    BinarySearchTree lefPoint;
    BinarySearchTree rigPoint;

    public BinarySearchTree(TreePair val,BinarySearchTree left, BinarySearchTree right){
        this.value = val;
        this.lefPoint = left;
        this.rigPoint = right;
    }

    public BinarySearchTree(TreePair Pair){
        this.value = Pair;
        this.lefPoint = null;
        this.rigPoint = null;
    }

    public boolean isLeaf(){
        if (this.lefPoint != null) return false;
        else if (this.rigPoint != null) return false;
        else return true;
    }

}
