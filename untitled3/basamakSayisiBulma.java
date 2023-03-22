public class basamakSayisiBulma  {
    public static void main(String[] args) {

        ///int a=2456;
        ///int b=a/10;
        ///System.out.println(b);

        int a=2451, basamakSayisi=0, numberCounter=0;
        System.out.println(a);

        while (a!=0){
            a=a/10;
            System.out.println(a);
            numberCounter++;

        }

        System.out.println(numberCounter);

    }
}
