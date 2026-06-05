import java.util.Scanner;
public class CalculateCgpa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] credit = new double[8];
        double[][] gpa = new double[1][8];
        System.out.println("Enter credit amount of each subject : ");
        int totalCredit=0;
        for(int i=0;i<8;i++){
            credit[i]=sc.nextDouble();
            totalCredit+=credit[i];
        }
        System.out.println("Enter gpa of each subject of all student one by one : ");
        for(int i=0;i<1;i++){
            for(int j=0;j<8;j++){
                gpa[i][j]=sc.nextDouble();
            }
        }
        System.out.println("CGPA of all student are given below: ");
        for(int i=0;i<1;i++){
            double sum=0;
            for(int j=0;j<8;j++){
                sum+=(gpa[i][j]*credit[j]);
            }
            double cgpa = sum/totalCredit;
            System.out.println("CGPA of student " + (i+1) + " is : " + cgpa);
        }
    }
}
