import java.awt.Color;
import java.io.FileReader;
import java.util.Scanner;


public class Maps {

	public static void main(String[] args) throws java.io.IOException {
		Scanner fileScanner = new Scanner ( new FileReader("mapM.txt"));
		int width = fileScanner.nextInt();
		int height = fileScanner.nextInt();
		
		String inputText = fileScanner.nextLine();
		
		EZ.initialize(width*32,height*32);
		EZ.setBackgroundColor(new Color (0,0,0));
		
		EZImage [] WALLpicture = new EZImage [1000];
		EZImage [] items = new EZImage [25];
		
		int walls = 0;
		int itemCount = 0;
		
		for(int row = 0; row < height; row++) {
			inputText = fileScanner.nextLine();
		
		for(int column = 0; column < inputText.length(); column++) {
			char ch = inputText.charAt(column);
			switch (ch){
			case 'W' :
				WALLpicture [walls] = EZ.addImage("Block 6.png", column*30, row*30);
				walls++; 
				break;
			case 'I' :
				items [itemCount] = EZ.addImage("Block 4.png", column*30, row*30);
				itemCount++;
				break;	
			case 'L' :
				WALLpicture[walls] = EZ.addImage("Ladder.png", column*30, row*30);
				walls++;
				break;
			case 'D' :
				WALLpicture[walls] = EZ.addImage("gamer door-2.png", column*30, row*30);
				walls++;
				break;
			default:
					break;

			}	
			}
		}
		fileScanner.close();
		// TODO Auto-generated method stub

		
		
	}

} 
