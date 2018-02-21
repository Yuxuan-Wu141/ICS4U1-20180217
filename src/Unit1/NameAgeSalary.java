package Unit1;
import java.util.*;

public class NameAgeSalary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = input.nextLine();

        System.out.println("Hi, " + name + ". How old are you?");
        int age = input.nextInt();

        System.out.println("So you are " + age + ", eh?  That's not old at all!\n" +
                "How much do you make, Dennis?");
        double salary = input.nextDouble();

        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
    }

}
