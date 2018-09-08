/*Onutei sunkiai sekasi mokytis matematiką ir ji neturi skaičiuotuvo, padėkite Onutei ir sukurkite skaičiuotuvą kuris atliktu:
a.       Sumos
b.      Skirtumo
c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
d.      Daugybos
e.       Kėlimas laipsniu
Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje.
Onutei negalima leisti įvesti blogą skaičių ir netinkamą operaciją reikia prašyti pakartoti įvedimą.
Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.
*/
package pagrindai.uzduotis06;

import pagrindai.CommonFunctions;

import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);
    private static double pirmasSkaicius;
    private static double antrasSkaicius;
    private static String veiksmas;
    private static double rezultatas;

    public Calculator() {
    }

    public static void calculator() {
        ivestiDuomenis();
        skaiciuoti();
        spausdintiRezultata();
    }

    private static void ivestiDuomenis() {
        int saugiklis = 0;
        while (saugiklis == 0) {
            System.out.println("Iveskite skaiciu veiksma skaiciu");
            String eilute = scanner.nextLine();
            String[] duomenys = eilute.split(" ");
            if (duomenys.length == 3) {
                pirmasSkaicius = CommonFunctions.tikrinamArSkaicius(duomenys[0], "Pakartokite pirma skaiciu");
                antrasSkaicius = CommonFunctions.tikrinamArSkaicius(duomenys[2], "Pakartokite antra skaiciu");
                veiksmas = duomenys[1];
                saugiklis = 1;
            } else {
                System.out.println("Pakartokite ivedima: skaicius zenklas skaicius");
            }
        }
    }

    private static void skaiciuoti() {
        switch (veiksmas) {
            case "+":
                rezultatas = SkaiciavimoVeiksmai.suma(pirmasSkaicius, antrasSkaicius);
                break;
            case "-":
                rezultatas = SkaiciavimoVeiksmai.skirtumas(pirmasSkaicius, antrasSkaicius);
                break;
            case "*":
                rezultatas = SkaiciavimoVeiksmai.sandauga(pirmasSkaicius, antrasSkaicius);
                break;
            case "/":
                rezultatas = SkaiciavimoVeiksmai.dalyba(pirmasSkaicius, antrasSkaicius);
                break;
            case "^":
                rezultatas = SkaiciavimoVeiksmai.kelimasLaipsniu(pirmasSkaicius, antrasSkaicius);
                break;
        }
    }

    private static void spausdintiRezultata(){
        System.out.println(rezultatas);
    }

}
