package main;



import view.DataBean;
import view.View;
import view.ViewVC;
import javafx.application.Application;
import javafx.stage.Stage;
public class  Start extends Application {
	
	      
	    @Override
	    public void start(Stage primaryStage) {
	    	   DataBean dataBean = new DataBean(primaryStage);
	           // Ersten Controller aufrufen
	           ViewVC eingabeVC = new ViewVC(dataBean);
	           eingabeVC.show();   
	    }
	    public static void main(String[] args) {
	        launch(args);
	    }
		
}
