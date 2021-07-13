package Step04_Interface;

public class Monolith {

    public static void main(String[] args) {
            Parsable parser = new Parser();
            IRechenWerk rechnenWerk= new RechnenWerk();
            IBMParser ibmParser = new IBMParser();

            new CUI(ibmParser, rechnenWerk).show();
    }
}
