module ru.polkovnikova.polkovnikova_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task6 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task6;
}