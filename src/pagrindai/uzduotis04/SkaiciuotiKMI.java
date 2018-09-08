/* Parašyti programą, kuri padėtu Jonukui apsiskaičiuoti savo kūno masės indeksą.
Jonukas turi įvesti savo masę ir ūgį, pagal gautus duomenis paskaičiuotų ir atvaizduotų
jo kūno masės indeksą. KMI = masė (kg) / (ūgis(m))^2. Jonuko duomenų nuskaitymas ir skaičiavimas
vykdomi skirtinguose metoduose. Papildykite programa, kad jei Jonukas įvestu ne skaičių programa
pasakytu, kad blogai įvestas skaičius ir leistu pakartoti. Programa baigtu darbą tik tada kai abu
skaičiai įvesti gerai ir kmi apskaičiuotas.
 */
package pagrindai.uzduotis04;

import pagrindai.CommonFunctions;

import java.util.Scanner;

public class SkaiciuotiKMI {
    private static Scanner scanner = new Scanner(System.in);
    private static double svoris;
    private static double ugis;
    private static double kunoMasesIndeksas;

    private SkaiciuotiKMI() {
    }

    public static void skaiciuotiKMI() {
        ivedimas();
        skaiciavimasKMI();
        isvedimas();
    }

    private static void ivedimas() {
        System.out.println("Iveskite svori 'kg'");
        String ivedimas = scanner.nextLine();
        svoris = CommonFunctions.tikrinamArSkaicius(ivedimas, "Pakartokite svori");
        System.out.println("Iveskite ugi 'm,cm'");
        ivedimas = scanner.nextLine();
        ugis = CommonFunctions.tikrinamArSkaicius(ivedimas, "Pakartokite ugi");
    }

    private static void skaiciavimasKMI() {
        kunoMasesIndeksas = svoris / Math.pow(ugis, 2);
    }
    private static void isvedimas(){
        System.out.printf("Kuno mases indeksas yra %.3f", kunoMasesIndeksas);
    }


}
