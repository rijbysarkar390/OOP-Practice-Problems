import java.util.Scanner;
public class GeometryCalculate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(),height=sc.nextInt();
        double res = 0.5 * base * height;
        System.out.println("Area of this triangle is : " + res);
        int r = sc.nextInt();
        double res1 = (4*3.1416*r*r*r)/3;
        System.out.println("Volume of this ball is : " + res1);
        int rad = sc.nextInt();
        double res2 = 3.1416*rad*rad;
        System.out.println("Area of this circle is : " + res2);
        int c = sc.nextInt();
        double f = (9*c + 160)/5;
        System.out.println("Converted Fahrenheight is : " + f);
        int arm = sc.nextInt();
        double res3 = (Math.sqrt (3) *arm * arm)/4;
        System.out.println("Area of this equilateral Triangle is : " + res3);
        int a = sc.nextInt(),b = sc.nextInt(),d = sc.nextInt();
        double s = (a+b+d)/2.0;
        double area = s*(s-(double)a)*(s-(double)b)*(s-(double)d);
        System.out.println("Area of this triangle is : " + Math.sqrt(area));

    }
}
