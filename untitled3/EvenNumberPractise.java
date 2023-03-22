import java.util.Scanner;
public class EvenNumberPractise {
    public static void main(String[] args) {
        int k, sum=0, counter=0;
        Scanner input=new Scanner(System.in);

        System.out.print("sayı giriniz: ");
        k=input.nextInt();
        for(int i=1; i<=k; i++){
            if ((i%3==0) && (i%4==0)){
                sum+=i;
                counter++;
                System.out.println(i);

            }
        }
        System.out.println("sum of numbers : " +sum);
        System.out.println("avarage : " +sum/counter);
    }
}
