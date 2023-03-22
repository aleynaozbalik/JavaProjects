import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int muzik, matematik, fizik, turkce, kimya;
        double ortalama;

        Scanner input= new Scanner(System.in);

        System.out.println("muzik notunu gir: ");
        muzik=input.nextInt();

        System.out.println("kimya notunu gir: ");
        kimya=input.nextInt();

        System.out.println("turkce notunu gir: ");
        turkce=input.nextInt();

        System.out.println("fizik notunu gir: ");
        fizik=input.nextInt();

        System.out.println("matematik notunu gir: ");
        matematik=input.nextInt();



        if(muzik<0 || muzik>100){
            ortalama=(turkce+kimya+fizik+matematik)/5;

        }else if(matematik<0 || matematik>100){
            ortalama=(turkce+muzik+kimya+fizik+matematik)/5;

        }else if(fizik<0 || fizik>100){
            ortalama=(turkce+muzik+kimya+matematik)/5;
        }else if(turkce<0 || turkce>100){
            ortalama=(muzik+kimya+fizik+matematik)/5;

        }else if(kimya<0 || kimya>100){
            ortalama=(turkce+muzik+fizik+matematik)/5;

        }else{
            ortalama=(muzik+matematik+turkce+kimya+fizik)/5;

        }

        System.out.println("ortalamız " + ortalama);

        if(ortalama>55){
            System.out.println("sınıfı geçtiniz");


        }else{
            System.out.println("sınıfta kaldınız.");
        }
    }


}
