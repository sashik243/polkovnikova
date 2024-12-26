package ru.polkovnikova.polkovnikova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class SumController {

    @FXML
    private Label aTextFiew;

    @FXML
    private Label bTextFiew;

    @FXML
    private Button btncalculation;

    @FXML
    private Label hypotenuseResult;

    @FXML
    private TextField hypotenusetxt;

    @FXML
    private Label perimeterResult;

    @FXML
    private TextField perimetertxt;

    @FXML
    private TextField txta;

    @FXML
    private TextField txtb;

    @FXML
    void btncalculationOnAction(ActionEvent event) {
        double a = Double.parseDouble(txta.getText().toString());
        double b = Double.parseDouble(txtb.getText().toString());
        double p;
        double c = Math.floor(Math.sqrt((pow(a,2)+pow(b,2))));
        p = Math.floor(a+b+c);
        perimetertxt.setText("" + p);
        hypotenusetxt.setText(""+c);

    }

}
