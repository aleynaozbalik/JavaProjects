import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km, minPrice=20;
        double perKm=2.20, startPrice=10.00, totalPrice;
        Scanner input= new Scanner(System.in);
        System.out.print("KM i GİRİNİZ: ");
        km=input.nextInt();
        totalPrice=km*perKm+startPrice;

        if (totalPrice<20.00) {
            System.out.print(totalPrice = 20.00);
        }else{
            System.out.print(totalPrice);

        }

    }
}
