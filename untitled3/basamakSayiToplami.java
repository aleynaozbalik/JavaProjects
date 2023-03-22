import java.util.Scanner;

public class basamakSayiToplami {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number, basValue, result=0;
        System.out.print("sayı giriniz: ");
        number= input.nextInt();

        while(number!=0){

            basValue=number%10;
            System.out.println(basValue);

            number/=10;
            System.out.println(number);

            result+=basValue;

        }
        System.out.println(result);


    }
}
