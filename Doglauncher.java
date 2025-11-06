public class Doglauncher {

    public static void main(String[] args){
        // Dog d = new Dog(300);
        /* Dog[] dogs = new Dog[8];
        int i=0;
        for (i=0;i<=7;i++) {
             dogs[i] = new Dog(8*i);

        }
        for (i=0;i<=7;i++){
            System.out.println("This is a dog of "+ dogs[i].weight +  " weight \n");
            dogs[i].makenoise();
        } */
        Dog d1 = new Dog(17);
        Dog d2 = new Dog(150);
        Dog larger = d1.maxdog(d2);
        // larger.makenoise();
        System.out.println(Dog.biomen);
        
    }
    
}
