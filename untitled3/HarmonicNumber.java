import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n ;
        double result=0.0;
        System.out.print("N sayısını giriniz : ");
        n= input.nextInt();

        for(double i=1; i<=n; i++){
            result+=(1/i);

        }
        System.out.println(result);
    }
}
