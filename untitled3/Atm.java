import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        while(right>0){

            String username, password;
            System.out.println("Kullanıcı adını giriniz : ");
            username=input.nextLine();
            System.out.println("Şifre giriniz : ");
            password=input.nextLine();

            if(username.equals("patika")&& password.equals("dev123")){
                System.out.println("Merhaba, X bankasına hoşgeldiniz.");
                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para yatırma\n"+ "2-Para Çekme\n"+ "3-Bakiye Sorgulama\n"+ "4-Çıkış yap.");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select= input.nextInt();
                    if (select==1){
                        System.out.println("para miktarı : ");
                        int price=input.nextInt();
                        balance+=price;
                    }else if(select==2){
                        System.out.println("para miktarı : ");
                        int price=input.nextInt();
                        if (price>balance){
                            System.out.println("bakiye yetersiz.");
                        }else{
                            balance-=price;
                        }

                    }else if(select==3){
                        System.out.println("bakiyeniz: "+ balance);
                    }
                }while(select!=4);
                System.out.println("Çıkış yaptınız.Tekraar görüşmek üzere.");

                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.");

                }else {
                    System.out.println("Kalan hakkınız: " + right); // azaltarak git demek right için
                }
            }
        }


    }
}
