import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        double length, weight, bmi;
        Scanner input= new Scanner(System.in);

        System.out.print("Enter your length in meters: ");
        length=input.nextDouble();

        System.out.print("Enter your weight in kilograms : ");
        weight=input.nextDouble();

        bmi=weight/(length*length);
        System.out.print("BMI is  " + bmi);

    }
}
