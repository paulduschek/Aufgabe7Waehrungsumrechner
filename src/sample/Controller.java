package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * @author Paul Duschek
 * @version 1.0, 16.11.2020 <- Uebung 7
 * @version 2.0, 25.11.2020 <- Uebung 8
 */

public class Controller implements Initializable {

    @FXML
    Button b = new Button();
    @FXML
    TextField t1 = new TextField();
    @FXML
    TextField t2 = new TextField();
    @FXML
    public ChoiceBox<String> cBox = new ChoiceBox<>();

    private CurrencyConverter currencyConverter;

    public void doConvertion()
    {
        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double e = Double.parseDouble(t1.getText());
                String value = cBox.getValue();
                t2.setText(String.valueOf(currencyConverter.euroTo(value, e)));
            }
        };
        b.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        currencyConverter = new CurrencyConverter();
        for(int x = 0; x < currencyConverter.cl.size(); x++)
        {
            cBox.getItems().addAll(currencyConverter.Name(x));
        }
    }
}
