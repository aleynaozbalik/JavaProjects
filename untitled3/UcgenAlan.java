import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c,u, cevre;
    double alan;
    System.out.print("a kenarını giriniz: ");
    a=input.nextInt();
    System.out.print("b kenarını giriniz: ");
    b=input.nextInt();
    System.out.print("c kenarını giriniz: ");
    c=input.nextInt();
    u=(a+b+c)/2;

    cevre=2*u;
    alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.println("Üçgenin çevresi  " + cevre);
    System.out.println("Üçgenin alanı  " + alan);
    }
}
