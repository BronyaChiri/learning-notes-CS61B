public class main {
    public static int DoTwice(OneTimeFunction f,int x){
        return f.apply(f.apply(x));
    }

    public static void main(String []args){
        int a=2;
        OneTimeFunction f = new TenX();
        System.out.println(DoTwice(f,a));
    }
}
