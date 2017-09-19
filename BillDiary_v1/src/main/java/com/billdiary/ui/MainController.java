package com.billdiary.ui;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.billdiary.config.SpringFxmlLoader;
import com.billdiary.dao.CreateSchema;


import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController extends Application{
	
	final static Logger LOGGER = Logger.getLogger(MainController.class);
	private static final SpringFxmlLoader loader =SpringFxmlLoader.getInstance();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.debug("Entering Class MainController : method : main.");		
		launch(args); 
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		/*Below fxml file will be loaded by SpringFxmlLoader */
		try {
			CreateSchema.CreateDatabase();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Parent root = (Parent) loader.load("/fxml/Login.fxml");
		//Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Login.fxml"));
		//Stage stage = new Stage();
		Scene scene = new Scene(root, 800, 600); 
        stage.setTitle("Welcome to Application");
        stage.setScene(scene);
        stage.show();	
	}
}
