package Step03_DI;

import java.util.Scanner;

public class CUI {
    private  Parser parser;
    private  RechnenWerk rechnenWerk;

    public CUI(Parser parser, RechnenWerk rechnenWerk) {
        this.parser= parser;
        this.rechnenWerk=rechnenWerk;
    }

    public void show(){
        System.out.print("Bitte Formel eingeben (a +/- b) ");
        String formel = new Scanner(System.in).nextLine();
        Formel ergebnisformel = parser.parse(formel);
        //Integer summe =new RechnenWerk().addiere(ergebnisformel);
        Integer summe =rechnenWerk.rechne(ergebnisformel);
        System.out.printf("Das Ergebneis ist %d" , summe);
    }
}
