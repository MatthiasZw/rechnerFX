package Step6FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;

public class Start extends Application {
    static List<Calculable> operations;
    static IRechenWerk rechenWerk;
    static IBMParser ibmParser;
    public static void main(String[] args) {

            operations = new ArrayList<>();
            operations.add(new Addition());
            operations.add(new Subtraktion());
            operations.add(new Multiplikation());

            //Parsable parser = new Parser();
            rechenWerk = new RechnenWerk(operations);
            ibmParser = new IBMParser(operations);
        Start.launch();
            new CUI(ibmParser, rechenWerk).show();

    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vb = new VBox();
        vb.setSpacing(20);
        Button btnrechner = new Button("Berechnung");
        javafx.scene.control.TextField input = new javafx.scene.control.TextField();
        Label ergebnis = new Label();
        vb.getChildren().addAll(input,btnrechner,ergebnis);
        btnrechner.setOnAction(event -> {
            var formel  = ibmParser.parse(input.getText());
            ergebnis.setText("Ergebnis ist " + rechenWerk.rechne(formel));});

        stage.setTitle("Formelrechner");
        stage.setScene(new Scene(vb, 300, 275));
        stage.show();
    }

    }

