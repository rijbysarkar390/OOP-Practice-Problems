class products{
    void filterProducts(String s){
        System.out.println(s);
    }
    void filterProducts(int a, int b){
        System.out.println(a + " " + b);
    }
    void filterProducts(String s, int a, int b){
        System.out.println(s+" "+a+" "+b);
    }
    void filterProducts(String s, int a, int b, String s1){
        System.out.println(s+ " "+ a+" "+b +" "+ s1);
    }
}
public class ProductFilteringSystem {
    public static void main(String[] args) {
        products obj = new products();
        obj.filterProducts("electronics");
        obj.filterProducts(100,500);
        obj.filterProducts("Apple");
        obj.filterProducts("fashion",100,500);
        obj.filterProducts("electronics",100,500,"Nike");
    }
}
