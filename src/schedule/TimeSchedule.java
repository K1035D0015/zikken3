/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author o231035k
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TimeSchedule {
   @FXML
    private TableView<TimeSchedule> table;
    @FXML
    private TableColumn TimeColumn;
    @FXML
    private TableColumn ScheduleColumn;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
