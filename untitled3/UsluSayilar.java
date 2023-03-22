import java.util.Scanner;
public class UsluSayilar {
    public static void main(String[] args) {
        int n,k, total=1,i=1 ;
        Scanner input=new Scanner(System.in);

        System.out.print("üssü alınacak sayıyı girin : ");
        n= input.nextInt();

        System.out.print("üs olacak sayıyı giriniz : ");
        k=input.nextInt();

        while(i<=k){
            total*=n;
            i++;
        }
        System.out.println(total);

    }
}
