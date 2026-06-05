class Restaurants{
    String fi;
    int fp;
    Restaurants(String fi, int fp){
        this.fi=fi;
        this.fp=fp;
    }
    double calculateBill(){
        return fp + (fp*0.10);
    }
    int estimateDelivery(){
        return 40;
    }
}
class FastFoodRestaurants extends Restaurants{
    FastFoodRestaurants(String fi, int fp){
        super(fi,fp);
    }
    @Override
    double calculateBill(){
        return fp + (fp*0.10);
    }
    @Override
    int estimateDelivery(){
        return 20;
    }
}
class FineDinningRestaurants extends Restaurants{
    FineDinningRestaurants(String fi, int fp){
        super(fi,fp);
    }
    @Override
    double calculateBill(){
        return fp + (fp*0.15);
    }
    @Override
    int estimateDelivery(){
        return 60;
    }
}
public class OnlineFoodOrderingSystem {
    public static void main(String[] args){
        Restaurants customer1 = new FastFoodRestaurants("Burger",125);
        Restaurants customer2 = new FineDinningRestaurants("Rice-meal",135);
        System.out.println(customer1.calculateBill() + " time needed: " + customer1.estimateDelivery());
        System.out.println(customer2.calculateBill() + " time needed : " + customer2.estimateDelivery());
    }
}
