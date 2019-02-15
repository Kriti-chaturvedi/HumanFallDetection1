
	package application;

	import java.io.IOException;

import javafx.application.Application; 
	import javafx.collections.FXCollections; 
	import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets; 
	import javafx.geometry.Pos; 

	import javafx.scene.Scene; 
	import javafx.scene.control.Button; 
	import javafx.scene.control.CheckBox; 
	import javafx.scene.control.ChoiceBox; 
	import javafx.scene.control.DatePicker; 
	import javafx.scene.control.ListView; 
	import javafx.scene.control.RadioButton; 
	import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text; 
	import javafx.scene.control.TextField; 
	import javafx.scene.control.ToggleGroup;  
	import javafx.scene.control.ToggleButton; 
	import javafx.stage.Stage; 
	         
	public class OptionsPage extends Application { 
	   @Override 
	   public void start(Stage stage) {    
	   
	      //Label for Analyzer 
	      Button buttonAnalyser = new Button("ANALYSER"); 
	      buttonAnalyser.setPrefWidth(400);
	      buttonAnalyser.setPrefHeight(50);
	      buttonAnalyser.setLayoutX(200);
	      buttonAnalyser.setLayoutY(200);
	      buttonAnalyser.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      buttonAnalyser.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	              AnalyserOptions ao = new AnalyserOptions();
	              ao.start(stage);
	          }
	      });
	    //Label for Comparer
	      Button buttonComparer = new Button("COMPARER");  
	      buttonComparer.setPrefWidth(400);
	      buttonComparer.setPrefHeight(50);
	      buttonComparer.setLayoutX(220);
	      buttonComparer.setLayoutY(220);
	      buttonComparer.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      buttonComparer.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	              NoOfYearsOfData ao = new NoOfYearsOfData();
	              ao.start(stage);
	          }
	      });
	      
	      Button buttonback = new Button("Sign Out"); 
	      buttonback.setPrefWidth(400);
	      buttonback.setPrefHeight(30);
	      buttonback.setLayoutX(250);
	      buttonback.setLayoutY(230);
	      buttonback.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      buttonback.setOnAction(new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent e) {
		              Login tod = new Login();
		              try {
						tod.start(stage);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
		      });
	      //Creating a Grid Pane 
	      GridPane gridPane = new GridPane();    
	      
	      //Setting size for the pane 
	      gridPane.setMinSize(1000, 600); 
	       
	      //Setting the padding    
	      gridPane.setPadding(new Insets(10, 10, 10, 10));  
	      
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);       
	      
	      //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	       
	      //Arranging all the nodes in the grid 
	        
	       
	      gridPane.add(buttonAnalyser, 6, 8);  
	      gridPane.add(buttonComparer, 6, 13);
	      gridPane.add(buttonback, 6, 18);
	      
	      //Styling nodes   
	      buttonAnalyser.setStyle(
	         "-fx-background-color: darkgrey;"); 
	      
	      buttonComparer.setStyle(
	 	         "-fx-background-color: darkgrey;");
	      buttonback.setStyle(
		 	         "-fx-background-color: LAVENDER;");
	      
	       //Setting the back ground color 
	      gridPane.setStyle("-fx-background-color: LAVENDER;");       
	       
	      //Creating a scene object 
	      Scene scene = new Scene(gridPane); 
	      
	      //Setting title to the Stage 
	      stage.setTitle("Please select the options"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene);  
	      
	      //Displaying the contents of the stage 
	      stage.show(); 
	   }      
	  // public static void main(String args[]){ 
	    //  launch(args); 
	      //Application.launch(AnalyserOptions.class, args);
	      //Application.launch(TypeOfDisplay.class, args);
	      
	   //} 
	}


