class Employee{
   String name;
   int esal;
  public Employee(String n){
    name = n;
    esal = 150000;


  }
  public Employee(){
    name = "rubyy";
    esal = 5000000;
  }

  public Employee(String n, int r){
    this.name = n;
    this.esal = r;
  }
  public void printName(){
    System.out.println("Name is ");
    System.out.println(name);
    System.out.println("Salary is ");
    System.out.println(esal);
  }
}
class emp1{
  public static void main(String[] args){
System.out.println("Rubleen Kaur 07613203118");

    Employee a = new Employee("xyz");
    Employee b = new Employee();
    Employee c = new Employee("Rubleen", 9008000);
    System.out.println("Def. Const.");
    a.printName();
    System.out.println("Param. Const.");
    b.printName();
    System.out.println("Copy Const.");
    c.printName();
  }
}
