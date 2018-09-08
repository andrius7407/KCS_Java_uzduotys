/*Jonukas mokykloje gavo užduotį patikrinti ar duoti terminai yra palindromai.
Jam sunku pačiam tai padaryti todėl jis prašo Jūsų pagalbos.
Parašykite metodą kuris patikrintų ar duotas žodis yra polindromas
(žodis ar sakinys kurį skaitant nuo galo gaunamas tas pats žodis ar sakinys,
pvz. “KOL EINU ŠUNIE LOK”, “ARGI TEN NE TIGRA” , “SĖDĖK UŽU KĖDĖS”).
Užuomina: pašalinti tarpus ir tuomet keliauti per pusę žodžio iš abiejų pusių tikrinant ar sutampa raidės.
 */
package pagrindai.uzduotis02;

import java.util.Scanner;

public class ArYraPalindromas {

    public static void nustatytiArYraPalindromas() {
        ivedimas();
        isvedimas();
    }
    private static String frazePradine;
    private static boolean arYra;

    private static void ivedimas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite fraze");
        frazePradine = scanner.nextLine();
        String fraze = frazePradine.replaceAll("\\s","");
        arYra = arPolindromas(fraze);
    }
    private static boolean arPolindromas(String fraze){
        for(int i  = 0; i < fraze.length() / 2; i++){
            if(fraze.charAt(i) != fraze.charAt(fraze.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    private static void isvedimas(){
        if(arYra){
            System.out.println("Fraze " + frazePradine + " yra polindromas");
        }else {
            System.out.println("Fraze " + frazePradine + " nera polindromas");
        }
    }
}
