package KahveMakinesi;

import java.util.Scanner;

public class islemler {

   static Scanner scan = new Scanner(System.in);
    private static int secim;

    public static void kahveSiparis(){

        System.out.println(" \tKahve Adı\n" +
                "1\tTürk Kahvesi\n" +
                "2\tFiltre Kahve\n" +
                "3\tEspresso\n" +
                "4\tAmericano\n" +
                "Lütfen içmek istediğiniz kahvenin numarasını giriniz :");

        secim=scan.nextInt();


        switch (secim){
            case 1:
                turkKahvesi();
            case 2:
                filitreKahvesi();
            case 3:
                espressoKahvesi();
            case 4:
                americano();

            default:
                System.out.println("Hatali giris Yaptiniz Lütfen Tekrar Deneyiniz");

               kahveSiparis();


        }
    }

    private static void americano() {
    }

    private static void espressoKahvesi() {
    }

    private static void filitreKahvesi() {
    }

    private static void turkKahvesi() {
    }


}
