/* Parašyti programą, kuri padėtu Jonukui apsiskaičiuoti savo kūno masės indeksą.
Jonukas turi įvesti savo masę ir ūgį, pagal gautus duomenis paskaičiuotų ir atvaizduotų
jo kūno masės indeksą. KMI = masė (kg) / (ūgis(m))^2. Jonuko duomenų nuskaitymas ir skaičiavimas
vykdomi skirtinguose metoduose. Papildykite programa, kad jei Jonukas įvestu ne skaičių programa
pasakytu, kad blogai įvestas skaičius ir leistu pakartoti. Programa baigtu darbą tik tada kai abu
skaičiai įvesti gerai ir kmi apskaičiuotas.
 */
package pagrindai;

import java.util.Scanner;

public class Uzduotis04 {
    Scanner scanner = new Scanner(System.in);
    double svoris;
    double ugis;
    double kunoMasesIndeksas;

    public Uzduotis04() {
        ivedimas();
        skaiciavimasKMI();
        isvedimas();
    }

    private void ivedimas() {
        System.out.println("Iveskite svori 'kg'");
        svoris = tikrinamArSkaicius(scanner);
        System.out.println("Iveskite ugi 'm,cm'");
        ugis = tikrinamArSkaicius(scanner);
    }

    private void skaiciavimasKMI() {
        kunoMasesIndeksas = svoris / Math.pow(ugis, 2);
    }
    private void isvedimas(){
        System.out.printf("Kuno mases indeksas yra %.3f", kunoMasesIndeksas);
    }

    public static double tikrinamArSkaicius(Scanner scanner) {
        double skaicius = 0;
        while (skaicius == 0) {
            String tikrinamas = scanner.nextLine();
            try {
                skaicius = Double.parseDouble(tikrinamas);
            } catch (NumberFormatException e) {
                System.out.println("Ivedete ne skaiciu, pakartokite");
            }
        }
        return skaicius;
    }
}
