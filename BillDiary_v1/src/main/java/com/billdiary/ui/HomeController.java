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
	@FXML public AnchorPane mainView;
	
	
	
	@Autowired
	public HomeController homeController;
	
	public  StackPane getRoot() {
		return homepage;
	}
	@FXML private void manageProducts(ActionEvent event)
	{
		SpringFxmlLoader loader=SpringFxmlLoader.getInstance();
		AnchorPane addProductDetails=(AnchorPane) loader.load("/fxml/ManageProduct.fxml");
		if(setMainView(addProductDetails))
		{
			System.out.println("Manage Products window loaded successfully");
		}else {
			System.out.println("while loading Manage Products window some error has been occured ");
		}	
	}
	
	@FXML private void manageCustomers(ActionEvent event)
	{
		SpringFxmlLoader loader=SpringFxmlLoader.getInstance();
		AnchorPane manageCustomer=(AnchorPane) loader.load("/fxml/ManageCustomer.fxml");
		manageCustomer.autosize();
		if(setMainView(manageCustomer))
		{
			System.out.println("Manage Customer window loaded successfully");
		}else {
			System.out.println("while loading Manage Customer window some error has been occured ");
		}
	}
	
	private boolean setMainView(AnchorPane mainInnerWindow)
	{
		boolean windowShow=false;
		try
		{
		mainView.getChildren().clear();
		mainView.getChildren().add(mainInnerWindow);
		windowShow=true;
		}catch(Exception e)
		{
			windowShow=false;
			System.out.println(e.getMessage());
		}
		return windowShow;
		
	}
	
}
