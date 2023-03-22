import java.util.Scanner;


public class Horoscope {
    public static void main(String[] args) {
        int month , day ;
        String burc="" ;
        boolean isError= false;

        Scanner input= new Scanner(System.in);


        System.out.println("enter the month you were born : ");
        month=input.nextInt();
        System.out.println("enter the day you were born");
        day=input.nextInt();


        switch(month) {

            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc="OĞLAK";
                    } else {
                        burc="KOVA";
                    }
                }else{
                    isError=true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc="KOVA";
                    } else {
                        burc="BALIK";
                    }
                }else{
                    isError=true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc="BALIK";
                    } else {
                        burc="KOÇ";
                    }
                }else{
                    isError=true;
                }
                break;

            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc="KOÇ";
                    } else {
                        burc="BOĞA";
                    }
                }else{
                    isError=true;
                }
                break;

            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc="BOĞA";
                    } else {
                        burc="İKİZLER";
                    }
                }else{
                    isError=true;
                }
                break;

            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc="İKİZLER";
                    } else {
                        burc="YENGEÇ";
                    }
                }else{
                    isError=true;
                }
                break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc="YENGEÇ";
                    } else {
                        burc="ASLAN";
                    }
                }else{
                    isError=true;
                }
                break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc="ASLAN";
                    } else {
                        burc="BAŞAK";
                    }
                }else{
                    isError=true;
                }
                break;

            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc="BAŞAK";
                    } else {
                        burc="TERAZİ";
                    }
                }else{
                    isError=true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc="TERAZİ";
                    } else {
                        burc="AKREP";
                    }
                }else{
                    isError=true;
                }
                break;

            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        burc="AKREP";
                    } else {
                       burc="YAY";
                    }
                }else{
                    isError=true;
                }
                break;

            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc="YAY";
                    } else {
                        burc="OĞLAK";
                    }
                }else{
                    isError=true;
                }
                break;

            default:
                isError=true;

        }


        if( isError) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        }else{
            System.out.println("Burcunuz: " +burc);






        }

    }

}