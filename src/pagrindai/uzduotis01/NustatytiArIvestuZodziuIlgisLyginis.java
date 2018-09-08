/*Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų, tada vėl paprašytų įvesti kitą žodį,
jį atvaizduotų, ir procesą kartotų tol, kol nebus įvestas žodis „pabaiga“.
Patikrinkite ar įvestas žodžio ilgis yra lyginis ar ne tam panaudokite % operatoriu.
Jei žodis yra lyginis atspausdinkite “Įvestas žodis  {įvestas_žodis} yra lyginis” ir šalia kokio ilgio yra žodis.
Jei nelyginis “Įvestas žodis {įvestas_žodis} nelyginis” šalia jo ilgį. Taip suskaičiuokite kiek tame žodyje yra “a” raidžių.
*/
package pagrindai.uzduotis01;

import java.util.Scanner;

public class NustatytiArIvestuZodziuIlgisLyginis {

    private NustatytiArIvestuZodziuIlgisLyginis() {
    }

    //prasome ivesti zodi ir ji atspausdiname
    public static void kartojamasIvedimas(){

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
    private static int skaiciuotiRaidesA(String ivestasZodis){
        int kiekYraA = 0;
        for (int i = 0; i < ivestasZodis.length(); i++){
            if(ivestasZodis.charAt(i) == 'a'){
                kiekYraA++;
            }
        }
        return kiekYraA;
    }
}

