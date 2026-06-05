abstract class Employee{
    String name;
    int id;
    String dept;
    Employee(String name, int id, String dept){
        this.name=name;
        this.id=id;
        this.dept=dept;
    }
    abstract void pay();
    abstract void EmployeeName();
}
class FullTimeEmployee extends Employee{
    double fs;
    FullTimeEmployee(String name, int id, String dept, double fs){
        super(name,id,dept);
        this.fs=fs;
    }
    @Override
    void EmployeeName(){
        System.out.println(super.name);
    }
    @Override
    void pay(){
        System.out.println(fs);
    }
}
class PartTimeEmployee extends Employee{
    double hr;
    int hw;
    PartTimeEmployee(String name, int id, String dept, double hr, int hw){
        super(name, id, dept);
        this.hw=hw;
        this.hr=hr;
    }
    @Override
    void EmployeeName(){
        System.out.println(super.name);
    }
    @Override
    void pay(){
        System.out.println(hr * hw);
    }
}
class ContractEmployee extends Employee{
    String pn;
    int ca;
    ContractEmployee(String name, int id, String dept, String pn, int ca){
        super(name,id,dept);
        this.pn=pn;
        this.ca=ca;
    }
    @Override
    void EmployeeName(){
        System.out.println(super.name);
    }
    @Override
    void pay(){
        System.out.println(ca);
    }
}
public class TypesOfEmployee{
    public static void main(String[] args){
        FullTimeEmployee fte = new FullTimeEmployee("A", 2023, "English", 30000);
        PartTimeEmployee pte = new PartTimeEmployee("B",2024,"Bangla",500,6);
        ContractEmployee ce = new ContractEmployee("C",2025,"Physics","SpaceX",40000);
        fte.EmployeeName();
        fte.pay();
        pte.EmployeeName();
        pte.pay();
        ce.EmployeeName();
        ce.pay();
    }
}
