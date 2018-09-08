package pagrindai;

import pagrindai.uzduotis01.NustatytiArIvestuZodziuIlgisLyginis;
import pagrindai.uzduotis02.ArYraPalindromas;
import pagrindai.uzduotis03.RastiFigurosPlota;
import pagrindai.uzduotis04.SkaiciuotiKMI;
import pagrindai.uzduotis05.SkaiciuotiKuroVidurki;
import pagrindai.uzduotis06.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Pasirinkite uzduoti nuo 1 iki 6");
        int pasirinkti = scanner.nextInt();

        switch (pasirinkti){
            case 1:
                NustatytiArIvestuZodziuIlgisLyginis.kartojamasIvedimas();
                break;
            case 2:
                ArYraPalindromas.nustatytiArYraPalindromas();
                break;
            case 3:
                RastiFigurosPlota.rastiFigurosPlota();
                break;
            case 4:
                SkaiciuotiKMI.skaiciuotiKMI();
                break;
            case 5:
                SkaiciuotiKuroVidurki.skaiciuotiKuroVidurki();
                break;
            case 6:
                Calculator.calculator();
                break;
            default:
                System.out.println("Klaida: tokios uzduoties nera");
        }
    }
}
