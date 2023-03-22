import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int day, month;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz gün: ");
        day = input.nextInt();
        System.out.println(("Doğduğunuz ay: "));
        month = input.nextInt();

        if (month == 1) {
            if (day >= 1 &&  day <= 31) {
                if (day < 21) {
                    burc="oglak";

                } else {
                    burc="kova";


                }

            }else{
                isError=true;
            }



        }else if(month == 2) {

            if (day >= 1 && day <= 28) {
                if (day < 21) {
                    burc = "kova";

                } else {
                    burc = "balık";

                }

            } else {
                isError = true;

            }
        }else if(month==3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "balık";
                } else {
                    burc = "koç";
                }
            }
        }else if(month==4){
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "koç";
                } else {
                    burc = "boğa";
                }
            }
        }else if(month==5){
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "boğa";
                } else {
                    burc = "ikizler";
                }
            }
        }else if(month==6){
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "ikizler";
                } else {
                    burc = "yengeç";
                }
            }
        }else if(month==7){
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "yengeç";
                } else {
                    burc = "aslan";
                }
            }

        }else if(month==8){
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "aslan";
                } else {
                    burc = "başak";
                }
            }

        }else if(month==9){
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "başak";
                } else {
                    burc = "terazi";
                }
            }

        }else if(month==10){
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "terazi";
                } else {
                    burc = "akrep";
                }
            }

        }else if(month==11){
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "akrep";
                } else {
                    burc = "yay";
                }
            }

        }else if(month==12){
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "yay";
                } else {
                    burc = "oğlak";
                }
            }
        }else{
            System.out.println("hatalı ay girdiniz.");
        }

        if(isError==true){
            System.out.println("hatalı giriş");
        }else{
            System.out.println("burcunuz " + burc) ;
        }

    }



}
