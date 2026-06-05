interface Tossable {
    void toss(); 
}
abstract class Ball implements Tossable {
    private String brandName;
    public Ball(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName() {
        return brandName;
    }
    public void bounce() {
        System.out.println(brandName + " ball is bouncing!");
    }
}
class Rock implements Tossable {
    @Override
    public void toss() {
        System.out.println("The rock has been tossed.");
    }
}
class Baseball extends Ball {
    public Baseball(String brandName) {
        super(brandName);
    }
    @Override
    public void toss() {
        System.out.println("The " + getBrandName() + " baseball is pitched!");
    }
    @Override
    public void bounce() {
        System.out.println("The " + getBrandName() + " baseball bounces slightly on the dirt.");
    }
}
class Football extends Ball {
    public Football(String brandName) {
        super(brandName); 
    }
    @Override
    public void toss() {
        System.out.println("The " + getBrandName() + " football is thrown in a spiral!");
    }
    @Override
    public void bounce() {
        System.out.println("The " + getBrandName() + " football bounces unpredictably!");
    }
}
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Testing Rock : ");
        Tossable rock = new Rock();
        rock.toss();
        System.out.println("Testing Baseball : ");
        Baseball baseball = new Baseball("Spalding");
        System.out.println("Brand: " + baseball.getBrandName());
        baseball.toss();
        baseball.bounce();
        System.out.println("Testing Football : ");
        Football football = new Football("Wilson");
        System.out.println("Brand: " + football.getBrandName());
        football.toss();
        football.bounce();
    }
}
