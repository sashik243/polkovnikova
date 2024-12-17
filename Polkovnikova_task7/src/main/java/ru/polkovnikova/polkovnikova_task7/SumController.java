package ru.polkovnikova.polkovnikova_task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label A2Label;

    @FXML
    private TextField A2TextField;

    @FXML
    private Label A4Lable;

    @FXML
    private TextField A4TextField;

    @FXML
    private Label A8Label;

    @FXML
    private TextField A8TextField;

    @FXML
    private Label ALable;

    @FXML
    private TextField ATextField;

    @FXML
    private Button RecultButton;

    @FXML
    void RecultButtonOnAction(ActionEvent event) {
        double A = Double.parseDouble(ATextField.getText().toString());
        double A2 = A*A;
        double A4 = A2*A;
        double A8 = A4*A4;
        A4Lable.setText("A4="+A4);
        A8Label.setText("A8="+A8);
        A2Label.setText("A2="+A2);


    }

}
