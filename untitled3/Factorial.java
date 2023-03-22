import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n, total=1;
        Scanner input= new Scanner(System.in);

        System.out.println("faktoriyelini bulmak istediğiniz sayıyı yazınız: ");
        n=input.nextInt();

        for (int i=1; i<=n ; i++){
            total*=i;


        }
        System.out.println(total);

    }
}
