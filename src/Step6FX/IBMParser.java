package Step6FX;

import java.util.List;

public class IBMParser implements Parsable {

    List<Calculable> operations;
    public IBMParser(List<Calculable> operations) {
        this.operations = operations;
    }

    public Formel parse(String formel) {
        Formel ergebnisformel = new Formel();
        for (var op:this.operations ) {
            if(formel.contains(op.getOperator())){
                ergebnisformel.operator=op.getParseOperator();
            }
        }
        if (ergebnisformel.operator == null)
            throw  new IllegalArgumentException("Opertion nicht implementiert");


        String [] operanden = formel.split(ergebnisformel.operator);

        for (var op:this.operations ) {
            if(formel.contains(op.getOperator())){
                ergebnisformel.operator=op.getOperator();
            }
        }

        ergebnisformel.operand1 = Integer.parseInt(operanden[0].trim());
        ergebnisformel.operand2 = Integer.parseInt(operanden[1].trim());
        return ergebnisformel;
    }

}

