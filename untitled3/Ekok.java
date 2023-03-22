import java.util.Scanner;
public class Ekok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2, ekok=1;
        System.out.println("Küçük sayıyı giriniz: ");
        n1= input.nextInt();
        System.out.println("Büyük sayıyı giriniz: ");
        n2= input.nextInt();

        for(int i=1; i<=n1*n2; i++){
            if((i%n1==0)&& (i%n2==0)){
                ekok=i;
                System.out.println(i);
                break;


            }

        }
        int i=1;
        while(i<=n1*n2){
            if((i%n1==0)&&(i%n2==0)){
                ekok=i;
                break; //ilk değeri bulduğunda dursun diye yazıyoruz
            }
        i++;
        }
        System.out.println(ekok);


    }
}
