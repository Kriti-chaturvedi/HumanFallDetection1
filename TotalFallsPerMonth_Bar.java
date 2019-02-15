package application;

import java.io.IOException;
import java.util.Arrays;

import javafx.application.Application; 
import javafx.collections.FXCollections;  
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight; 

public class TotalFallsPerMonth_Bar extends Application {
	   @Override
	   public void start(Stage stage) {    
	      //Defining the axes              
	      CategoryAxis xAxis = new CategoryAxis();  
	      xAxis.setCategories(FXCollections.<String>
	      observableArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December")
));
	      xAxis.setLabel("Total Falls Per Month");
	       
	      NumberAxis yAxis = new NumberAxis();
	      yAxis.setLabel("Number of falls");
	     
	      //Creating the Bar chart
	      BarChart<String, Number> barChart1 = new BarChart<>(xAxis, yAxis); 
	      barChart1.setTitle("Total Falls Per Month");
	        
	      //Prepare XYChart.Series objects by setting data       
	      XYChart.Series<String, Number> series1 = new XYChart.Series<>();
	      series1.setName("January");
	      series1.getData().add(new XYChart.Data<>("January", 60));
	      
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
	      series2.setName("February");
	      series2.getData().add(new XYChart.Data<>("February", 45));
	      
	      XYChart.Series<String, Number> series3 = new XYChart.Series<>();
	      series3.setName("March");
	      series3.getData().add(new XYChart.Data<>("March", 20));
	      
	      XYChart.Series<String, Number> series4 = new XYChart.Series<>();
	      series4.setName("April");
	      series4.getData().add(new XYChart.Data<>("April", 37));
	      
	      XYChart.Series<String, Number> series5 = new XYChart.Series<>();
	      series5.setName("May");
	      series5.getData().add(new XYChart.Data<>("May", 56));
	      
	      XYChart.Series<String, Number> series6 = new XYChart.Series<>();
	      series6.setName("June");
	      series6.getData().add(new XYChart.Data<>("June", 68));
	      
	      XYChart.Series<String, Number> series7 = new XYChart.Series<>();
	      series7.setName("July");
	      series7.getData().add(new XYChart.Data<>("July", 59));
	      
	      XYChart.Series<String, Number> series8 = new XYChart.Series<>();
	      series8.setName("August");
	      series8.getData().add(new XYChart.Data<>("August", 33));
	             
	      XYChart.Series<String, Number> series9 = new XYChart.Series<>();
	      series9.setName("September");
	      series9.getData().add(new XYChart.Data<>("September", 27));
	      
	      XYChart.Series<String, Number> series10 = new XYChart.Series<>();
	      series10.setName("October");
	      series10.getData().add(new XYChart.Data<>("October", 55));
	      
	      XYChart.Series<String, Number> series11 = new XYChart.Series<>();
	      series11.setName("November");
	      series11.getData().add(new XYChart.Data<>("November", 24));
	      
	      XYChart.Series<String, Number> series12 = new XYChart.Series<>();
	      series12.setName("December");
	      series12.getData().add(new XYChart.Data<>("December", 19));
	      
	      //Setting the data to bar chart       
	      barChart1.getData().addAll(series1,series2,series3,series4,series5,series6,series7,series8,series9,series10,series11,series12);
	      
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
	      gridPane.setMinSize(1000, 800); 
	       
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
	        
	      gridPane.add(barChart1,6,0);
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

