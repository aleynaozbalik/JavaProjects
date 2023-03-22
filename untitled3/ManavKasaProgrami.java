import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double elma=3.67 , armut=2.14, domates=1.11, muz=0.95, patlican=5.00, miktar, toplamFiyat, elmaTutari, armutTutari,domatesTutari,muzTutari,patlicanTutari ;
        Scanner input= new Scanner(System.in);
        System.out.print("Elma kaç kilo ? ");
        miktar=input.nextDouble();
        elmaTutari=miktar*elma;

        System.out.print("Armut kaç kilo ? ");
        miktar=input.nextDouble();
        armutTutari=miktar*armut;

        System.out.print("Domates kaç kilo ? ");
        miktar=input.nextDouble();
        domatesTutari=miktar*domates;

        System.out.print("Muz kaç kilo ? ");
        miktar=input.nextDouble();
        muzTutari=miktar*muz;

        System.out.print("Patlıcan kaç kilo ? ");
        miktar=input.nextDouble();
        patlicanTutari=miktar*patlican;

        toplamFiyat=elmaTutari+armutTutari+muzTutari+domatesTutari+patlicanTutari;
        System.out.print("Toplam borcunuz : " + toplamFiyat);

    }
}
