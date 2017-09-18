package com.billdiary.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.billdiary.config.SpringFxmlLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
@Controller("HomeController")
public class HomeController {
	@FXML public StackPane homepage;
	@FXML public  BorderPane borderpane;
	@FXML public VBox rightvbox;
	@FXML public AnchorPane CenterAnchorpane;
	@Autowired
	public HomeController homeController;
	public  StackPane getRoot() {
		return homepage;
	}
	@FXML private void manageProducts(ActionEvent event)
	{
		
		System.out.println(homeController.CenterAnchorpane.getChildren());
		homeController.CenterAnchorpane.setVisible(false);
		//aa.getManagerScene();
		SpringFxmlLoader loader=MainController.getLoader();
		//ResourceBundle bundle = ResourceBundle.getBundle("resources.UIResources");
		AnchorPane a=(AnchorPane) loader.load("/fxml/AddProductDetails.fxml");
		BorderPane border=homeController.borderpane;
		
		
		border.setCenter(a);
	}
	
	
	/*public void getManagerScene()
	{	
		System.out.println(centerStackpane.getChildren());
		
	}*/
}
