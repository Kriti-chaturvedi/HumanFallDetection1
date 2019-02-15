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
	        
	public class FallsWithinAgeGroup_Bar extends Application {
	   @Override
	   public void start(Stage stage) {    
	      //Defining the axes              
	      CategoryAxis xAxis = new CategoryAxis();  
	      xAxis.setCategories(FXCollections.<String>
	      observableArrayList(Arrays.asList("0 to 5", "6 to 12", "13 to 21", "22 to 30","31 to 40","41 to 55","56 to 70","70 to above")));
	      xAxis.setLabel("Falls Within Age Group");
	       
	      NumberAxis yAxis = new NumberAxis();
	      yAxis.setLabel("number of people");
	     
	      //Creating the Bar chart
	      BarChart<String, Number> barChart3 = new BarChart<>(xAxis, yAxis); 
	      barChart3.setTitle("Falls Within Age Group");
	        
	      //Prepare XYChart.Series objects by setting data       
	      XYChart.Series<String, Number> series1 = new XYChart.Series<>();
	      series1.setName("0 to 5");
	      series1.getData().add(new XYChart.Data<>("0 to 5", 12));
	      
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
	      series2.setName("6 to 12");
	      series2.getData().add(new XYChart.Data<>("6 to 12", 37));
	      
	      XYChart.Series<String, Number> series3 = new XYChart.Series<>();
	      series3.setName("13 to 21");
	      series3.getData().add(new XYChart.Data<>("13 to 21", 20));
	      
	      XYChart.Series<String, Number> series4 = new XYChart.Series<>();
	      series4.setName("22 to 30");
	      series4.getData().add(new XYChart.Data<>("22 to 30", 28));
	      
	      XYChart.Series<String, Number> series5 = new XYChart.Series<>();
	      series5.setName("31 to 40");
	      series5.getData().add(new XYChart.Data<>("31 to 40", 33));
	      
	      XYChart.Series<String, Number> series6 = new XYChart.Series<>();
	      series6.setName("41 to 55");
	      series6.getData().add(new XYChart.Data<>("41 to 55", 56));
	      
	      XYChart.Series<String, Number> series7 = new XYChart.Series<>();
	      series7.setName("56 to 70");
	      series7.getData().add(new XYChart.Data<>("56 to 70", 45));
	      
	      XYChart.Series<String, Number> series8 = new XYChart.Series<>();
	      series8.setName("70 to above");
	      series8.getData().add(new XYChart.Data<>("70 to above", 30));
	      
	              
	      //Setting the data to bar chart       
	      barChart3.getData().addAll(series1,series2,series3,series4,series5,series6,series7,series8);
	      
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
	        
	      gridPane.add(barChart3,6,0);
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

