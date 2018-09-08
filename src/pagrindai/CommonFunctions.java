package pagrindai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommonFunctions {

    private static Scanner scanner = new Scanner(System.in);

    private CommonFunctions() {
    }

    public static double tikrinamArSkaicius(String skaicius, String perspejimas) {
        double tikrinamasSkaicius;

            try {
                tikrinamasSkaicius = Double.parseDouble(skaicius);

            } catch (NumberFormatException e) {
               while (true){
                   System.out.println(perspejimas);
                   try {
                       tikrinamasSkaicius = scanner.nextDouble();
                       break;
                   }catch (InputMismatchException ex){
                       System.out.println("Pakartokite skaiciu");
                       scanner.nextLine();
                   }
               }
            }
        return tikrinamasSkaicius;
    }
}