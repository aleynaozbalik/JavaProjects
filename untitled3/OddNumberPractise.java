import java.util.Scanner;

public class OddNumberPractise {
    public static void main(String[] args) {
        int i=0, sum=0;
        Scanner input = new Scanner(System.in);

        while (i%2==0){
            System.out.println("sayı giriniz: ");
            i++;

            i=input.nextInt();

            if(i%4==0){
                sum+=i;

            }

        }
        System.out.println("sum is " +sum);
    }
}
