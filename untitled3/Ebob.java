import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1, n2;
        System.out.print("küçük olan sayıyı giriniz : ");
        n1= input.nextInt();
        System.out.print("büyük olan sayıyı giriniz: ");
        n2= input.nextInt();
        int ebob=1;

        /*for(int i=1; i<=n1; i++){  //i sayıları bu iki sayıyı tam bölenler
             if((n1%i==0) && (n2%i==0)){
                 System.out.println(i);
                 ebob=i;

            }
        }*/
        /*for(int k=n1; k>=1; k--){
            if((n1%k==0 )&& (n2%k==0)){
                ebob=k;
                System.out.println("EBOB " +ebob);
                break; //en buyugunu bulduk
            }

        }*/
        int i=1;
        while((i<=n1) && (i<=n2)) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;

            }
            i++;
        }

        System.out.println(ebob);
    }
}
