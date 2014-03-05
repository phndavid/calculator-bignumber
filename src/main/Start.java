package main;



import javafx.application.Application;
import javafx.stage.Stage;
import view.DataBean;
import controller.ViewVC;
public class  Start extends Application {
	
	      
	    @Override
	    public void start(Stage primaryStage) 
	    {
	    	
	    	   DataBean dataBean = new DataBean(primaryStage);
	 
	           ViewVC eingabeVC = new ViewVC(dataBean);
	           eingabeVC.show();   
	    }
	    public static void main(String[] args) {
	        launch(args);
	    }
		
}
