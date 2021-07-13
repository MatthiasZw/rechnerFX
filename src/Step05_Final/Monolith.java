package Step05_Final;

import java.util.ArrayList;
import java.util.List;

public class Monolith {

    public static void main(String[] args) {

            List<Calculable> operations = new ArrayList<>();
            operations.add(new Addition());
            operations.add(new Subtraktion());
            operations.add(new Multiplikation());

            //Parsable parser = new Parser();
            IRechenWerk rechnenWerk= new RechnenWerk(operations);
            IBMParser ibmParser = new IBMParser(operations);

            new CUI(ibmParser, rechnenWerk).show();
    }
}
