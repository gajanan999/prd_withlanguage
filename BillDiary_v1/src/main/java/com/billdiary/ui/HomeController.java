package com.billdiary.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.billdiary.config.SpringFxmlLoader;
import com.billdiary.utility.URLS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
@Controller("HomeController")
public class HomeController {
	@FXML public StackPane homepage;
	@FXML public  BorderPane borderpane;
	@FXML public AnchorPane mainView;
	@FXML public Text MainTitle;
	
	
	@Autowired
	public HomeController homeController;
	
	public  StackPane getRoot() {
		return homepage;
	}
	@FXML private void manageProducts(ActionEvent event)
	{
		SpringFxmlLoader loader=SpringFxmlLoader.getInstance();
		AnchorPane addProductDetails=(AnchorPane) loader.load(URLS.MANAGE_PRODUCT_PAGE);
		MainTitle.setText("Manage Products");
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
		AnchorPane manageCustomer=(AnchorPane) loader.load(URLS.MANAGE_CUSTOMER_PAGE);
	    MainTitle.setText("Manage Customers");
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
		//mainInnerWindow.setPrefHeight(600);
		//mainInnerWindow.setPrefWidth(500);
		//mainInnerWindow.autosize();
		mainView.getChildren().add(mainInnerWindow);
		//homepage.autosize();
		//homepage.setPrefHeight(650);
	//	homepage.setPrefWidth(1200);
		//homepage.autosize();
		windowShow=true;
		}catch(Exception e)
		{
			windowShow=false;
			System.out.println(e.getMessage());
		}
		return windowShow;
		
	}
	
}
