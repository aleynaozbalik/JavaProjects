import java.util.Scanner;

public class KdvProject {
    public static void main(String[] args) {
        double kdv1 = 0.18;
        double kdv2 = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün fiyatını girin : ");
        double fiyat = input.nextDouble();
        double var10000 = kdv1 * fiyat;
        double son = fiyat <= 1000.0 ? fiyat * kdv1 : fiyat * kdv2;
        double kdvliTutar = son + fiyat;
        System.out.println("KDVli ürüm tutarı : ");
        System.out.print(kdvliTutar);
        }

}
