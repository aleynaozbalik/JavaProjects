import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        int n,r,i,factorial=1,factorial2=1, fact=1,combinationResult, difference;
        Scanner input=new Scanner(System.in);



        System.out.println("kümenin eleman sayısını giriniz: ");
        n= input.nextInt();

        System.out.println("farklı grup sayısını giriniz : ");
        r= input.nextInt();

        difference=n-r;


        for(i=1; i<=n; i++){
            factorial*=i;

        }

        for(i=1; i<=r; i++){
            factorial2*=i;

        }


        for(i=1; i<=(n-r); i++){
            fact*=i;
        }


        combinationResult=(factorial)/(factorial2*fact);
        System.out.println("kombinasyon sonucu : " + combinationResult);
    }
}
