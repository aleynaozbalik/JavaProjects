import java.util.Scanner;
public class CinTakvimi {
    public static void main(String[] args) {
        int dogumYili, sonuc;

        Scanner input= new Scanner(System.in);
        System.out.println("Doğum yılınız: ");
        dogumYili=input.nextInt();

        sonuc=dogumYili%12;

        if (sonuc==0){
            System.out.println("Çin zodyağı değeri : MAYMUN");

        }else if(sonuc==1){
            System.out.println("Çin zodyağı değeri : HOROZ");

        }else if(sonuc==2){
            System.out.println("Çin zodyağı değeri : KÖPEK");

        }else if(sonuc==3){
            System.out.println("Çin zodyağı değeri : DOMUZ");

        }else if(sonuc==4){
            System.out.println("Çin zodyağı değeri : FARE");

        }else if(sonuc==5){
            System.out.println("Çin zodyağı değeri : ÖKÜZ");

        }else if(sonuc==6){
            System.out.println("Çin zodyağı değeri : KAPLAN");

        }else if(sonuc==7){
            System.out.println("Çin zodyağı değeri : TAVŞAN");

        }else if(sonuc==8){
            System.out.println("Çin zodyağı değeri : EJDERHA");

        }else if(sonuc==9){
            System.out.println("Çin zodyağı değeri : YILAN");

        }else if(sonuc==10){
            System.out.println("Çin zodyağı değeri : AT");

        }else if(sonuc==11){
            System.out.println("Çin zodyağı değeri : KOYUN");

        }


    }
}
