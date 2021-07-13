import java.util.Scanner;

public class Monolith {

    public static void main(String[] args) {
        System.out.print("Bitte Formel eingeben (a + b) ");
        String formel = new Scanner(System.in).nextLine();
        //var operanden = formel.split("\\+");
        String [] operanden = formel.split("\\+");
        Integer op1 = Integer.parseInt(operanden[0].trim());
        Integer op2 = Integer.parseInt(operanden[1].trim());
        Integer summe = op1+op2;
        System.out.printf("Das Ergebneis ist %d" , summe);
    }
}
