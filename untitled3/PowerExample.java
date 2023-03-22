import java.util.Scanner;

public class PowerExample {
    public static void main(String[] args) {
        int n, i=1;

        Scanner input= new Scanner(System.in);
        System.out.println("sınır değeri giriniz: ");
        n= input.nextInt();
        for(i=1; i<=n; i*=4) {
            System.out.println("4ün kuvvetleri : " + i);
        }

        for (i=1; i<=n; i*=5){

            System.out.println("5in kuvvetleri : " +i);
        }


    }
}
