package Step05_Final;

public class Addition implements Calculable {
    String operator = "+";

    @Override
    public Integer rechne(Formel ergebnisformel) {
        return ergebnisformel.operand1 + ergebnisformel.operand2;
    }

    @Override
    public String getOperator() {
        return this.operator;
    }

    @Override
    public String getParseOperator() {
        return "\\+";
    }
}
