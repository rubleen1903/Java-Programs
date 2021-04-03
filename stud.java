class Student{
   String name;
   int roll_no;
  public Student(String n){
    name = n;
    roll_no = 15;


  }
  public Student(){
    name = "unknown";
    roll_no = 10;
  }

  public Student(String n, int r){
    this.name = n;
    this.roll_no = r;
  }
  public void printName(){
    System.out.println(name);
    System.out.println(roll_no);
  }
}
class stud{
  public static void main(String[] args){
System.out.println("Rubleen Kaur - 07613203118");

    Student a = new Student("xyz");
    Student b = new Student();
    Student c = new Student("Rubleen", 18);
    System.out.println("Def. Const.");
    a.printName();
    System.out.println("Param. Const.");
    b.printName();
    System.out.println("Copy Const.");
    c.printName();
  }
}
