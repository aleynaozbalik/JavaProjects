import java.util.Scanner;
public class UsluSayiOrnek {
    public static void main(String[] args) {
        int n,k, i=1,total=1;

        Scanner input =new Scanner(System.in);

        System.out.print("üssü alınacak sayıyı girin: ");
        n=input.nextInt();

        System.out.print("üs olacak sayıyı giriniz : ");
        k= input.nextInt();

        for(i=1 ; i<=k; i++){
            total*=n;
        }

        System.out.println(total);

    }
}
