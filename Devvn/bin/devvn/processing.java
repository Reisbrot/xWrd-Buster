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
	
	Arrays.fill(letters, 0, letters.length, ' ');
	
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
			

	
	/*System.out.println(field_part1);
	System.out.println(field_part2);
	System.out.println(field_part3);
	System.out.println(field_part4);
	System.out.println(field_part5);
	System.out.println(field_part6);
	System.out.println(field_part7);
	System.out.println(field_part8);
	System.out.println(field_part9);
	System.out.println(field_part10);
	System.out.println(field_part11);
	System.out.println(field.size());*/
	
	
	
	
	
	for(int i=0; i < field.size()/l; i++){  //Die Schleife wird so oft durchlaufen wie´s Zeilen gibt
			
			switch(i){
			case 0: List<String> field_part1 = field.subList(0, l);
			System.out.println(field_part1);
			case 1: List<String> field_part2 = field.subList(l, 2*l);
			System.out.println(field_part2);
			case 2: List<String> field_part3 = field.subList(2*l, 3*l);
			System.out.println(field_part3);
			case 3:	List<String> field_part4 = field.subList(3*l, 4*l);
			System.out.println(field_part4);
			case 4: List<String> field_part5 = field.subList(4*l, 5*l);
			System.out.println(field_part5);
			case 5: List<String> field_part6 = field.subList(5*l, 6*l);
			System.out.println(field_part6);
			case 6: List<String> field_part7 = field.subList(6*l, 7*l);
			System.out.println(field_part7);
			case 7: List<String> field_part8 = field.subList(7*l, 8*l);
			System.out.println(field_part8);
			case 8: List<String> field_part9 = field.subList(8*l, 9*l);
			System.out.println(field_part9);
			case 9:	List<String> field_part10 = field.subList(9*l, 10*l);
			System.out.println(field_part10);
			case 10: List<String> field_part11 = field.subList(10*l, 11*l);
			System.out.println(field_part11);
			
			}
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








