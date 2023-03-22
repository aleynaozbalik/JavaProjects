import java.util.Scanner;
public class DaireDilimiAlani {
    public static void main(String[] args) {
        int r;
        double pi=3.14, aci, daireDilimAlani;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r=input.nextInt();
        System.out.print("Açıyı giriniz: ");
        aci=input.nextInt();
        daireDilimAlani=pi*(r*r)*aci;
        System.out.print("Daire dilimin alanı  "+ daireDilimAlani);
    }
}
