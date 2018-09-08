/* Parašykite programą kuri padėtu moksleiviui atlikti matematikos darbus. Jam reikia apskaičiuoti figūrų plotus.
Visi plotai skaičiuojami atskiruose metoduose. Moksleivis įveda rodmenys naudodamas konsolę
(Scanner sc = new Scanner(System.in)). Moksleivis gali pasirinkti kokios figūros plotą skaičiuos.
Po to sistema paprašo įvesti matmenys reikalingus tos figūros ploto skaičiavimui.
a.       Apskaičiuotu stačiojo trikampio plotą. Formulė rezultatas = (a*b)/2;
b.      Stačiakampio plotas, formulė rezultatas =a*b.
c.       Kvadrato plotas, rezultatas = a^2
d.      Apskritimo plotas, Formulė rezultatas = pi*(a^2). Pi = 3.1415
*/
package pagrindai.uzduotis03;

import java.util.Scanner;

public class RastiFigurosPlota {
    private static Scanner scanner = new Scanner(System.in);
    private static int figurosNumeris;
    private static double plotas;

    private RastiFigurosPlota() {
    }

    public static void rastiFigurosPlota() {
        pasirinktiFigura();
        ivestiDuomenis();
        isvestiDuomenis();
    }

    private static void pasirinktiFigura(){

        System.out.println("Pasirinkite figura:\nStatusis trikampis: 1\nStaciakampis: 2" +
                "\nKvadratas: 3\nApskritimas: 4");
         figurosNumeris = scanner.nextInt();
    }

    private static void ivestiDuomenis(){
        switch (figurosNumeris){
            case 1:
                skaiciuotiTrikampio();
                break;
            case 2:
                skaiciuotiStaciakampio();
                break;
            case 3:
                skaiciuotiKvadrato();
                break;
            case 4:
                skaiciuotiApskritimo();
                break;
                default:
                    System.out.println("Neteisingas ivedimas");
        }
    }

    private static void isvestiDuomenis(){
        System.out.printf("Duotos figuros plotas yra: %.3f", plotas);
    }

    private static void skaiciuotiTrikampio(){
        double krastineA = getKrastineA();
        double krastineB = getKrastineB();
        plotas = krastineA * krastineB / 2;
    }

    private static void skaiciuotiStaciakampio(){
        double krastineA = getKrastineA();
        double krastineB = getKrastineB();
        plotas = krastineA * krastineB;
    }

    private static void skaiciuotiKvadrato(){
        System.out.println("Iveskite krastines ilgi");
        double krastine = scanner.nextDouble();
        plotas = Math.pow(krastine,2);
    }

    private static void skaiciuotiApskritimo(){
        System.out.println("Iveskite spindulio ilgi");
        double spindulys = scanner.nextDouble();
        plotas = Math.pow(Math.PI * spindulys, 2);
    }

    private static double getKrastineA() {
        System.out.println("Iveskite pirmos krastines ilgi");
        return scanner.nextDouble();
    }

    private static double getKrastineB() {
        System.out.println("Iveskite antros krastines ilgi");
        return scanner.nextDouble();
    }

}
