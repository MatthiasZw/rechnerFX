package Step02_class_ok;

import java.util.Scanner;

public class CUI {

    public void show(){
        System.out.print("Bitte Formel eingeben (a +/- b) ");
        String formel = new Scanner(System.in).nextLine();
        Formel ergebnisformel = new Parser().parse(formel);
        //Integer summe =new RechnenWerk().addiere(ergebnisformel);
        Integer summe =new RechnenWerk().rechne(ergebnisformel);
        System.out.printf("Das Ergebneis ist %d" , summe);
    }
}
