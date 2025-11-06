public class Dog
{   public int weight;
    public static String biomen = "Canis family" ;
    public void makenoise(){
        if (weight <= 10) System.out.println("yinyinyin");
        else if (weight <= 50) System.out.println("barkbark");
        else System.out.println("aroooo");
    }

    public Dog(int w){
        this.weight = w;
    }    
    
    public static Dog compare(Dog d1,Dog d2){
        if (d1.weight >= d2.weight) return d1;
        else return d2;
    }
    public Dog maxdog(Dog d2){
        if (this.weight >= d2.weight) return this;
        else return d2;
    }

}