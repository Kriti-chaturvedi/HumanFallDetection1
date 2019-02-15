package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			//BorderPane root = new BorderPane();
			//Creating a Text object 
		      Text text = new Text(); 
		       
		      //Setting font to the text 
		      //text.setFont(new Font(45)); 
		      text.setFont(Font.font("cambria", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 40));	    
		      text.setUnderline(true);
		      //setting the position of the text 
		      text.setX(150); 
		      text.setY(150);          
		      
		      //Setting the text to be added. 
		      text.setText("Welcome to Health Authorities Project"); 
		   

		      Button button2 = new Button("Sign IN");  
		      button2.setPrefWidth(100);
		      button2.setPrefHeight(50);
		      button2.setLayoutX(450);
		      button2.setLayoutY(300);
		      button2.setStyle("-fx-background-color: LIGHTBLUE;");
		      button2.setOnAction(new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent e) {
		              Login lg = new Login();
		              try {
						lg.start(stage);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		              
		          }
		      });
		      
		      
		      //Creating a Group object  
		      Group root = new Group(); 
		       
		      //Retrieving the observable list object 
		      ObservableList list = root.getChildren(); 
		       
		      //Setting the text object as a node to the group object 
		      list.add(text);  
		      //list.add(image);
		      //list.add(imageView);
		      list.add(button2);
		      
			Scene scene = new Scene(root,1000,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setTitle("Health Authorities");
			scene.setFill(Color.LAVENDER);
	
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		//Application.launch(Login.class, args);
	//	Application.launch(SignUpForm.class, args);
		//Application.launch(OptionsPage.class, args);
		//Application.launch(AnalyserOptions.class, args);
		//Application.launch(TypeOfDisplay.class, args);
		//Application.launch(EffectAnalysis.class, args);
		//Application.launch(EffectAnalysisBar.class, args);
	}
}
