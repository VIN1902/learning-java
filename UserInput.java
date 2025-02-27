import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // clear the scanner -> whenever you press enter '\n' is added and it takes entire line and stops at \n

        System.out.println("What's your favourite food? ");
        String food = sc.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old!");
        System.out.println("Your favourite food item is " + food);
    }
}