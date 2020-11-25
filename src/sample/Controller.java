package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


/**
 * @author Paul Duschek
 * @version 1.0, 16.11.2020 <- Uebung 8
 * @version 2.0, 25.11.2020 <- Uebung 9
 */

public class Controller extends CurrencyConverter{

    @FXML
    Button b = new Button();
    @FXML
    TextField t1 = new TextField();
    @FXML
    TextField t2 = new TextField();

    public void doConvertion()
    {
        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double e = Double.parseDouble(t1.getText());
                t2.setText(String.valueOf(euroToYen(e)));
            }
        };
        b.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
    }
}
