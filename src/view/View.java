package view;

import java.awt.BorderLayout;

import com.sun.prism.paint.Color;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View {

	private Scene scene;

	private Button btnNumOne, btnNumTwo, btnNumThree, btnNumFour, btnNumFive, btnNumSix, btnNumSeven, btnNumEight, btnNumNine,btnAns,btnNumZero,btnPor;	
	private HBox hbc, hbC1,hbC2,hbC3,hbDisplay,hbOperation;
	private VBox vbColumn1, vbOperation, vbColumn2,vbColumn3;
	private Button btnSum, btnDeduc, btnDivide, btnMultiply,btnEquals;
	private TextField display;

	public View() {
		
		BorderPane container = new BorderPane();
		container.setStyle("-fx-background-color:#4682B4");
		
		Group go = new Group();

		// ------------------------------------------------------------------------------------------------
		// Display
		// ------------------------------------------------------------------------------------------------
		hbDisplay = new HBox(10);
		hbDisplay.setStyle("-fx-background-color:#696969");
		hbDisplay.setLayoutX(0);
		hbDisplay.setLayoutY(0);
		hbDisplay.setPrefHeight(50);/* , */
		hbDisplay.setPrefWidth(300);
		go.getChildren().add(hbDisplay);
	
//		#90EE90
		display = new TextField();
		display.setStyle("-fx-background-color:#FFFFFF; -fx-font-size:20px;-fx-border-color: rgb(49, 89, 23);");
		display.setLayoutX(0);
		display.setLayoutY(5);
		display.setPrefSize(300, 40);
		display.setAlignment(Pos.CENTER_RIGHT);
		hbDisplay.getChildren().add(display);
		
		// ------------------------------------------------------------------------------------------------
		// Element Calculator
		// ------------------------------------------------------------------------------------------------
			hbc = new HBox(2);
			hbc.setStyle("-fx-background-color:#87CEFA; -fx-padding: 10px;");
			hbc.setLayoutX(0);
			hbc.setLayoutY(50);
			hbc.setPrefHeight(200);/* , */
			hbc.setPrefWidth(300);
			go.getChildren().add(hbc);
		// ------------------------------------------------------------------------------------------------
		// Number
		// ------------------------------------------------------------------------------------------------
		hbC1 = new HBox();/* yellows */
		hbC1.setPrefHeight(100);/* , */
		hbC1.setPrefWidth(350);
		hbc.getChildren().add(hbC1);

		vbColumn1 = new VBox(2);
		btnNumSeven = new Button("7");
		btnNumSeven.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px ;");
		btnNumSeven.setPrefSize(100, 30);
		btnNumFour = new Button("4");
		btnNumFour.setStyle("-fx-background-color:#1E90FF;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumFour.setPrefSize(100, 30);
		btnNumOne = new Button("1");
		
		  btnNumOne.setOnMouseClicked(new EventHandler<MouseEvent>() 
		{
			  String one ="";
			    public void handle(MouseEvent mouseEvent) 
			    {
			        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
			        {
			                one += "1";
			                display.setText(one);
			        }
			    }
			});
		btnNumOne.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumOne.setPrefSize(100, 30);
		
		btnNumZero = new Button("0");
		btnNumZero.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumZero.setPrefSize(100, 30);
		vbColumn1.getChildren().addAll(btnNumSeven, btnNumFour,btnNumOne,btnNumZero);
		hbC1.getChildren().add(vbColumn1);
		
		hbC2 = new HBox();
		hbC2.setPrefHeight(100);
		hbC2.setPrefWidth(350);
		hbc.getChildren().add(hbC2);

		vbColumn2 = new VBox(2);
		btnNumEight = new Button("8");
		btnNumEight .setStyle("-fx-background-color: #1E90FF;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumEight.setPrefSize(100, 30);
		btnNumFive = new Button("5");
		btnNumFive.setStyle("-fx-background-color:#1E90FF;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumFive.setPrefSize(100, 30);
		btnNumTwo = new Button("2");
		btnNumTwo.setStyle("-fx-background-color: #1E90FF;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumTwo.setPrefSize(100, 30);
		
		btnPor = new Button("%");
		btnPor.setStyle("-fx-background-color: #1E90FF;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnPor.setPrefSize(100, 30);
		vbColumn2.getChildren().addAll(btnNumEight, btnNumFive,btnNumTwo,btnPor);
		hbC2.getChildren().add(vbColumn2);
	
		hbC3 = new HBox();
		hbC3.setPrefHeight(100);
		hbC3.setPrefWidth(350);
		hbc.getChildren().add(hbC3);

		vbColumn3 = new VBox(2);
		btnNumNine = new Button("9");
		btnNumNine.setStyle("-fx-background-color: #1E90FF;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumNine.setPrefSize(100, 30);
		btnNumSix = new Button("6");
		btnNumSix.setStyle("-fx-background-color:#1E90FF;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumSix.setPrefSize(100, 30);
		btnNumThree = new Button("3");
		btnNumThree.setStyle("-fx-background-color: #1E90FF;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnNumThree.setPrefSize(100, 30);
		
		btnAns = new Button("Ans");
		btnAns.setStyle("-fx-background-color: #4169E1;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnAns.setPrefSize(100, 30);
		vbColumn3.getChildren().addAll(btnNumNine, btnNumSix,btnNumThree,btnAns);
		hbC3.getChildren().add(vbColumn3);
		

		// ------------------------------------------------------------------------------------------------
		// Operation
		// ------------------------------------------------------------------------------------------------
		hbOperation = new HBox();
		hbOperation.setPrefHeight(100);
		hbOperation.setPrefWidth(300);
		hbc.getChildren().add(hbOperation);
		
		vbOperation = new VBox(2);
		btnSum = new Button("+"); 
		btnSum.setStyle("-fx-background-color: #FFD700;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnSum.setPrefSize(50, 30);
		
		btnDeduc = new Button("-");
		btnDeduc.setPrefSize(50, 30);
		btnDeduc.setStyle("-fx-background-color:#FFD700;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		
		btnDivide = new Button("/");/* bt */
		btnDivide.setPrefSize(50, 30);
		btnDivide.setStyle("-fx-background-color:#FFD700;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		
		btnMultiply = new Button("x");
		btnMultiply.setStyle("-fx-background-color:#FFD700;-fx-text-fill: #FFFFFF;-fx-font-size:20px;-fx-background-radius:0px");
		btnMultiply.setPrefSize(50, 30);
		
		btnEquals = new Button("=");
		btnEquals.setStyle("-fx-background-color: #FFA500;-fx-background-radius:0px");
		btnEquals.setPrefSize(50, 40);
		vbOperation.getChildren().addAll(btnSum, btnDeduc, btnDivide, btnMultiply,btnEquals);
		hbOperation.getChildren().add(vbOperation);
		// ------------------------------------------------------------------------------------------------
		container.setCenter(go);
		scene = new Scene(container, 334, 334);
	
	}



	public void show(Stage stage) {
		stage.setTitle("Big Number Calculator");
		stage.setScene(scene);
		stage.show();
	}

	// nur Getter von Elementen anlegen, die veraendert werden und/oder
	// dynamisch sind
	
	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public Button getBtnNumOne() {
		return btnNumOne;
	}

	public void setBtnNumOne(Button btnNumOne) {
		this.btnNumOne = btnNumOne;
	}

	public Button getBtnNumTwo() {
		return btnNumTwo;
	}

	public void setBtnNumTwo(Button btnNumTwo) {
		this.btnNumTwo = btnNumTwo;
	}

	public Button getBtnNumThree() {
		return btnNumThree;
	}

	public void setBtnNumThree(Button btnNumThree) {
		this.btnNumThree = btnNumThree;
	}

	public Button getBtnNumFour() {
		return btnNumFour;
	}

	public void setBtnNumFour(Button btnNumFour) {
		this.btnNumFour = btnNumFour;
	}

	public Button getBtnNumFive() {
		return btnNumFive;
	}

	public void setBtnNumFive(Button btnNumFive) {
		this.btnNumFive = btnNumFive;
	}

	public Button getBtnNumSix() {
		return btnNumSix;
	}

	public void setBtnNumSix(Button btnNumSix) {
		this.btnNumSix = btnNumSix;
	}

	public Button getBtnNumSeven() {
		return btnNumSeven;
	}

	public void setBtnNumSeven(Button btnNumSeven) {
		this.btnNumSeven = btnNumSeven;
	}

	public Button getBtnNumEight() {
		return btnNumEight;
	}

	public void setBtnNumEight(Button btnNumEight) {
		this.btnNumEight = btnNumEight;
	}

	public Button getBtnNumNine() {
		return btnNumNine;
	}

	public void setBtnNumNine(Button btnNumNine) {
		this.btnNumNine = btnNumNine;
	}

	public Button getBtnAns() {
		return btnAns;
	}

	public void setBtnAns(Button btnAns) {
		this.btnAns = btnAns;
	}

	public Button getBtnNumZero() {
		return btnNumZero;
	}

	public void setBtnNumZero(Button btnNumZero) {
		this.btnNumZero = btnNumZero;
	}

	public Button getBtnPor() {
		return btnPor;
	}

	public void setBtnPor(Button btnPor) {
		this.btnPor = btnPor;
	}

	public HBox getHbc() {
		return hbc;
	}

	public void setHbc(HBox hbc) {
		this.hbc = hbc;
	}

	public HBox getHbC1() {
		return hbC1;
	}

	public void setHbC1(HBox hbC1) {
		this.hbC1 = hbC1;
	}

	public HBox getHbC2() {
		return hbC2;
	}

	public void setHbC2(HBox hbC2) {
		this.hbC2 = hbC2;
	}

	public HBox getHbC3() {
		return hbC3;
	}

	public void setHbC3(HBox hbC3) {
		this.hbC3 = hbC3;
	}

	public HBox getHbDisplay() {
		return hbDisplay;
	}

	public void setHbDisplay(HBox hbDisplay) {
		this.hbDisplay = hbDisplay;
	}

	public HBox getHbOperation() {
		return hbOperation;
	}

	public void setHbOperation(HBox hbOperation) {
		this.hbOperation = hbOperation;
	}

	public VBox getVbColumn1() {
		return vbColumn1;
	}

	public void setVbColumn1(VBox vbColumn1) {
		this.vbColumn1 = vbColumn1;
	}

	public VBox getVbOperation() {
		return vbOperation;
	}

	public void setVbOperation(VBox vbOperation) {
		this.vbOperation = vbOperation;
	}

	public VBox getVbColumn2() {
		return vbColumn2;
	}

	public void setVbColumn2(VBox vbColumn2) {
		this.vbColumn2 = vbColumn2;
	}

	public VBox getVbColumn3() {
		return vbColumn3;
	}

	public void setVbColumn3(VBox vbColumn3) {
		this.vbColumn3 = vbColumn3;
	}

	public Button getBtnSum() {
		return btnSum;
	}

	public void setBtnSum(Button btnSum) {
		this.btnSum = btnSum;
	}

	public Button getBtnDeduc() {
		return btnDeduc;
	}

	public void setBtnDeduc(Button btnDeduc) {
		this.btnDeduc = btnDeduc;
	}

	public Button getBtnDivide() {
		return btnDivide;
	}

	public void setBtnDivide(Button btnDivide) {
		this.btnDivide = btnDivide;
	}

	public Button getBtnMultiply() {
		return btnMultiply;
	}

	public void setBtnMultiply(Button btnMultiply) {
		this.btnMultiply = btnMultiply;
	}

	public Button getBtnEquals() {
		return btnEquals;
	}

	public void setBtnEquals(Button btnEquals) {
		this.btnEquals = btnEquals;
	}

	public TextField getDisplay() {
		return display;
	}

	public void setDisplay(TextField display) {
		this.display = display;
	}




}