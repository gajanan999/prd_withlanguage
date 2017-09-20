package com.billdiary.ui;

import org.springframework.stereotype.Component;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


@Component
public class LayoutController {
	
	Stage stage;
	Scene scene;
	int width=1000;
	int hight=600;
	
	public void loadWindow(Parent root,String title)
	{
		stage = new Stage();
	    scene = new Scene(root, width, hight); 
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
	}

}
