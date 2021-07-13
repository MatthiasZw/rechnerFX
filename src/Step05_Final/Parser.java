package Step05_Final;

public class Parser implements Parsable {


    public Formel parse(String formel) {
        Formel ergebnisformel = new Formel();

        //var operanden = formel.split("\\+");
        if(formel.contains("+")){
            ergebnisformel.operator = "\\+";
        }else if ( formel.contains("-")){
            ergebnisformel.operator = "-";
        }


        String [] operanden = formel.split(ergebnisformel.operator);

        if(ergebnisformel.operator.equals("\\+")){
            ergebnisformel.operator = new String("+");
        }
        ergebnisformel.operand1 = Integer.parseInt(operanden[0].trim());
        ergebnisformel.operand2 = Integer.parseInt(operanden[1].trim());
        return ergebnisformel;
    }
}
