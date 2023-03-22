import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        double havaSicakligi;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        havaSicakligi = input.nextDouble();

        if (havaSicakligi < 5) {
            System.out.print("Kayak yapabilirsiniz.");

        } else if (havaSicakligi >= 10 && havaSicakligi <= 15) {
            System.out.print("Hem sinemaya hem pikniğe gidebilirsiniz.");
        } else if (havaSicakligi > 5 && havaSicakligi < 15){
             System.out.print("Sinemaya gidebilirsiniz");
        }else if ( havaSicakligi<10 && havaSicakligi>=25 ) {
            System.out.print("Pikniğe gidebilirsiniz.");

        }else{
            System.out.print("yüzmeye gidebilirsiniz.");

        }



    }
}
