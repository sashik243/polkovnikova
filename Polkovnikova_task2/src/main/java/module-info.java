module ru.polkovnikova.polkovnikova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task2 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task2;
}