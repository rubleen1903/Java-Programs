public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student(Student std) {
        this.firstName = std.firstName;
        this.lastName = std.lastName;
        this.age = std.age;
    }

    public void displayData() {
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Age : " + this.age);
    }

    public static void main(String[] args) {
        Student std = new Student("Ruby", 18);
        Student std1 = new Student("Rubleen", "Kaur", 22);
        Student std2 = new Student("Kabir", "Singh", 5);
        Student std3 = new Student(std2);
    }
}