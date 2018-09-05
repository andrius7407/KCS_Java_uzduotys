package pagrindai;

import java.util.Scanner;

public class Uzduotis01 {

    //konstruktorius
    public Uzduotis01() {
        kartojamasIvedimas();
    }

    //prasome ivesti zodi ir ji atspausdiname
    private void kartojamasIvedimas(){
        nutraukti:{
            Scanner scanner = new Scanner(System.in);
            String ivestasZodis = "zodis";

            while (!ivestasZodis.toLowerCase().equals("pabaiga")){
                System.out.println("Iveskite zodi");
                ivestasZodis = scanner.nextLine();
                if(!ivestasZodis.toLowerCase().equals("pabaiga")) {
                    int kiekZodyjeRaidziu = ivestasZodis.length();

                    if (kiekZodyjeRaidziu % 2 == 0) {
                        System.out.println("Ivestas zodis yra lyginis");
                    } else {
                        System.out.println("Ivestas zodis yra nelyginis");
                    }

                    int kiekYraA = skaiciuotiRaidesA(ivestasZodis);

                    System.out.println(ivestasZodis + ", zodyje yra " + kiekYraA + " a raidziu");
                }
            }
        }
    }
    private int skaiciuotiRaidesA(String ivestasZodis){
        int kiekYraA = 0;
        for (int i = 0; i < ivestasZodis.length(); i++){
            if(ivestasZodis.charAt(i) == 'a'){
                kiekYraA++;
            }
        }
        return kiekYraA;
    }
}

