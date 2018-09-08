package pagrindai.uzduotis06;

import pagrindai.CommonFunctions;

import java.util.Scanner;

public class SkaiciavimoVeiksmai {

    private static Scanner scanner = new Scanner(System.in);

    public static double suma(double pirmas, double antras) {
        double rezultatas = pirmas + antras;
        return rezultatas;
    }

    public static double skirtumas(double pirmas, double antras) {
        double rezultatas = pirmas - antras;
        return rezultatas;
    }

    public static double sandauga(double pirmas, double antras) {
        double rezultatas = pirmas * antras;
        return rezultatas;
    }

    public static double dalyba(double pirmas, double antras) {
        if(antras == 0){
            while (antras == 0) {
                System.out.println("Dalyba is nulio negalima. Iveskite kita skaiciu");
                String skaicius = scanner.nextLine();
                String perspejimas = "Iveskite ne nuli";
                antras = CommonFunctions.tikrinamArSkaicius(skaicius, perspejimas);
            }
        }
        double rezultatas = pirmas / antras;
        return rezultatas;
    }

    public static double kelimasLaipsniu(double pirmas, double antras) {
        double rezultatas = Math.pow(pirmas, antras);
        return rezultatas;
    }
}
