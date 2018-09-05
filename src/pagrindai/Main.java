package pagrindai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Pasirinkite uzduoti nuo 1 iki 3");
        int pasirinkti = scanner.nextInt();

        switch (pasirinkti){
            case 1:
                new Uzduotis01();
                break;
            case 2:
                new Uzduotis02();
                break;
            case 3:
                new Uzduotis03();
                break;
            default:
                System.out.println("Klaida: tokios uzduoties nera");
        }
    }
}
