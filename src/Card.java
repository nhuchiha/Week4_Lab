//Exercise #3

import java.util.Random;

public class Card 
{
	//Declare variables for face and suit values
	static int faceValue;
	static int suitValue;

	public static void main(String[] args) 
	{
		// create card object with face and suit value
		 Card card = new Card(faceValue, suitValue);
		 Random generator = new Random();
		 
		 //Generate 5 cards
		 for (int i = 0; i < 5; i++)
		 {  
			 faceValue = generator.nextInt(13) + 1;
			 suitValue = generator.nextInt(4) + 1;
		     System.out.print(card);
		 }
	}
	
	//Convert those suit and face values to string
	public String toString()
	{
		String card = "";
	 	switch (faceValue)
	 	{
		   case 1: 
			   card += " A";
		       break;
		   case 2: 
			   card += " 2";
		       break;
		   case 3: 
			   card += " 3";
		       break;
		   case 4: 
			   card += " 4";
		       break;
		   case 5: 
			   card += " 5";
		       break;    
		   case 6: 
			   card += " 6";
		       break;     
		   case 7: 
			   card += " 7";
		       break;    
		   case 8: 
			   card += " 8";
		       break;    
		   case 9: 
			   card += " 9";
		       break;    
		   case 10: 
			   card += " 10";
		       break;    
		   case 11:
			   card += " J";
		       break;
		   case 12:
			   card += " Q";
		       break;
		   case 13:
			   card += " K";
	       		break;
	 	}

	 	switch (suitValue)
	 	{
	   		case 1:
	   			card +='S';
	   			break;
	   		case 2:	
	   			card +='C';
	   			break;
	   		case 3: 
	   			card +='D';
	   			break;
	   		case 4: 
	   			card +='H';
	   			break;
	   	}
	  return card;
	}
	
	// Create Class Card with 2 parameters for faceValue and suitValue
	public Card(int suit, int face)  
    {
		faceValue = suit;
		suitValue = face;
    }
}
