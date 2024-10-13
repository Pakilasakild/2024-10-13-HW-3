import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (name.isEmpty() || email.isEmpty() || age < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.print("Formatted user data: \n");
            System.out.println("Name: " + name + "\n" + email + "\n" + age + "\n");
            System.out.println("Does the email contain an '@'? " + email.contains("@"));
            System.out.println("Does the email end with '.com'? " + email.endsWith(".com"));
            System.out.println("Does the name start with a capital letter? " +Character.isUpperCase(name.charAt(0)));
        }
    }
}