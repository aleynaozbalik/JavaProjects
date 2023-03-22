import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number, basNumber=0;

        System.out.print("Sayı giriniz: ");
        number= input.nextInt();
        int tempNumber=number;
        int basValue;
        int basPower;
        int result=0;



        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;

        }
        tempNumber=number;

        while (tempNumber!=0){
            basValue=tempNumber%10;
            basPower=1;
            //basnumber üs olacak, carpılacak sayı basvalue, sonuc da baspower.
            for(int i=1 ; i<=basNumber; i++){
                basPower*=basValue;

            }
            result+=basPower;
            tempNumber/=10;

        }
        if (result==number){
            System.out.println(number + " bir armstrong sayısıdır.");

        }else{
            System.out.println(number + " bir armstrong sayısı değildir.");
        }
        ///basamak sayısını bulma
        /*int a=2451, numberCounter=0, basamakSayisi=0;
        while(a != 0){
            a/=10;
            numberCounter++;

        }

        System.out.println(numberCounter);


        ///bir sayının son basamagını bulma
        int b=1223;
        int c=b%10;
        System.out.println(c);

         */
    }
}
