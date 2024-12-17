package ru.polkovnikova.polkovnikova_task8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label ALebal;

    @FXML
    private TextField ATexstField;

    @FXML
    private Button ResultButtun;

    @FXML
    private Label XLabel;

    @FXML
    private Label bLabel;

    @FXML
    private Label yLabel;

    @FXML
    void ResultButtunOnAction(ActionEvent event) {
        double a = Double.parseDouble(ATexstField.getText().toString());
        double X = Math.floor(a/12.0);
        double b = Math.floor( Math.exp(-a*X));
        double y = Math.floor(1-b*Math.sin(a*X+b));
        XLabel.setText("X="+X);
        bLabel.setText("b="+b);
        yLabel.setText("y="+y);



    }

}
