import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = "";
        String trash ="";
        int age = 0;
        double salary = 0;

        System.out.print("Enter your name: ");

        name = in.nextLine();

        System.out.println("you said your name is " + name);

        System.out.print("enter your age: ");

        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); // MUST CLEAR BUFFER AFTER READING A NUMBER
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }
            age = in.nextInt();

        System.out.println("you said your age is " + age);

        System.out.print("what is your salary: ");

        if (in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); // must lear buffer after reading a number
            System.out.println("you said your salary is " + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number!");
        }

    }
}