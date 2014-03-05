package controller;

import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import model.BigNumber;
import model.Calculator;
import view.DataBean;
import view.View;

public class ViewVC 
{
	   // Model
		private Calculator calculator;
	   // View
	   private View view;
	   private DataBean dataBean;
	    
	   private String string;
	   
	   public ViewVC(DataBean dataBean)
	   {
	   
		  
		  string ="";
		  this.dataBean = dataBean;
	      this.view = new View();  
	      
	      eventClickedNumber();
	      eventClickedOperator();
	      eventClickedParathesis();
	      eventClicketResult();
	   }
	    
	   public void show()
	   {
	      view.show(dataBean.getPrimaryStage());
	   }
	   
	   //-------------------------------------------------------------------------------------
	   // Events
	   //-------------------------------------------------------------------------------------
	
	   public void eventClickedNumber() 
	   {
		   view.getBtnNumOne().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "1";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumTwo().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
				
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "2";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumThree().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					 
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "3";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumFour().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "4";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumFive().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "5";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumSix().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "6";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumSeven().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "7";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumEight().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "8";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumNine().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "9";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnNumZero().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "0";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		 
	   }
	   public void eventClickedOperator() 
	   {
		   view.getBtnMultiply().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "x";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnDivide().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "/";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnSum().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "+";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnSubtract().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "-";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		    
	   }
	   public void eventClickedParathesis() 
	   {
		   view.getBtnOpen().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += "(";
					                view.getDisplay().setText(string);
					        }
					    }
					});
		   view.getBtnClose().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					                string += ")";
					                view.getDisplay().setText(string);
					        }
					    }
					});
	   }
	   public void  eventClicketResult() {
		   view.getBtnEquals().setOnMouseClicked(new EventHandler<MouseEvent>() 
					{
					  
					    public void handle(MouseEvent mouseEvent) 
					    {
					        if(mouseEvent.getButton().equals(MouseButton.PRIMARY))
					        {
					        	calculator = new Calculator(string);
					        	BigNumber result = calculator.solvePrioridad();
					        	view.getDisplay().setText(result.toString());
					        }
					    }
					});
	   }
	   
	   
}
