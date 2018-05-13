package application;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class MakeController {
	@FXML Canvas canvas;
	GraphicsContext gc;
	@FXML Button quitBtn;
	@FXML 
	private void quitAction() {
		System.exit(0);
	}
	//
	@FXML Button execBtn;
	@FXML
	private void execAction() {
		gc = canvas.getGraphicsContext2D();
		draw();
	}
	private void draw() {
		gc.setFill(Color.RED);
        gc.setStroke(Color.BLUE);
        gc.fillRect(50, 50, 150, 150);
        gc.strokeOval(100, 100, 50, 50);
	}
}
