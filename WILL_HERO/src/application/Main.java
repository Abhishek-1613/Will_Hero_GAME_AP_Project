package application;	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;


public class Main extends Application {
	

    @Override
    public void start(Stage Stage) throws ClassCastException{
        try
        {
        	Parent root=FXMLLoader.load(getClass().getResource("Scene.fxml"));
			Scene scene = new Scene(root);
			Image i1=new Image("willhero.png");
			Stage.getIcons().add(i1);
			Stage.setTitle("Will-Hero");
			Stage.setOnCloseRequest(event -> {
				event.consume();
				logout(Stage);
			});
			
			String css=this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			Stage.setScene(scene);
			Stage.show();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void logout(Stage st)
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("Logout");
		al.setHeaderText("You are going to logout!!");
		al.setContentText("Do you want to save before exiting");
		if(al.showAndWait().get()==ButtonType.OK)
		{
			System.out.println("Logged out");
			st.close();
		}
	}
    
    public static void main(String[] args) {
        launch(args);
    }
}