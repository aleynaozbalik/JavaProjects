import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=1,firstNumber=0, secondnumber=1, n, sum=0;
        System.out.println("sayı giriniz");
        n=input.nextInt();

        while(i<=n){
            System.out.println(firstNumber);
            sum=firstNumber+secondnumber;
            firstNumber=secondnumber;
            secondnumber=sum;
            i++;




        }




    }
}
