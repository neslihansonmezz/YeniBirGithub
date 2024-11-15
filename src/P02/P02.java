package P02;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {


        int a =123;

        int b =123;

        System.out.println("c="+ (a+b));



        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen gideceginiz mesafeyi yaziniz:");
        double mesafe= scanner.nextInt();
        System.out.println("Lütfen kac saatte kac km hizla gittiginizi yaziniz:");
        double hiz= scanner.nextInt();

        double sure=mesafe/hiz;
        System.out.println(sure+ " saatte varir");



    }
}
