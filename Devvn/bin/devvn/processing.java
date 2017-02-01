package devvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class processing {
		
static String number_docking = "";
static String letter_docking = "";
static int number;
static int[] numbers;
static char[] cleaned_letters;

static void verarbeitung(List<String> field, ArrayList<String> known, char[] letters, int l, List<String> list) {
		
	numbers = new int[known.size()];
	cleaned_letters = new char[known.size()];
	
	
	for(int i = 0; i < known.size(); i++){
		int x=0;
		while(true){
		 Character character = known.get(i).charAt(x);
	        if (Character.isDigit(character))
	            number_docking += character;
	        
			if (x < known.get(i).length()-1){x++;}else{number = Integer.parseInt(number_docking); numbers[i] = number;  number_docking=""; break;}
			}
		
		Character character = known.get(i).charAt(0);
		letter_docking += character;
	}
	cleaned_letters = letter_docking.toCharArray();
	
	
	for(int i = 0; i < known.size(); i++){
		letters[numbers[i]-1] = cleaned_letters[i]; 
	}
	
	
		
	
	
System.out.println("iehfiuh  " + Arrays.toString(numbers) + "    " + Arrays.toString(cleaned_letters) + "    " + Arrays.toString(letters));
			
	
	
	
	
		
		for(int i=0; i < field.size()/l; i++){  //Die Schleife wird so oft durchlaufen wie´s Zeilen gibt
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*List<String> field_part_1 = field.subList(0, l-1);
			List<String> field_part_2 = field.subList(l, l+l-1);
			List<String> field_part_3 = field.subList(l+l, i*l-1);
			List<String> field_part_4 = field.subList(l+l+l, i*l-1);
			List<String> field_part_5 = field.subList(l+l+l+l, i*l-1);
			List<String> field_part_6 = field.subList(l+l+l+l+l, i*l-1);
			List<String> field_part_7 = field.subList(l+l+l+l+l+l, i*l-1);*/

			
			
			
			
			for(int x=0; x < l; x++){           //Für jedes Zeichen
				
			}
			
		}
	}








public static List<String> readFile(String fileName) {
    try {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
	return null;
  }

}








