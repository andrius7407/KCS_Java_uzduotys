/*Antanas nusprendė nusipirkti naują automobilį ir jam svarbus rodiklis yra kuro sąnaudos.
Padėkite Antanui ir realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100 km.
Programa turi paprašyti Antano įvesti nuvažiuotus km ir kuro sąnaudas.
Formulė vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo. Vidurkio skaičiavimas vykdomas kitame metode.
Programa negali sustoti jei Antanas per klaidą įves tekstą, ji tu vėl prašyti pakartoti įvedimą.
Programa baigia darbą kai vidurkis apskaičiuotas sėkmingai.
 */
package pagrindai;

import java.util.Scanner;

public class Uzduotis05 {
    Scanner scanner = new Scanner(System.in);
    double km;
    double kuroSanaudos;
    double kuroVidurkis;

    public Uzduotis05() {
        ivestiKmKura();
        skaiciuotiSanaudas();
        isvestiRezultata();
    }

    private void ivestiKmKura(){
        System.out.println("Iveskite nuvaziuotus km");
        km = Uzduotis04.tikrinamArSkaicius(scanner);
        System.out.println("Iveskite kuro sanaudas");
        kuroSanaudos = Uzduotis04.tikrinamArSkaicius(scanner);
    }

    private void skaiciuotiSanaudas(){
        kuroVidurkis = kuroSanaudos * 100 / km;
    }

    private void isvestiRezultata(){
        System.out.printf("Automobilis sunaudoja %.2f litru/100km", kuroVidurkis);
    }
}
