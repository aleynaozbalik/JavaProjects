import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input=new Scanner(System.in);
        System.out.print("enter a first number:");
        n1=input.nextInt();
        System.out.print("enter a second number:");
        n2=input.nextInt();
        System.out.println("Enter your selection:\n 1-add\n 2-subs\n 3-multiply\n 4-divide\n");

        System.out.print("Your selection is ");

        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("result is "+ (n1+n2));
                break;
            case 2:
                System.out.print("result is " + (n1-n2));
                break;
            case 3:
                System.out.print("result is " + (n1*n2));
                break;
            case 4:
                if (n2!=0) {
                    System.out.println("result is " + (n1 / n2));
                }else {
                    System.out.print("Bir sayı sıfıra bölünemez.");
                }
                break;
            default:
                System.out.print("wrong selection");

        }

    }
}
