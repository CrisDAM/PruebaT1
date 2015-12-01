package vista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import controlador.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ventana1Controller implements Initializable{

	private Principal principal;
	
	@FXML
	private Button btnEnviar;

	@FXML
	private void onClickEnviar(ActionEvent event) throws Exception{

		((Node) (event.getSource())).getScene().getWindow().hide();

		Parent parent = FXMLLoader.load(getClass().getResource("../vista/Ventana2.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Formulario");
		stage.show();
		stage.setResizable(false);

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
	}

	public void setPrincipal(Principal principal){
		this.principal = principal;
	}

}
