import java.util.Scanner;


public class doWhileEx {
    public static void main(String[] args) {

        int n, sum=0;
        Scanner input= new Scanner(System.in);

        do{
            System.out.print("sayı giriniz: ");
            n= input.nextInt();
            if(n%2==1){
                sum+=n;

            }

        }while(n>0);

        System.out.println("sum is " + sum);


    }
}
