package Step6FX;

import java.util.Scanner;

public class CUI {
    private Parsable parser;
    private IRechenWerk rechnenWerk;

    public CUI(Parsable parser, IRechenWerk rechnenWerk) {
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
