package controller;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import view.DataBean;
import view.View;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;



public class ViewVC 
{
	   // Model
	   private DataBean dataBean;
	    
	   // View
	   private View view;
	    
	    
	   public ViewVC(DataBean dataBean) {
	      this.dataBean = dataBean;
	      this.view = new View();  
	   }
	    
	   public void show()
	   {
	      view.show(dataBean.getPrimaryStage());
	   }
	   
	   //-------------------------------------------------------------------------------------
	   // Events
	   //-------------------------------------------------------------------------------------
	   class addBtnEventHandler {
			 
			      public void handle(ActionEvent e) {   
			    	  String display = view.getDisplay().getText();
			         if(display.isEmpty()){
			            JOptionPane.showMessageDialog(null,"Digite un numero");
			            return;
			         }
			      }
	   }
	   

	
}
