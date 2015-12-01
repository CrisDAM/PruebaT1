package controlador;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import vista.Ventana1Controller;

/**
 * Interfaz sencilla de perfil de GitHub
 *
 * @author Cris
 * @version 0.9
 */
public class Principal extends Application {

	private Stage primaryStage;
	private AnchorPane anchorPane;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Login");

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("../vista/Ventana1.fxml"));
			anchorPane = (AnchorPane) loader.load();

			Scene scene = new Scene(anchorPane);
			primaryStage.setScene(scene);
			primaryStage.show();

			//primaryStage.setResizable(false);

			Ventana1Controller controller = loader.getController();
	        controller.setPrincipal(this);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
