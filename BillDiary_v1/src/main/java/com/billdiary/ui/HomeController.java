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
	@FXML public StackPane manager;
	
	
	@Autowired
	public HomeController homeController;
	
	public  StackPane getRoot() {
		return homepage;
	}
	@FXML private void manageProducts(ActionEvent event)
	{
		
		System.out.println(homeController.CenterAnchorpane.getChildren());
		manager.setVisible(false);
		//homeController.CenterAnchorpane.setVisible(false);
		//aa.getManagerScene();
		SpringFxmlLoader loader=SpringFxmlLoader.getInstance();
		//ResourceBundle bundle = ResourceBundle.getBundle("resources.UIResources");
		AnchorPane addProductDetails=(AnchorPane) loader.load("/fxml/AddProductDetails.fxml");
		//border.setCenter(addProductDetails);
		CenterAnchorpane.getChildren().clear();
		CenterAnchorpane.getChildren().add(addProductDetails);
	}
	
	@FXML private void manageCustomers(ActionEvent event)
	{
		manager.setVisible(false);
		SpringFxmlLoader loader=SpringFxmlLoader.getInstance();
		//ResourceBundle bundle = ResourceBundle.getBundle("resources.UIResources");
		AnchorPane manageCustomer=(AnchorPane) loader.load("/fxml/ManageCustomer.fxml");
		CenterAnchorpane.getChildren().clear();
		CenterAnchorpane.getChildren().add(manageCustomer);
	}
	/*public void getManagerScene()
	{	
		System.out.println(centerStackpane.getChildren());
		
	}*/
}
