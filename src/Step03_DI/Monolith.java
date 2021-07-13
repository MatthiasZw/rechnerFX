package Step03_DI;

public class Monolith {

    public static void main(String[] args) {
            Parser parser = new Parser();
            RechnenWerk rechnenWerk= new RechnenWerk();
            IBMParser ibmParser = new IBMParser();

            new CUI(parser, rechnenWerk).show();
    }
}
