package pagrindai;

import java.util.Scanner;

public class Uzduotis02 {

    public Uzduotis02() {
        ivedimas();
        isvedimas();
    }
    String frazePradine;
    boolean arYra;

    private void ivedimas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite fraze");
        frazePradine = scanner.nextLine();
        String fraze = frazePradine.replaceAll("\\s","");
        arYra = arPolindromas(fraze);
    }
    private boolean arPolindromas(String fraze){
        for(int i  = 0; i < fraze.length() / 2; i++){
            if(fraze.charAt(i) != fraze.charAt(fraze.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    private void isvedimas(){
        if(arYra == true){
            System.out.println("Fraze " + frazePradine + " yra polindromas");
        }else {
            System.out.println("Fraze " + frazePradine + " nera polindromas");
        }
    }
}
