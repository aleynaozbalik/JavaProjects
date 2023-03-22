import java.util.Scanner;

public class KullaniciGirisEkrani {
    public static void main(String[] args) {
        String userName, password, answer, newPassword;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your username:");
        userName=input.nextLine();
        System.out.println("enter your password: ");
        password=input.nextLine();
        if (userName.equals("aleyna") && password.equals("a123")) {
            System.out.print("BİLGİLERİNİZ DOĞRU, GİRİŞ YAPILDI.");
        }else{
            System.out.print("BİLGİLERİNİZİ KONTROL EDİN.ŞİFREYİ DEĞİŞTİRMEK İÇİN EVET YAZIN");
            answer=input.nextLine();
            if(answer.equals("EVET")) {
                System.out.print("YENİ ŞİFRENİZİ GİRİN : ");
                newPassword=input.nextLine();
                if (newPassword.equals("a123")) {
                    System.out.print("ŞİFRENİZ ESKİ ŞİFREYLE AYNI, İŞLEM BAŞARISIZ");
                }else{
                    System.out.print("ŞİFRENİZ BAŞARIYLA DEĞİŞTİRİLDİ");
                }
            }else{
                System.out.print("GİRİŞ YAPAMADINIZ");

            }
        }
    }
}
