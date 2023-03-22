import java.util.Scanner;

public class SifreYenileme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String password,username, newPassword;
        String deger;

        System.out.println("kullanıcı adını giriniz : ");
        username=input.nextLine();
        System.out.println("sifrenizi giriniz : ");
        password=input.nextLine();

        if((username=="aleyna")&&(password=="123")){
            System.out.println("sifreniz doğru giriş yaptınız.");
        }else{
            System.out.println("sifreniz yanlış bilgilerinizi kontrol edin");
            System.out.println("sifreyi değiştirmek için 1e, çıkış için 2ye basınız.");
            deger=input.nextLine();

            if(deger.equals("1")){
                System.out.println("yeni sifrenizi girin: ");
                newPassword=input.nextLine();
                System.out.println("yeni şifreniz:" +newPassword );
                if(newPassword.equals("123")){
                   System.out.println("şifreniz eski şifreyle aynı, işlem başarısız.");

               }else{
                   System.out.println("şifreniz başarıyla değiştirildi.");
               }

            }else{
                System.out.println("çıkış yaptınız.");
            }

        }
    }
}
