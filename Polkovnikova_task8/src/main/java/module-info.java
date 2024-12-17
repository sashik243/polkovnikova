module ru.polkovnikova.polkovnikova_task8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task8 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task8;
}