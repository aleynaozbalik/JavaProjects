import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        for(int number=2; number<100;number++){
            boolean isPrime=true;
            for(int i=2; i<number; i++ ) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }


            }
            if(isPrime==true) {
                System.out.println(number);
            }
        }

    }
}
