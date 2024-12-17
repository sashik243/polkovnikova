package ru.polkovnikova.polkovnikova_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ResultButton;

    @FXML
    private Label xLabel;

    @FXML
    private TextField xTextField;

    @FXML
    private Label yLabel;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double y = 3*Math.pow(x,6)-6*Math.pow(x,2)-7;
        yLabel.setText("y="+y);

    }

}
