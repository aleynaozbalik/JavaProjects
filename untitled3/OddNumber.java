import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        int i=0, sum=0;

        Scanner input= new Scanner(System.in);

        while(i>=0){
            System.out.print("sayı giriniz: ");
            i++;
            i= input.nextInt();
            if (i%2==1){
                sum+=i;

            }

        }
        System.out.println("sum is " + sum);
    }
}

