
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
	         
	public class TypeOfDisplay extends Application { 
		public int choice;
		public TypeOfDisplay(int s)
		{
			choice = s;
			System.out.println("choice " +choice);
		}
	   @Override 
	   public void start(Stage stage) {    
	   
	      //Label for Display type 
	      Button buttonPie = new Button("Pie Chart"); 
	      buttonPie.setPrefWidth(400);
	      buttonPie.setPrefHeight(50);
	      buttonPie.setLayoutX(200);
	      buttonPie.setLayoutY(200);
	      buttonPie.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      buttonPie.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	              switch(choice)
	              {
	              
	              case 1: EffectAnalysis analysis = new EffectAnalysis();
	                      analysis.start(stage);
	                      break;
	        	  
	              case 2: TotalFallsPerMonth_Pie analysis1 = new TotalFallsPerMonth_Pie();
                  analysis1.start(stage);
                  break;
                  
	              case 3: FallsWithinAgeGroup_Pie analysis2 = new FallsWithinAgeGroup_Pie();
                  analysis2.start(stage);
                  break;
                  
	              case 4: CorrectOrFalseAlarms_Pie analysis3 = new CorrectOrFalseAlarms_Pie();
                  analysis3.start(stage);
                  break;
                  
	              case 5: FallsNotReported_Pie analysis4 = new FallsNotReported_Pie();
                  analysis4.start(stage);
                  break;
                  
	              case 6: ReasonsOfFall_Pie analysis5 = new ReasonsOfFall_Pie();
                  analysis5.start(stage);
                  break;
	              }
	          }
	      });
	    //Label for Comparer
	      Button buttonbar = new Button("Bar Graph");  
	      buttonbar.setPrefWidth(400);
	      buttonbar.setPrefHeight(50);
	      buttonbar.setLayoutX(210);
	      buttonbar.setLayoutY(210);
	      buttonbar.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      buttonbar.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	        	  switch(choice)
	              {
	              
	              case 1: EffectAnalysisBar analysis = new EffectAnalysisBar();
	                      analysis.start(stage);
	                      break;
	        	  
	              case 2: TotalFallsPerMonth_Bar analysis1 = new TotalFallsPerMonth_Bar();
                  analysis1.start(stage);
                  break;
                  
	              case 3: FallsWithinAgeGroup_Bar analysis2 = new FallsWithinAgeGroup_Bar();
                  analysis2.start(stage);
                  break;
                  
	              case 4: CorrectOrFalseAlarms_Bar analysis3 = new CorrectOrFalseAlarms_Bar();
                  analysis3.start(stage);
                  break;
                  
	              case 5: FallsNotReported_Bar analysis4 = new FallsNotReported_Bar();
                  analysis4.start(stage);
                  break;
                  
	              case 6: ReasonsOfFall_Bar analysis5 = new ReasonsOfFall_Bar();
                  analysis5.start(stage);
                  break;
	              }
	          }
	      });
	      
	      Button buttonback = new Button("Back"); 
	      buttonback.setPrefWidth(400);
	      buttonback.setPrefHeight(30);
	      buttonback.setLayoutX(310);
	      buttonback.setLayoutY(310);
	      buttonback.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      buttonback.setOnAction(new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent e) {
		              AnalyserOptions tod = new AnalyserOptions();
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
	        
	       
	      gridPane.add(buttonPie, 6, 8);  
	      gridPane.add(buttonbar, 6, 13);
	      gridPane.add(buttonback, 6, 18);
	      //Styling nodes   
	      buttonPie.setStyle(
	         "-fx-background-color: darkgrey;"); 
	      
	      buttonbar.setStyle(
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
	   //public static void main(String args[]){ 
	   //   launch(args); 
	  // } 
	}



