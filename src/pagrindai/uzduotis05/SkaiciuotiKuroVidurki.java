/*Antanas nusprendė nusipirkti naują automobilį ir jam svarbus rodiklis yra kuro sąnaudos.
Padėkite Antanui ir realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100 km.
Programa turi paprašyti Antano įvesti nuvažiuotus km ir kuro sąnaudas.
Formulė vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo. Vidurkio skaičiavimas vykdomas kitame metode.
Programa negali sustoti jei Antanas per klaidą įves tekstą, ji tu vėl prašyti pakartoti įvedimą.
Programa baigia darbą kai vidurkis apskaičiuotas sėkmingai.
 */
package pagrindai.uzduotis05;

import pagrindai.CommonFunctions;
import pagrindai.uzduotis04.SkaiciuotiKMI;

import java.util.Scanner;

public class SkaiciuotiKuroVidurki {

    private static Scanner scanner = new Scanner(System.in);
    private static double km;
    private static double kuroSanaudos;
    private static double kuroVidurkis;

    public SkaiciuotiKuroVidurki() {
    }

    public static void skaiciuotiKuroVidurki() {
        ivestiKmKura();
        skaiciuotiSanaudas();
        isvestiRezultata();
    }

    private static void ivestiKmKura(){
        String ivestiKm = "Iveskite nuvaziuotus km";
        System.out.println(ivestiKm);
        String ivedimas = scanner.nextLine();
        km = CommonFunctions.tikrinamArSkaicius(ivedimas,ivestiKm);
        String ivestiKura = "Iveskite kuro sanaudas";
        System.out.println(ivestiKura);
        kuroSanaudos = CommonFunctions.tikrinamArSkaicius(ivedimas, ivestiKura);
    }

    private static void skaiciuotiSanaudas(){
        kuroVidurkis = kuroSanaudos * 100 / km;
    }

    private static void isvestiRezultata(){
        System.out.printf("Automobilis sunaudoja %.2f litru/100km", kuroVidurkis);
    }
}
