module ru.polkovnikova.polkovnikova_task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task7 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task7;
}