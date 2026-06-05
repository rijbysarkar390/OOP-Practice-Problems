class Dog{
    private String n;
    private int a;
    private String b;
    Dog(String n, int a, String b){
        this.n=n;
        this.a=a;
        this.b=b;
    }
    public String name(){
        return n;
    }
    public int age(){
        return a;
    }
    public String breed(){
        return b;
    }
    public void bark(){
        System.out.println("The dog is barking");
    }
    public void spin(){
        System.out.println("The dog is spinning");
    }
    public void run(){
        System.out.println("The dog is running");
    }
}
public class Animal {
    public static void main(String[] args){
        Dog d = new Dog("Tiger",5,"Labrador");
        System.out.println(d.name());
        System.out.println(d.age());
        System.out.println(d.breed());
        d.bark();
        d.spin();
        d.run();
    }
}
