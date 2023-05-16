import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini girin (1: Tek Yon, 2:Gidis-Donus): ");
        int yolculukTipi = input.nextInt();

        // Hatali veri girisi kontrolu

        if(mesafe <= 0 || yas<=0 || (yolculukTipi !=1 && yolculukTipi !=2)){
            System.out.print("Hatali veri girdiniz:");
        }else{
            double birimFiyat = 0.10; // km basina ucret
            double toplamFiyat = mesafe*birimFiyat;
            // Yas indirimi
            if(yas<12){
                toplamFiyat *=0.5;
            }else if(yas >= 12 && yas <= 24){
                toplamFiyat *= 0.9;
            }else if(yas >= 65){
                toplamFiyat *= 0.7;
            }

            //Yolculuk Tipine gore indirim
            if(yolculukTipi == 2){
                toplamFiyat *=0.8;
            }
            System.out.println("Toplam Tutar: " + toplamFiyat + " TL");
        }


    }
}