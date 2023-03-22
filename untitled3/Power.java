import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int n, i=1;

        Scanner input=new Scanner(System.in);

        System.out.println("Sınır sayısını giriniz: ");
        n= input.nextInt();

        for(i=1; i<=n ; i*=2 ){
            System.out.println(i);

        }

    }
}
