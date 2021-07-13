package Step01_class;

import java.util.Scanner;

public class CUI {

    public void show(){
        System.out.print("Bitte Formel eingeben (a + b) ");
        String formel = new Scanner(System.in).nextLine();
        //var operanden = formel.split("\\+");
        Formel ergebnisformel = new Parser().parse(formel);
        Integer summe =new RechnenWerk().addiere(ergebnisformel);
        System.out.printf("Das Ergebneis ist %d" , summe);
    }
}
