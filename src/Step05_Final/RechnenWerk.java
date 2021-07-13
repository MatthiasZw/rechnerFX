package Step05_Final;

import java.util.List;

public class RechnenWerk implements IRechenWerk {

    List<Calculable> operations;
    public RechnenWerk(List<Calculable> operations) {
        this.operations = operations;
    }

    /*public Integer addiere(Formel ergebnisformel) {
            return  ergebnisformel.operand1+ ergebnisformel.operand2;
        }*/
    public Integer rechne (Formel ergebnisformel){
        for (var op:this.operations ) {
            if(ergebnisformel.operator.equals(op.getOperator())){
               return op.rechne(ergebnisformel);
            }
        }
        return 0;
    }
}
