
//while

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int duzgunPin=7532;//düzgün PİN kodu
        int cehd=0, maksimumCehd=3;
        boolean sistemeDaxilOldu=false;

        System.out.println();
        System.out.println("      ----> ATM PİN KODU SİSTEMİ <----");
        System.out.println("        (sizin " + maksimumCehd + " cəhd haqqınız var)");
        System.out.println();

        while(cehd<maksimumCehd && !sistemeDaxilOldu){//while dövrü ilə həll
            System.out.print("🔧PİN kodunuzu daxil edin: ");
            int daxilEdilenPin = scanner.nextInt();
            cehd++;

            if (daxilEdilenPin==duzgunPin) {
                System.out.println("👏🏼 sistemə daxil oldunuz!");
                sistemeDaxilOldu = true;
                break; // Dövrü dayandır
            } else {
                if (cehd < maksimumCehd) {
                    System.out.println("❗️️ yanlış PİN -> yenidən cəhd edin");
                    System.out.println("         (qalan cəhd sayı: " + (maksimumCehd - cehd)+")");
                    System.out.println();
                }
            }
        }

        //əgər 3 cəhd bitibsə və hələ də daxil olmayıbsa
        if (!sistemeDaxilOldu) {
            System.out.println("‼️ kartınız bloklandı!");
            System.out.println("zəhmət olmasa bankla əlaqə saxlayın 😿");
        }

        scanner.close();
    }
}

//---------------------------------------------------------------------------------------------


//for

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int duzgunPin=7532;//düzgün PİN kodu
        int maksimumCehd=3;
        boolean sistemeDaxilOldu=false;
        System.out.println();
        System.out.println("      ----> ATM PİN KODU SİSTEMİ <----");
        System.out.println("        (sizin " + maksimumCehd + " cəhd haqqınız var)");
        System.out.println();
        
        for(int cehd=1; cehd<=maksimumCehd && !sistemeDaxilOldu; cehd++){//for dövrü ilə həll
            System.out.print("🔧PİN kodunuzu daxil edin: ");
            int daxilEdilenPin = scanner.nextInt();
            
            if (daxilEdilenPin==duzgunPin) {
                System.out.println("👏🏼 sistemə daxil oldunuz!");
                sistemeDaxilOldu = true;
                break; // Dövrü dayandır
            } else {
                if (cehd < maksimumCehd) {
                    System.out.println("❗️️ yanlış PİN -> yenidən cəhd edin");
                    System.out.println("         (qalan cəhd sayı: " + (maksimumCehd - cehd)+")");
                    System.out.println();
                }
            }
        }
        //əgər 3 cəhd bitibsə və hələ də daxil olmayıbsa
        if (!sistemeDaxilOldu) {
            System.out.println("‼️ kartınız bloklandı!");
            System.out.println("zəhmət olmasa bankla əlaqə saxlayın 😿");
        }
        scanner.close();
    }
}
