package view;

import controller.Stock;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FArticle extends Scene{
	
	Group gp;
	Stock stk;
	
	public FArticle(Stock stk, double width, double height) {
		super(new Group(), width, height);
		
		gp = (Group) this.getRoot();
		this.stk = stk;
		
		init();
		
	}
	
	private void init(){
		
		GridPane grid = new GridPane();
		
		Label lb1 = new Label("Nome: ");
		TextField tf1 = new TextField();
		
		Label lb2 = new Label("Descrição: ");
		TextArea tA1 = new TextArea();
		
		Label lb3 = new Label("Preço: ");
		TextField tf2 = new TextField();
		
		Button bt = new Button("Gravar");
		
		grid.add(lb1, 0, 0); grid.add(tf1, 1, 0);
		grid.add(lb3, 0, 1); grid.add(tf2, 1, 1);
		grid.add(lb2, 0, 2); grid.add(tA1, 1, 2);
		grid.add(bt, 1, 3);
	
		grid.setHgap(10); grid.setVgap(10);
		
		bt.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				System.out.println("Nome: " + tf1.getText() + 
						"\nPreço: " + tf2.getText() +
						"\nDescrição: " + tA1.getText());
				
			}
		});
		
		gp.getChildren().add(grid);
	
	}

}
