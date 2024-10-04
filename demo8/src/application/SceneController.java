package application;
import java.io.IOException;
import card.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class SceneController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	public ImageView myview1;
	public ImageView myview2;
	public ImageView myview3;
	public ImageView myview6;
	public ImageView myview5;
	public ImageView bankerview1;
	public ImageView bankerview2;
	public ImageView bankerview3;
	public ImageView bankerview4;
	public ImageView bankerview5;
	
	int time=0;
	
		public void switchToScene1(ActionEvent event)throws IOException{
			Parent root=FXMLLoader.load(getClass().getResource("src/application/Scene1.fxml"));
			stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setScene(scene);
			//stage.setFullScreen(false);
			//stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("e"));
			stage.show();
		}
		public void getStart(ActionEvent event)throws IOException{
			Parent root=FXMLLoader.load(getClass().getResource("src/application/Scene2.fxml"));
			stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setScene(scene);
			//stage.setFullScreen(false);
			//stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("e"));
			stage.show();
		}
		public void displayImage1(Image pic) {
			myview1.setImage(pic);
			}
		public void displayImage2(Image pic) {
			myview2.setImage(pic);
			}
		public void displayImage3(Image pic) {
			myview3.setImage(pic);
			}
		public void displayImage5(Image pic) {
			myview5.setImage(pic);
			}
		public void displayImage6(Image pic) {
			myview6.setImage(pic);
			}
		public void displayBankerImage1(Image pic) {
			bankerview1.setImage(pic);
			}
		public void displayBankerImage2(Image pic) {
			bankerview2.setImage(pic);
			}
		public void displayBankerImage3(Image pic) {
			bankerview3.setImage(pic);
			}
		public void displayBankerImage4(Image pic) {
			bankerview4.setImage(pic);
			}
		public void displayBankerImage5(Image pic) {
			bankerview5.setImage(pic);
			}
		
		public void getCardInController(ActionEvent e) {
			time+=1;
			
			//System.out.println("getCard");
			if(time==1) {
				card.Card card3 = new card.Card(null, null);
				card3.getCard();
				card3.printCard(card3);
				card3.setImage();
				displayImage3(card3.img);
			}
			else if(time==2) {
				card.Card card4 = new card.Card(null, null);
				card4.getCard();
				card4.printCard(card4);
				card4.setImage();
				displayImage6(card4.img);
				
			}
			else if(time==3) {
				card.Card card5 = new card.Card(null, null);
				card5.getCard();
				card5.printCard(card5);
				card5.setImage();
				displayImage5(card5.img);
			}
		}
		public void getGameStart(ActionEvent event)throws IOException{
			card.Card bankerCard1 = new card.Card(null, null);
			bankerCard1.getCard();
			bankerCard1.setImage();
			displayBankerImage1(bankerCard1.img);
			//displayBankerImage2("pokerback");
			card.Card card1 = new card.Card(null, null);
			card1.getCard();
			card1.setImage();
			displayImage1(card1.img);
			card.Card card2 = new card.Card(null, null);
			card2.getCard();
			card2.setImage();
			displayImage2(card2.img);
			}

		
	}
