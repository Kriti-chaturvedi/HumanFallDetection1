
	package application;

	import java.util.Arrays;
	import javafx.application.Application;
	import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
	import javafx.scene.Scene;
	import javafx.scene.chart.BarChart;
	import javafx.scene.chart.CategoryAxis;
	import javafx.stage.Stage;
	import javafx.scene.chart.NumberAxis;
	import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
	        
	public class FallsNotReported_Bar extends Application {
	   @Override
	   public void start(Stage stage) {    
	      //Defining the axes              
	      CategoryAxis xAxis = new CategoryAxis();  
	      xAxis.setCategories(FXCollections.<String>
	      observableArrayList(Arrays.asList("Reported", "Not Reported But Happened")));
	      xAxis.setLabel("Reproted False/True");
	       
	      NumberAxis yAxis = new NumberAxis();
	      yAxis.setLabel("number ");
	     
	      //Creating the Bar chart
	      BarChart<String, Number> barChart4 = new BarChart<>(xAxis, yAxis); 
	      barChart4.setTitle("Falls Reported or not reported but happened");
	        
	      //Prepare XYChart.Series objects by setting data       
	      XYChart.Series<String, Number> series1 = new XYChart.Series<>();
	      series1.setName("Reported");
	      series1.getData().add(new XYChart.Data<>("Reported", 28));
	      
           XYChart.Series<String, Number> series2 = new XYChart.Series<>();
	      series2.setName("Not Reported But Happened");
	      series2.getData().add(new XYChart.Data<>("Not Reported But Happened", 10));

	               
	      //Setting the data to bar chart       
	      barChart4.getData().addAll(series1,series2);
	      
	      Button buttonback = new Button("Back"); 
	      buttonback.setPrefWidth(400);
	      buttonback.setPrefHeight(30);
	      buttonback.setLayoutX(250);
	      buttonback.setLayoutY(230);
	      buttonback.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));
	      buttonback.setOnAction(new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent e) {
		              TypeOfDisplay tod = new TypeOfDisplay(0);
		              tod.start(stage);
					}
		      });
	        
	      GridPane gridPane = new GridPane();    
	      
	      //Setting size for the pane 
	      gridPane.setMinSize(1000, 600); 
	       
	      //Setting the padding    
	      gridPane.setPadding(new Insets(10, 10,10,10));  
	      
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(1); 
	      gridPane.setHgap(1);       
	      
	      //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	      
	      gridPane.add(buttonback, 6, 18);  
	      gridPane.setStyle("-fx-background-color: LAVENDER;");
	      
	      //Creating a Group object 
	      //Group root = new Group(barChart);
	        
	      gridPane.add(barChart4,6,0);
	      //Creating a scene object
	      Scene scene = new Scene(gridPane);

	      //Setting title to the Stage
	      stage.setTitle("Bar Chart");
	        
	      //Adding scene to the stage
	      stage.setScene(scene);
	        
	      //Displaying the contents of the stage
	      stage.show();        
	   }
	 
	}


