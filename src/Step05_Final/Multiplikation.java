package Step05_Final;

public class Multiplikation implements Calculable{
    @Override
    public Integer rechne(Formel ergebnisformel) {
        return ergebnisformel.operand1*ergebnisformel.operand2;
    }

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public String getParseOperator() {
        return "\\*";
    }
}
