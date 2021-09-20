package it.univr.studyholiday.controller;

import it.univr.studyholiday.HelloApplication;
import it.univr.studyholiday.model.Reservation;
import it.univr.studyholiday.model.UserType;
import it.univr.studyholiday.util.Database.Fetch;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentProfileController implements Initializable {

    @FXML
    public ListView<Reservation> vacanzePrenotateListView;
    @FXML
    public ListView<Reservation> vacanzePassateListView;
    @FXML
    public TextField nomeTextField;
    @FXML
    public TextField cognomeTextField;
    @FXML
    public DatePicker dataDinascitaPicker;
    @FXML
    public TextField indirizzoTextField;
    @FXML
    public TextField telefonoTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // Visualizza una Collection<Reservation> nel primo TextField se Fetch non ritorna null
//        if (Fetch.allReservationsFor(UserType.getStudent().getEmail()) != null) {
//            vacanzePrenotateListView.getItems().addAll(Fetch.allReservationsFor(UserType.getStudent().getEmail()));
//        }

    }

    public void salvaModificheAction() throws IOException {
        // TODO: Assicurarsi che tutto sia stato completato


        HelloApplication.setRoot("student_menu_view");
    }

    public void backButtonAction() throws IOException {
        HelloApplication.setRoot("student_menu_view");
    }
}
