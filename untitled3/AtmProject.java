import java.util.Scanner;
public class AtmProject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String userName, password;
        int balance=1500;
        int right=3;
        int select;

        while(right>0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName=input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password=input.nextLine();
            if(userName.equals("aleyna") && password.equals("123")){
                System.out.println("Giriş yaptınız.");
                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para yatırma\n"+ "2-Para Çekme\n"+ "3-Bakiye Sorgulama\n"+ "4-Çıkış yap.");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select= input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para miktar: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para miktarı : ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price2;
                            }

                            break;
                        case 3:
                            System.out.println("bakiyeniz: " + balance);
                            break;


                        default:
                            System.out.println("Hatalı tuşlama yaptınız.");

                    }

                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;


            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştır.");
                }else{
                    System.out.println("kalan hakkınız : " +  right);
                }
            }
        }


    }
}
