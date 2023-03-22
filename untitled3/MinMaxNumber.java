import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=1, number, adet, min=0, max=0;
        System.out.println("Girilecek sayı adedini giriniz: ");
        adet=input.nextInt();

        while(i<=adet){
            System.out.println(i + ". sayıyı giriniz:");
            number= input.nextInt();
            i++;

            if(number<min){
                min=number;
            }else if(number>max){
                max=number;
            }

        }
        System.out.println(min+ ", en küçük sayıdır.");
        System.out.println(max+ ", en büyük sayıdır. ");
    }

}
