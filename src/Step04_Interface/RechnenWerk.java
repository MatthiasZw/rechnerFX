package Step04_Interface;

public class RechnenWerk implements IRechenWerk{
    /*public Integer addiere(Formel ergebnisformel) {
        return  ergebnisformel.operand1+ ergebnisformel.operand2;
    }*/
    public Integer rechne (Formel ergebnisformel){
        switch (ergebnisformel.operator){
            case "+" : return ergebnisformel.operand1+ergebnisformel.operand2;
            case "-" : return ergebnisformel.operand1-ergebnisformel.operand2;
            default:
                return 0;
        }
       // return 0;
    }
}
