package Unit1;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Your height in m: ");
        double height = input.nextDouble();
        System.out.println("Your weight in kg: ");
        double weight = input.nextDouble();

        double BMI = weight/(height*height);
        System.out.println("Your BMI is: " + BMI);
    }
}
