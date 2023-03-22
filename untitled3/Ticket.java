import java.util.Scanner;
public class Ticket {
    public static void main(String[] args) {
        int age, km, yolculukTipi;
        double perKm=0.10, indirimsizTutar, yasIndirimi, tipIndirimi, indirimliTutar,sonTutar;

        Scanner input= new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km=input.nextInt();

        System.out.println("Yasınızı giriniz: ");
        age=input.nextInt();

        System.out.println("Tek Yön için 1', Gidiş-Dönüş için 2'yi tuşlayınız.");
        yolculukTipi=input.nextInt();

        indirimsizTutar=(km*perKm);


        if ((age>0) && (km>0) && ((yolculukTipi==1) || (yolculukTipi==2))){
            if (age<12){

                yasIndirimi=indirimsizTutar*0.50;
                indirimliTutar=indirimsizTutar-yasIndirimi;
                if (yolculukTipi==2) {
                    tipIndirimi = indirimliTutar * 0.20;
                    sonTutar=indirimliTutar-tipIndirimi;
                    System.out.println("Biletinizin tutarı  " + sonTutar*2);

                }else{
                    System.out.println("Gidiş Dönüş bilet indiriminden yararlanamadınız.");
                    indirimliTutar=indirimsizTutar-yasIndirimi;
                    System.out.println("Biletinizin tutarı" + indirimliTutar);

                }

            }else if(age>=12 & age<=24){
                yasIndirimi=indirimsizTutar*0.10;
                indirimliTutar=indirimsizTutar-yasIndirimi;
                if (yolculukTipi==2){
                    tipIndirimi=indirimliTutar*0.20;
                    sonTutar=indirimliTutar-tipIndirimi;
                    System.out.println("Biletinizin tutarı " + sonTutar*2);
                }else{
                    System.out.println("Gidiş Dönüş bilet indiriminden yararlanamadınız.");
                    indirimliTutar=indirimsizTutar-yasIndirimi;
                    System.out.println("Biletinizin tutarı" + indirimliTutar);


                }
            }else if(age>65){
                yasIndirimi=indirimsizTutar*0.30;
                indirimliTutar=indirimsizTutar-yasIndirimi;
                if(yolculukTipi==2){
                    tipIndirimi=indirimliTutar*0.20;
                    sonTutar=indirimliTutar-tipIndirimi;
                    System.out.println("Biletinizin tutarı " +sonTutar*2);


                }else{
                    System.out.println("Gidiş Dönüş bilet indiriminden yararlanamadınız.");
                    indirimliTutar=indirimsizTutar-yasIndirimi;
                    System.out.println("Biletinizin tutarı" + indirimliTutar);

                }
            }else if(age>0){
                System.out.println("Yaş indiriminden yararlanamadınız.");
                if( yolculukTipi==2){
                    tipIndirimi=indirimsizTutar;
                    indirimliTutar=indirimsizTutar-tipIndirimi;
                    System.out.println("Biletinizin tutarı" + indirimliTutar*2);
                }else{
                    System.out.println("Gidiş Dönüş bilet indiriminden yararlanamadınız.");
                    System.out.println("Biletinizin tutarı " + indirimsizTutar);
                }
            }




        }else{
            System.out.println("Hatalı giriş yaptınız.Lütfen bilgilerinizi kontrol ediniz.");
        }



    }
}
