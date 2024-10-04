package card;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Card {
	private String color;
	private String cardNumber;
	private int cardname;
	public Image img ;
	public boolean cansee=false;
	public Card(String color,String cardNumber) {
		this.color=color;
		this.cardNumber=cardNumber;
	}
	public void printCard(Card card) {
		System.out.println(card.color);
		System.out.println(card.cardNumber);
	}
	public void getCard() {
		
        final int MAX = 52;
        final int min = 1;
        int  r;
        String gcolor = null, gnum = null;
  
        do {
            r = (int) (Math.random() * (MAX - min + 1)) + min;
            /*switch (r / 13) {
                case 0:
                    gcolor = "Spades";
                    break;
                case 1:
                    gcolor = "Heart";
                    break;
                case 2:
                    gcolor = "Diamonds";
                    break;
                case 3:
                    gcolor = "club";
                    break;
            }*/
            if((double)r/13<=1) gcolor="Spades";
            else if((double)r/13>1&&r/13<=2) gcolor="Heart";
            else if((double)r/13>2&&(double)r/13<=3) gcolor="Diamonds";
            else if((double)r/13>3&&(double)r/13<=4) gcolor="Club";

            switch (r % 13) {
                case 1:
                    gnum="A";
                    break;
                case 11:
                    gnum = "J";
                    break;
                case 12:
                    gnum = "Q";
                    break;
                case 0:
                    gnum = "K";
                    break;
                default:
                    gnum=Integer.toString(r%13);
            }
            	
            if(NewCardSet.rbox[r-1] == true) continue;
            else if(NewCardSet.rbox[r-1]==false){
				NewCardSet.rbox[r-1] = true;
				NewCardSet.useall+=1;
				                
				if(NewCardSet.useall>=52) {
				  	for(int i=0;i<52;i++) {
				    		NewCardSet.rbox[i]=false;	
				    	}
				    	NewCardSet.useall=0;
				    }
				    break;
				}
           }while(true);
        
        this.cardNumber=gnum;
        this.color=gcolor;
        this.cardname=r;
        
	}
	
	public void setImage() {
		
		String image_name = "Card_" + Integer.toString(this.cardname) + ".png";
		this.img = new Image(getClass().getResourceAsStream(image_name));

	}

	
	
}

