// Encapsulation = concealing information, not giving direct access of instance variable to outsiders but accessible using methods(setter/getter) in an indirect sense.
class Human {
    // getter -> field that makes a field READABLE
    // setter -> field that makes a field WRITABLE

    private int age;
    private int salary;

    public Human (int age) {
        this.age = age;
    }

    int getAge () {
        return this.age;
    }

    void setSalary (int s) {
        this.salary = s;
    }

    int getSalary () {
        return this.salary;
    }
}

public class Encapsulation {
    public static void main (String a[]) {
        Human vikas = new Human(22);
        // System.out.println("Vikas age is " + vikas.age); works when 'age' is non-private in Human
        System.out.println("Vikas age is " + vikas.getAge()); // works when 'age' is private in Human

        vikas.setSalary(1000);
        System.out.println("Salary is " + vikas.getSalary());
    }
}