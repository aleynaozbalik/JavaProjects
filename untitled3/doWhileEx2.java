import java.util.Scanner;
public class doWhileEx2 {
    public static void main(String[] args) {
        int n;
        int sum=0 ;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("sayı giriniz: ");
            n=input.nextInt();
            if((n%2==0) && (n%4==0)){
                sum+=n;

            }
        }while( n%2==0 );

        System.out.print("sum is " +sum );


    }
}
