package card;

public class NewCardSet {
	
	public static boolean[] rbox=new boolean[52];
	public static int useall=0;
	
	public static void main(String[] args) {
	        String[] color = {"Spades", "Heart", "Diamonds", "Club"};
	        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	        
	        for(int i=0;i<52;i++) {
	        	rbox[i]=false;
	        }
	     }
}
