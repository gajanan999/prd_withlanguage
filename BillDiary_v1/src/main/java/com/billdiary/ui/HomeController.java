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
	@FXML public  BorderPane inner_borderpane;
	
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
		StackPane addProductDetails=(StackPane) loader.load("/fxml/ManageProduct.fxml");
		
		//inner_borderpane.getChildren().clear();
		//inner_borderpane.getChildren().add(addProductDetails);
		//border.setCenter(addProductDetails);
		Double width=CenterAnchorpane.getWidth();
		Double height=CenterAnchorpane.getHeight();
		CenterAnchorpane.getChildren().clear();
		addProductDetails.setMaxHeight(height);
		addProductDetails.setMaxWidth(width);
		
		CenterAnchorpane.getChildren().add(addProductDetails);	
		
	}
	
	@FXML private void manageCustomers(ActionEvent event)
	{
		manager.setVisible(false);
		SpringFxmlLoader loader=SpringFxmlLoader.getInstance();
		//ResourceBundle bundle = ResourceBundle.getBundle("resources.UIResources");
		AnchorPane manageCustomer=(AnchorPane) loader.load("/fxml/ManageCustomer.fxml");
		manageCustomer.autosize();
		Double width=CenterAnchorpane.getWidth();
		Double height=CenterAnchorpane.getHeight();
		CenterAnchorpane.getChildren().clear();
		manageCustomer.setMaxHeight(height);
		manageCustomer.setMaxWidth(width);
		
		CenterAnchorpane.getChildren().add(manageCustomer);
	}
	/*public void getManagerScene()
	{	
		System.out.println(centerStackpane.getChildren());
		
	}*/
}
