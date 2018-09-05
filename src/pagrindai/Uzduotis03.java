package pagrindai;

import java.util.Scanner;

//pasirinkti figura ir apskaiciuoti jos plota
public class Uzduotis03 {
    Scanner scanner = new Scanner(System.in);
    int figurosNumeris;
    double plotas;

    public Uzduotis03() {
        pasirinktiFigura();
        ivestiDuomenis();
        isvestiDuomenis();
    }

    private void pasirinktiFigura(){
        System.out.println("Pasirinkite figura:\nStatusis trikampis: 1\nStaciakampis: 2" +
                "\nKvadratas: 3\nApskritimas: 4");
         figurosNumeris = scanner.nextInt();
    }

    private void ivestiDuomenis(){
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

    private void isvestiDuomenis(){
        System.out.printf("Duotos figuros plotas yra: %.3f", plotas);
    }

    private void skaiciuotiTrikampio(){
        double krastineA = getKrastineA();
        double krastineB = getKrastineB();
        plotas = krastineA * krastineB / 2;
    }

    private void skaiciuotiStaciakampio(){
        double krastineA = getKrastineA();
        double krastineB = getKrastineB();
        plotas = krastineA * krastineB;
    }

    private void skaiciuotiKvadrato(){
        System.out.println("Iveskite krastines ilgi");
        double krastine = scanner.nextDouble();
        plotas = Math.pow(krastine,2);
    }

    private void skaiciuotiApskritimo(){
        System.out.println("Iveskite spindulio ilgi");
        double spindulys = scanner.nextDouble();
        plotas = Math.pow(Math.PI * spindulys, 2);
    }

    private double getKrastineA() {
        System.out.println("Iveskite pirmos krastines ilgi");
        return scanner.nextDouble();
    }

    private double getKrastineB() {
        System.out.println("Iveskite antros krastines ilgi");
        return scanner.nextDouble();
    }

}
