import java.util.*;
public class hanoiSpire {
    public hanoiSpire(){}
    public static void main(String []args){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        int i=0,n=9;
        for (i=n;i>0;i--){
            a.add(i+1);
        }
        hanoi(n,a,b,c);
    }
    public static void move(ArrayList<Integer> a,ArrayList<Integer> b){
        int t = a.get(a.size()-1);
        a.remove(a.size()-1);
        System.out.println(t + " moved");
        b.add(t);
    }
    public static void hanoi(int n,ArrayList<Integer> src,ArrayList<Integer> temp,ArrayList<Integer> target) {
        if (n == 1) {
            move(src, target);
            return ;}
        else { hanoi(n-1,src,target,temp);
               move(src,target);
               hanoi(n-1,temp,src,target);
        }
    }
}