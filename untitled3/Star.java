import java.util.Scanner;
public class Star {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n;
        System.out.print("Satır sayısını giriniz: ");
        n= input.nextInt();

        for(int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
