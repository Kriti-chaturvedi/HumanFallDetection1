
	package application;

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
	         
	public class AnalyserOptions extends Application { 
	   public int choice = 0;
		@Override 
	   public void start(Stage stage) {    
	   
	      //Label for Effects of Falls 
	      Button btnEffectsOfFall = new Button("Effects of falls");
	      btnEffectsOfFall.setPrefWidth(400);
	      btnEffectsOfFall.setPrefHeight(50);
	      btnEffectsOfFall.setLayoutX(200);
	      btnEffectsOfFall.setLayoutY(200);
	      btnEffectsOfFall.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      btnEffectsOfFall.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	        	  choice = 1;
	              TypeOfDisplay tod = new TypeOfDisplay(choice);
	              System.out.println(choice);
	              tod.start(stage);
	              
	          }
	      });
	      
	    //Label for Total Falls per Month
	      Button btnTotalFallsPer = new Button("Total Falls per month");  
	      btnTotalFallsPer.setPrefWidth(400);
	      btnTotalFallsPer.setPrefHeight(50);
	      btnTotalFallsPer.setLayoutX(220);
	      btnTotalFallsPer.setLayoutY(220);
	      btnTotalFallsPer.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));	
	      btnTotalFallsPer.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	        	  choice = 2;
	        	  TypeOfDisplay tod = new TypeOfDisplay(choice);
	        	  System.out.println(choice);
	              tod.start(stage);
	          }
	      });
	      //btnTotalFallsPer.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
	    //Label for Fall within Age Group
	      Button btnFallsWithinAge = new Button("Falls within Age group");
	      btnFallsWithinAge.setPrefWidth(400);
	      btnFallsWithinAge.setPrefHeight(50);
	      btnFallsWithinAge.setLayoutX(230);
	      btnFallsWithinAge.setLayoutY(230);
	      btnFallsWithinAge.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));	
	      btnFallsWithinAge.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	        	  choice = 3;
	        	  TypeOfDisplay tod = new TypeOfDisplay(choice);
	        	  System.out.println(choice);
	              tod.start(stage);
	          }
	      });
	    //Label for 
	      Button btnCorrectOrFalse = new Button("Correct or False Alarms");
	      btnCorrectOrFalse.setPrefWidth(400);
	      btnCorrectOrFalse.setPrefHeight(50);
	      btnCorrectOrFalse.setLayoutX(240);
	      btnCorrectOrFalse.setLayoutY(240);
	      btnCorrectOrFalse.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      btnCorrectOrFalse.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	        	  choice = 4;
	        	  TypeOfDisplay tod = new TypeOfDisplay(choice);
	        	  System.out.println(choice);
	        	  tod.start(stage);
	          }
	      });
	    //Label for Comparer
	      Button btnFallsNotReported  = new Button("Falls not Reported");
	      btnFallsNotReported.setPrefWidth(400);
	      btnFallsNotReported.setPrefHeight(50);
	      btnFallsNotReported.setLayoutX(250);
	      btnFallsNotReported.setLayoutY(250);
	      btnFallsNotReported.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));	
	      btnFallsNotReported.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	        	  choice = 5;
	        	  TypeOfDisplay tod = new TypeOfDisplay(choice);
	        	  System.out.println(choice);
	              tod.start(stage);
	          }
	      });
	    //Label for Comparer
	      Button btnReasonOfFalls  = new Button("Reason of Falls");
	      btnReasonOfFalls.setPrefWidth(400);
	      btnReasonOfFalls.setPrefHeight(50);
	      btnReasonOfFalls.setLayoutX(260);
	      btnReasonOfFalls.setLayoutY(260);
	      btnReasonOfFalls.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      btnReasonOfFalls.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	        	  choice = 6;
	        	  TypeOfDisplay tod = new TypeOfDisplay(choice);
	        	  System.out.println(choice);
	              tod.start(stage);
	          }
	      });
	      
	      Button buttonback = new Button("Back"); 
	      buttonback.setPrefWidth(400);
	      buttonback.setPrefHeight(30);
	      buttonback.setLayoutX(390);
	      buttonback.setLayoutY(290);
	      buttonback.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));	
	      buttonback.setOnAction(new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent e) {
		              OptionsPage tod = new OptionsPage();
		              tod.start(stage);
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
	        
	       
	      gridPane.add(btnEffectsOfFall, 6, 8);  
	      gridPane.add(btnTotalFallsPer, 6, 13);
	      gridPane.add(btnFallsNotReported, 6, 18);  
	      gridPane.add(btnReasonOfFalls, 6, 23);
	      gridPane.add(btnCorrectOrFalse, 6, 28);  
	      gridPane.add(btnFallsWithinAge, 6, 33);
	      gridPane.add(buttonback,6,38);
	      
	      //Styling nodes   
	      btnEffectsOfFall.setStyle(
	         "-fx-background-color: darkgrey;"); 
	      
	      
	      btnTotalFallsPer.setStyle(
	 	         "-fx-background-color: darkgrey;");
	     
	      btnFallsNotReported.setStyle(
		 	         "-fx-background-color: darkgrey;");
	      
	      btnReasonOfFalls.setStyle(
		 	         "-fx-background-color: darkgrey;");
	      
	      btnCorrectOrFalse.setStyle(
		 	         "-fx-background-color: darkgrey;");
	      
	      btnFallsWithinAge.setStyle(
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
	     // launch(args); 
	  // } 
	}




