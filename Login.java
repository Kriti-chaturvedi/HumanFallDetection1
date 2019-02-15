package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField; 
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;  
         
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.Map.Entry; 
import java.util.*; 
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.TreeMap;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login extends Application { 
   @Override 
   public void start(Stage stage) throws IOException {  
	   
	 //Creating a Text object 
	      Text text = new Text(); 
	       
	      //Setting font to the text 
	      //text.setFont(new Font(45)); 
	      text.setFont(Font.font("cambria", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 50));	    
	      text.setUnderline(true);
	      //setting the position of the text 
	      text.setX(150); 
	      text.setY(150);          
	      //Setting the text to be added. 
	      text.setText("Home - Login"); 
	   
      //creating label email 
      Text text1 = new Text("UserName"); 
      text1.setFont(Font.font("cambria", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 40));	
    
      //Creating Text Filed for email        
      TextField textField1 = new TextField();
      
      //creating label password 
      Text text2 = new Text("Password"); 
      text2.setFont(Font.font("cambria", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 40));	
       
  //Creating Text Filed for password        
      PasswordField textField2 = new PasswordField();  
      final Tooltip tooltip = new Tooltip();
      tooltip.setText(
          "Your password must be\n" +
          "at least 8 characters in length\n"  
      );
      textField2.setTooltip(tooltip);
       
      Button button2 = new Button("Register");  
      button2.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));	
      button2.setOnAction(new EventHandler<ActionEvent>() {
          @Override public void handle(ActionEvent e) {
              SignUpForm sup = new SignUpForm();
              sup.start(stage);
              
          }
      });
      
    //Creating Buttons 
      Button button1 = new Button("Submit"); 
      button1.setFont(Font.font("cambria", FontWeight.MEDIUM, FontPosture.ITALIC, 20));	
      button1.setOnAction(e -> {
    	 if(validateUser(textField1.getText()) && validatePass(textField2.getText()))
    		 {
    		 OptionsPage op = new OptionsPage();
    		 op.start(stage);
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
      gridPane.add(text, 1, 0);
      gridPane.add(text1, 0, 8); 
      gridPane.add(textField1, 1, 8); 
      gridPane.add(text2, 0, 10);       
      gridPane.add(textField2, 1, 10); 
      gridPane.add(button1, 0, 12); 
      gridPane.add(button2, 1, 12); 
       
      //Styling nodes  
      button1.setStyle("-fx-background-color: darkgrey; -fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: darkgrey; -fx-text-fill: white;"); 
       
      text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
      text2.setStyle("-fx-font: normal bold 20px 'serif' ");  
      gridPane.setStyle("-fx-background-color: LAVENDER;"); 
       
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
       
      //Setting title to the Stage 
      stage.setTitle("CSS Example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
   }
   private boolean validateUser(String message){
	   Pattern p = Pattern.compile("admin");
	   Matcher m = p.matcher(message);
	   if(m.find() && m.group().equals(message))	
	   {
		   
			   return true;
	   }   
	   else
	   {
				   Alert alert = new Alert(AlertType.WARNING);
				   alert.setTitle("Validate User");
				   alert.setHeaderText(null);
				   alert.setContentText("Please enter a valid user");
				   alert.showAndWait();
				   
				   return false;	   }
   }
   private boolean validatePass(String message){
	   Pattern p = Pattern.compile("1234");
	   Matcher m = p.matcher(message);
	   if(m.find() && m.group().equals(message))	
	   {
		   
			   return true;
	   }   
	   else
	   {
				   Alert alert = new Alert(AlertType.WARNING);
				   alert.setTitle("Validate User");
				   alert.setHeaderText(null);
				   alert.setContentText("Please enter a valid Password");
				   alert.showAndWait();
				   
				   return false;	   }
   }
}