package tech.srinath.resistorcolordecoder;
/*By: Srinath V.
 *Last Updated: 6-16-17
 *Resistor Color Decoder
 */
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	//Button to calculate resistance
	Button calculate;
	//The instance of the resistor
	static Resistor resistor;
	//The four drop down menus to select band colors
	ComboBox firstBand;
	ComboBox secondBand;
	ComboBox thirdBand;
	ComboBox fourthBand;
	//The text that displays the resistance
	Label resistance;
	/*The four string values for the corresponding 
	drop down menu selections*/
	public static String firstVal;
	public static String secondVal;
	public static String thirdVal;
	public static String fourthVal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launches the JavaFX GUI
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Setting the title of the window
		primaryStage.setTitle("Resistor Color Decoder");
		
		//Using grid layout manager
		GridPane layout = new GridPane();
		layout.setVgap(2);
		layout.setHgap(2);
		layout.setPadding(new Insets(0, 10, 0, 10));
		
		//Defining all the drop down menus with the color options and prompt text
		firstBand = new ComboBox();
		firstBand.getItems().addAll("Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Gray", "White");
		firstBand.setPromptText("First Band");
		secondBand = new ComboBox();
		secondBand.getItems().addAll("Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Gray", "White");
		secondBand.setPromptText("Second Band");
		thirdBand = new ComboBox();
		thirdBand.getItems().addAll("Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet");
		thirdBand.setPromptText("Third Band");
		fourthBand = new ComboBox();
		fourthBand.getItems().addAll("Silver", "Gold");
		fourthBand.setPromptText("Fourth Band");
		
		//Label text which displays resistance
		resistance = new Label("Resistance is:");
		
		//Button to calculate the resistance
		calculate = new Button("Calculate");
		/*Calculates the resistance when the
		 calculate button is pressed and
		 displays it on the resistance label
		 */
		calculate.setOnAction(e -> {
			checkValues();
			resistance.setText(resistor.getResistance());
		});
		
		//Adding all the elements to the grid layout
		layout.add(firstBand, 1, 25);
		layout.add(secondBand, 2, 25);
		layout.add(thirdBand, 3, 25);
		layout.add(fourthBand, 4, 25);
		layout.add(calculate, 4, 50);
		layout.add(resistance, 1, 50);
		
		//Defining the scene's layout and size
		Scene scene = new Scene(layout, 500, 200);
		//Adding the scene to the window
		primaryStage.setScene(scene);
		//Shows the window when run
		primaryStage.show();
	}
	
	/* Method which is called whenever calculate button
	 is clicked. Defines the string values for the 
	 selected drop down menu values, and defines
	 the resistor object using those new values.
	 */
	public void checkValues() {
		firstVal = (String) firstBand.getValue();
		secondVal = (String) secondBand.getValue();
		thirdVal = (String) thirdBand.getValue();
		fourthVal = (String) fourthBand.getValue();
		resistor = new Resistor(firstVal, secondVal, thirdVal, fourthVal);
	}
	
}
