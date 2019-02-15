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
	        
	public class ReasonsOfFall_Bar extends Application {
	   @Override
	   public void start(Stage stage) {    
	      //Defining the axes              
	      CategoryAxis xAxis = new CategoryAxis();  
	      xAxis.setCategories(FXCollections.<String>
	      observableArrayList(Arrays.asList("Slip", "Bang", "Giddyness", "Faint","Heart attack")));
	      xAxis.setLabel("Falls Within Age Group");
	       
	      NumberAxis yAxis = new NumberAxis();
	      yAxis.setLabel("number of people");
	     
	      //Creating the Bar chart
	      BarChart<String, Number> barChart2 = new BarChart<>(xAxis, yAxis); 
	      barChart2.setTitle("Different REasons of falls");
	        
	      //Prepare XYChart.Series objects by setting data       
	      XYChart.Series<String, Number> series1 = new XYChart.Series<>();
	      series1.setName("Slip");
	      series1.getData().add(new XYChart.Data<>("Slip", 11));
	      
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
	      series2.setName("Bang");
	      series2.getData().add(new XYChart.Data<>("Bang", 22));
	      
	      XYChart.Series<String, Number> series3 = new XYChart.Series<>();
	      series3.setName("Giddyness");
	      series3.getData().add(new XYChart.Data<>("Giddyness", 34));
	      
	      XYChart.Series<String, Number> series4 = new XYChart.Series<>();
	      series4.setName("Faint");
	      series4.getData().add(new XYChart.Data<>("Faint", 15));
	      
	      XYChart.Series<String, Number> series5 = new XYChart.Series<>();
	      series5.setName("Heart attac");
	      series5.getData().add(new XYChart.Data<>("Heart attack", 24));
	              
	      //Setting the data to bar chart       
	      barChart2.getData().addAll(series1,series2,series3,series4,series5);
	      
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
	      gridPane.setPadding(new Insets(10, 10, 10, 10));  
	      
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);       
	      
	      //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	      
	      gridPane.add(buttonback, 6, 18);  
	      gridPane.setStyle("-fx-background-color: LAVENDER;");
	      
	      //Creating a Group object 
	      //Group root = new Group(barChart);
	        
	      gridPane.add(barChart2,6,0);
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



