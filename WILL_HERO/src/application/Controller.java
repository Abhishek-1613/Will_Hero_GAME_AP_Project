package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller implements Initializable{

	@FXML
	private Button Quit;
	@FXML
	private Button Weapon1;
	@FXML
	private Button Weapon2;
	@FXML
	private Button Helmet1;
	@FXML
	private Button Helmet2;
	@FXML
	private Button i_newg;
	@FXML
	private Button i_resg;
	@FXML
	private Button i_shop;
	
	@FXML
	private AnchorPane Pane;
	
	@FXML
	private ImageView hero;
	@FXML
	private ImageView image1;
	@FXML
	private ImageView image2;
	@FXML
	private ImageView weaponhelmet;
	@FXML
	private ImageView dragonhelmet;
	@FXML
	private ImageView float1;
	@FXML
	private ImageView float2;
	@FXML
	private ImageView float3;
	@FXML
	private ImageView float4;
	@FXML
	private ImageView orc1;
	@FXML
	private ImageView orc2;
	@FXML
	private ImageView orc3;
	@FXML
	private ImageView orc4;
	@FXML
	private ImageView Bossorc;
	@FXML
	private ImageView weaponchest;
	@FXML
	private ImageView coinchest;
	@FXML
	private ImageView shuriken;
	@FXML
	private ImageView axe;
	
	
	private Stage st;
	private Scene sc;
	private Parent root;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		FadeTransition ft=new FadeTransition();
		ft.setNode(image1);
		ft.setDuration(Duration.seconds(1));
		ft.setCycleCount(1);
		ft.setInterpolator(Interpolator.EASE_BOTH);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
		
		FadeTransition ft1=new FadeTransition();
		ft1.setNode(image2);
		ft1.setDuration(Duration.seconds(1));
		ft1.setCycleCount(1);
		ft1.setInterpolator(Interpolator.EASE_BOTH);
		ft1.setFromValue(0);
		ft1.setToValue(1);
		ft1.play();
		
		FadeTransition w1=new FadeTransition();
		w1.setNode(weaponhelmet);
		w1.setDuration(Duration.seconds(1));
		w1.setCycleCount(1);
		w1.setInterpolator(Interpolator.EASE_BOTH);
		w1.setFromValue(0);
		w1.setToValue(1);
		w1.play();
		
		FadeTransition w2=new FadeTransition();
		w2.setNode(dragonhelmet);
		w2.setDuration(Duration.seconds(1));
		w2.setCycleCount(1);
		w2.setInterpolator(Interpolator.EASE_BOTH);
		w2.setFromValue(0);
		w2.setToValue(1);
		w2.play();
		
		FadeTransition weapon=new FadeTransition();
		weapon.setNode(weaponchest);
		weapon.setDuration(Duration.seconds(1));
		weapon.setCycleCount(1);
		weapon.setInterpolator(Interpolator.EASE_BOTH);
		weapon.setFromValue(0);
		weapon.setToValue(1);
		weapon.play();
		FadeTransition coin=new FadeTransition();
		coin.setNode(coinchest);
		coin.setDuration(Duration.seconds(1));
		coin.setCycleCount(1);
		coin.setInterpolator(Interpolator.EASE_BOTH);
		coin.setFromValue(0);
		coin.setToValue(1);
		coin.play();
		
		TranslateTransition shu=new TranslateTransition();
		shu.setNode(shuriken);
		shu.setDuration(Duration.seconds(1));
		shu.setCycleCount(4);
		shu.setByY(-100);
		shu.setByX(60);
		shu.setAutoReverse(true);
		shu.play();
		RotateTransition shur=new RotateTransition();
		shur.setNode(shuriken);
		shur.setDuration(Duration.seconds(0.5));
		shur.setCycleCount(6);
		shur.setInterpolator(Interpolator.LINEAR);
		shur.setByAngle(360);
		shur.play();
		
		TranslateTransition axe1=new TranslateTransition();
		axe1.setNode(axe);
		axe1.setDuration(Duration.seconds(1));
		axe1.setCycleCount(4);
		axe1.setByY(-100);
		axe1.setByX(-60);
		axe1.setAutoReverse(true);
		axe1.play();
		RotateTransition raxe=new RotateTransition();
		raxe.setNode(axe);
		raxe.setDuration(Duration.seconds(0.5));
		raxe.setCycleCount(6);
		raxe.setInterpolator(Interpolator.LINEAR);
		raxe.setByAngle(360);
		raxe.play();
		
		TranslateTransition t=new TranslateTransition();
		t.setNode(hero);
		t.setDuration(Duration.seconds(0.5));
		t.setCycleCount(TranslateTransition.INDEFINITE);
		t.setByY(-40);
		t.setAutoReverse(true);
		t.play();
		
		TranslateTransition o1=new TranslateTransition();
		o1.setNode(orc1);
		o1.setDuration(Duration.seconds(0.5));
		o1.setCycleCount(TranslateTransition.INDEFINITE);
		o1.setByY(-40);
		o1.setAutoReverse(true);
		o1.play();
		TranslateTransition o2=new TranslateTransition();
		o2.setNode(orc2);
		o2.setDuration(Duration.seconds(0.45));
		o2.setCycleCount(TranslateTransition.INDEFINITE);
		o2.setByY(-40);
		o2.setAutoReverse(true);
		o2.play();
		TranslateTransition o3=new TranslateTransition();
		o3.setNode(orc3);
		o3.setDuration(Duration.seconds(0.5));
		o3.setCycleCount(TranslateTransition.INDEFINITE);
		o3.setByY(-40);
		o3.setAutoReverse(true);
		o3.play();
		TranslateTransition o4=new TranslateTransition();
		o4.setNode(orc4);
		o4.setDuration(Duration.seconds(0.45));
		o4.setCycleCount(TranslateTransition.INDEFINITE);
		o4.setByY(-40);
		o4.setAutoReverse(true);
		o4.play();
		TranslateTransition boss=new TranslateTransition();
		boss.setNode(Bossorc);
		boss.setDuration(Duration.seconds(0.55));
		boss.setCycleCount(TranslateTransition.INDEFINITE);
		boss.setByY(-40);
		boss.setAutoReverse(true);
		boss.play();
		
		TranslateTransition f1=new TranslateTransition();
		f1.setNode(float1);
		f1.setDuration(Duration.seconds(4));
		f1.setCycleCount(TranslateTransition.INDEFINITE);
		f1.setByX(100);
		f1.setAutoReverse(true);
		f1.play();
		
		TranslateTransition f2=new TranslateTransition();
		f2.setNode(float2);
		f2.setDuration(Duration.seconds(4));
		f2.setCycleCount(TranslateTransition.INDEFINITE);
		f2.setByX(100);
		f2.setAutoReverse(true);
		f2.play();
		
		TranslateTransition f3=new TranslateTransition();
		f3.setNode(float3);
		f3.setDuration(Duration.seconds(4));
		f3.setCycleCount(TranslateTransition.INDEFINITE);
		f3.setByX(100);
		f3.setAutoReverse(true);
		f3.play();
		
		TranslateTransition f4=new TranslateTransition();
		f4.setNode(float4);
		f4.setDuration(Duration.seconds(4));
		f4.setCycleCount(TranslateTransition.INDEFINITE);
		f4.setByX(100);
		f4.setAutoReverse(true);
		f4.play();
	}
	
	public void Helmet(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Helmet.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	public void Weapon(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Weapon.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	public void Shop(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Shop.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	public void Start_page(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Scene.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	public void Pause_menu(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Pause_menu.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	public void Play_Game(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Play_Game.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	public void New_game(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("New_Game.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	public void How_to_play(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("How_to_play.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	
	public void Resume_game(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Resume_Game.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		st.setScene(sc);
		st.show();
	}
	
	public void Back_to_start(ActionEvent e)throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Scene.fxml"));
		st=(Stage)((Node)e.getSource()).getScene().getWindow();
		sc=new Scene(root);
		
		st.setScene(sc);
		st.show();
	}

	public void Helmet1(ActionEvent e) throws IOException
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("Helmet Bought");
		al.setHeaderText("You now have Dragon Helmet");
		al.setContentText("1000 Coins Spent.");
		
		if(al.showAndWait().get()==ButtonType.OK) {
			root=FXMLLoader.load(getClass().getResource("Shop.fxml"));
			st=(Stage)((Node)e.getSource()).getScene().getWindow();
			sc=new Scene(root);
			st.setScene(sc);
			st.show();
		}
	}
	
	public void Helmet2(ActionEvent e) throws IOException
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("Helmet Bought");
		al.setHeaderText("You now have Golden Helmet");
		al.setContentText("1000 Coins Spent.");
		
		if(al.showAndWait().get()==ButtonType.OK) {
			root=FXMLLoader.load(getClass().getResource("Shop.fxml"));
			st=(Stage)((Node)e.getSource()).getScene().getWindow();
			sc=new Scene(root);
			st.setScene(sc);
			st.show();
		}
	}
	
	public void Weapon1(ActionEvent e) throws IOException
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("Weapon Bought");
		al.setHeaderText("You now have Sword");
		al.setContentText("500 Coins Spent.");
		
		if(al.showAndWait().get()==ButtonType.OK) {
			root=FXMLLoader.load(getClass().getResource("Shop.fxml"));
			st=(Stage)((Node)e.getSource()).getScene().getWindow();
			sc=new Scene(root);
			st.setScene(sc);
			st.show();
		}
	}
	
	public void Weapon2(ActionEvent e) throws IOException
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("Weapon Bought");
		al.setHeaderText("You now have Axe");
		al.setContentText("500 Coins Spent.");
		
		if(al.showAndWait().get()==ButtonType.OK) {
			root=FXMLLoader.load(getClass().getResource("Shop.fxml"));
			st=(Stage)((Node)e.getSource()).getScene().getWindow();
			sc=new Scene(root);
			st.setScene(sc);
			st.show();
		}
	}
	
	public void i_newgame(ActionEvent e) throws IOException
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("New Game");
		al.setHeaderText("Click this to start a New Game");
		
		if(al.showAndWait().get()==ButtonType.OK) {
			root=FXMLLoader.load(getClass().getResource("Scene.fxml"));
			st=(Stage)((Node)e.getSource()).getScene().getWindow();
			sc=new Scene(root);
			st.setScene(sc);
			st.show();
		}
	}
	
	public void i_resumegame(ActionEvent e) throws IOException
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("Load Game");
		al.setHeaderText("Click this to load your Saved Game");
		
		if(al.showAndWait().get()==ButtonType.OK) {
			root=FXMLLoader.load(getClass().getResource("Scene.fxml"));
			st=(Stage)((Node)e.getSource()).getScene().getWindow();
			sc=new Scene(root);
			st.setScene(sc);
			st.show();
		}
	}
	
	public void i_shop(ActionEvent e) throws IOException
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("SHOP");
		al.setHeaderText("Click this if you want to buy using coins.");
		al.setContentText("Helmets and Weapons available");
		
		if(al.showAndWait().get()==ButtonType.OK) {
			root=FXMLLoader.load(getClass().getResource("Play_Game.fxml"));
			st=(Stage)((Node)e.getSource()).getScene().getWindow();
			sc=new Scene(root);
			st.setScene(sc);
			st.show();
		}
	}
	
	public void Quit(ActionEvent e)
	{
		Alert al=new Alert(AlertType.CONFIRMATION);
		al.setTitle("Logout");
		al.setHeaderText("You are going to logout!!");
		al.setContentText("Do you want to save before exiting");
		
		if(al.showAndWait().get()==ButtonType.OK) {
			st=(Stage)Pane.getScene().getWindow();
			System.out.println("Logged out");
			st.close();
		}
	}

}
