
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
	         
	public class NoOfYearsOfData extends Application { 
		public String choice;
		@Override 
	   public void start(Stage stage) {    
	      	      
		   Text text = new Text(); 
	       
		      //Setting font to the text 
		      //text.setFont(new Font(45)); 
		      text.setFont(Font.font("cambria", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 40));	    
		      text.setUnderline(true);
		      //setting the position of the text 
		      text.setX(150); 
		      text.setY(240);          
		      
		      //Setting the text to be added. 
		      text.setText("Start Comparing Year Wise Data"); 
		      
	      //Label for location 
	      Text locationLabel = new Text("Please Select The Number Of Years to Compare"); 
	      
	      //Choice box for location 
	      ChoiceBox<String> locationchoiceBox = new ChoiceBox<String>(); 
	      locationchoiceBox.getItems().addAll
	         ("Past 1 Year", "Past 2 Year", "Past 3 Year", "Past 4 Year", "Past 5 Year"); 
	    	locationchoiceBox.setOnAction(new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent e) {
		        	 choice = locationchoiceBox.getSelectionModel().getSelectedItem();
		        	  switch(choice)
		              {
		              
		              case "Past 1 Year": CompareOneYear analysis = new CompareOneYear();
		                      analysis.start(stage);
		                      break;
		        	  
		              case "Past 2 Year": CompareTwoYear analysis1 = new CompareTwoYear();
		              analysis1.start(stage);
		              break;
		              
		              case "Past 3 Year": CompareThreeYear analysis2 = new CompareThreeYear();
		              analysis2.start(stage);
		              break;
		              
		              case "Past 4 Year": CompareFourYear analysis3 = new CompareFourYear();
		              analysis3.start(stage);
		              break;
		              
		              case "Past 5 Year": CompareFiveYear analysis4 = new CompareFiveYear();
		              analysis4.start(stage);
		              break;
		              
		              }
			       
					}
		      });
	      

	      
	    //Label for going back 
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
	          gridPane.add(text,0,1);
	      gridPane.add(locationLabel, 0, 4); 
	      gridPane.add(locationchoiceBox, 1, 4);    
	       
	      
	      gridPane.add(buttonback, 0, 18);   
	      
	      //Styling nodes   
	     
	         
	      locationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
	       
	      //Setting the back ground color 
	      gridPane.setStyle("-fx-background-color: LAVENDER;");       
	       
	      //Creating a scene object 
	      Scene scene = new Scene(gridPane); 
	      
	      //Setting title to the Stage 
	      stage.setTitle("Comaprer Options Module"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene);  
	      
	      //Displaying the contents of the stage 
	      stage.show(); 
	   }      
	   
	}
	
