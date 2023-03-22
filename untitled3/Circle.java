import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int r;
        double pi=3.14, cevre, alan;
        System.out.print("Yarıçapı giriniz: ");
        r=input.nextInt();
        cevre=2*pi*r;
        alan=pi*r*r;
        System.out.println("dairenin çevresi : " + cevre);
        System.out.println("dairenin alanı : " + alan);
    }
}
