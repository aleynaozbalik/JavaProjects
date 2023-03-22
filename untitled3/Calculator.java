import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select ;
        Scanner input = new Scanner(System.in);
        System.out.print("enter a first number:");
        n1=input.nextInt();
        System.out.print("enter a second number: ");
        n2=input.nextInt();

        System.out.print("select your choice: \n 1-toplama\n 2-çıkarma\n 3-multiply\n 4-divide\n");
        System.out.print("your choice: ");
        select = input.nextInt();
        if (select==1) {
            System.out.print("result is " + (n1 + n2));
        }else if ( select==2) {
            System.out.print("result is " + (n1 - n2));
        }else if (select==3) {
            System.out.print("result is " + (n1 * n2));
        }else if (select==4) {
            if (n2!=0){
                System.out.print("result is " + (n1/n2));
            } else {
                System.out.print("no number is divided by 0");
            }
        }else{
            System.out.print("incorrect selection");


        }
    }
}
