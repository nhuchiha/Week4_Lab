//Exercise #3
import java.util.Random;
public class Card 
{
	//Declare variables for face and suit values
	static int faceValue;
	static int suitValue;
			
	public static void main(String[] args) 
	{
		//Create card object with face and suit Value
		Card card = new Card(faceValue, suitValue);
		Random generator = new Random();
		
		//Generate 5 cards
		for(int i = 0; i < 5; i++)
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
				card = card + " A";
				break;
			case 2: 
				card = card + " B"; 
				break;
			case 3: 
				card = card + " 3";
				break;
			case 4: 
				card = card + " 4";
				break;
			case 5: 
				card = card + " 5";
				break;
			case 6: 
				card = card + " 6";
				break;
			case 7:
				card = card + " 7";
			case 8: 
				card = card + " 8";
			case 9:
				card = card + " 9";
				break;
			case 10:
				card = card + " 10";
				break;
			case 11:
				card = card + " J";
				break;
			case 12:
				card = card + " Q";
				break;
			case 13:
				card = card + " K";
				break;		
		}
		
		switch (suitValue)
		{
			case 1: 
				card = card + "S";
				break;
			case 2:
				card = card + "C";
				break;
			case 3:
				card = card + "D";
				break;
			case 4:
				card = card + "H";
		}
		return card;
	}
	
	//Create class Card with 2 parameters for faceValue and suitValue
	public Card(int suit, int face)
	{
		faceValue = suit;
		suitValue = face;
	}

}
