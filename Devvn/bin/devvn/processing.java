package devvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class processing {
	
static boolean fp1;
static boolean fp2;
static boolean fp3;
static boolean fp4;
static boolean fp5;
static boolean fp6;
static boolean fp7;
static boolean fp8;
static boolean fp9;
static boolean fp10;
static boolean fp11;
static boolean fp12;
static boolean fp13;
static boolean fp14;
static boolean fp15;
static boolean fp16;
static boolean fp17;
static boolean fp18;
static boolean fp19;
static boolean fp20;
static boolean fp21;
static boolean fp22;
static List<String> field_part1;
static List<String> field_part2;
static List<String> field_part3;
static List<String> field_part4;
static List<String> field_part5;
static List<String> field_part6;
static List<String> field_part7;
static List<String> field_part8;
static List<String> field_part9;
static List<String> field_part10;
static List<String> field_part11;
static List<String> field_part12;
static List<String> field_part13;
static List<String> field_part14;
static List<String> field_part15;
static List<String> field_part16;
static List<String> field_part17;
static List<String> field_part18;
static List<String> field_part19;
static List<String> field_part20;
static List<String> field_part21;
static List<String> field_part22;
static List<String> proto_output1;
static List<String> proto_output2;
static List<String> proto_output3;
static List<String> proto_output4;
static List<String> proto_output5;
static List<String> proto_output6;
static List<String> proto_output7;
static List<String> proto_output8;
static List<String> proto_output9;
static List<String> proto_output10;
static List<String> proto_output11;
static List<String> proto_output12;
static List<String> proto_output13;
static List<String> proto_output14;
static List<String> proto_output15;
static List<String> proto_output16;
static List<String> proto_output17;
static List<String> proto_output18;
static List<String> proto_output19;
static List<String> proto_output20;
static List<String> proto_output21;
static List<String> proto_output22;

static int rows;
static String number_docking = "";
static String letter_docking = "";
static int number;
static int[] numbers;
static char[] cleaned_letters;

@SuppressWarnings("all")
static void verarbeitung(List<String> field, ArrayList<String> known, char[] letters, int l, List<String> list, boolean dm) {
	
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

if(dm)System.out.println("iehfiuh  " + Arrays.toString(numbers) + "    " + Arrays.toString(cleaned_letters) + "    " + Arrays.toString(letters));


	for(int i=0; i < field.size()/l; i++){  //Die Schleife wird so oft durchlaufen wie�s Zeilen gibt
			
		    //Wieso ich kein Switch benutzt habe? Gab nen Error, das ist alles.
            if (i == 0){field_part1 = field.subList(0, l); fp1 = true;}
            if (i == 1){field_part2 = field.subList(l, 2*l); fp2 = true;}
            if (i == 2){field_part3 = field.subList(2*l, 3*l); fp3 = true;}
            if (i == 3){field_part4 = field.subList(3*l, 4*l); fp4 = true;}
            if (i == 4){field_part5 = field.subList(4*l, 5*l); fp5 = true;}
            if (i == 5){field_part6 = field.subList(5*l, 6*l); fp6 = true;}
            if (i == 6){field_part7 = field.subList(6*l, 7*l); fp7 = true;}
            if (i == 7){field_part8 = field.subList(7*l, 8*l); fp8 = true;}
            if (i == 8){field_part9 = field.subList(8*l, 9*l); fp9 = true;}
            if (i == 9){field_part10 = field.subList(9*l, 10*l); fp10 = true;}
            if (i == 10){field_part11 = field.subList(10*l, 11*l); fp11 = true;}
            if (i == 11){field_part12 = field.subList(11*l, 12*l); fp12 = true;}
            if (i == 12){field_part13 = field.subList(12*l, 13*l); fp13 = true;}
            if (i == 13){field_part14 = field.subList(13*l, 14*l); fp14 = true;}
            if (i == 14){field_part15 = field.subList(14*l, 15*l); fp15 = true;}
            if (i == 15){field_part16 = field.subList(15*l, 16*l); fp16 = true;}
            if (i == 16){field_part17 = field.subList(16*l, 17*l); fp17 = true;}
            if (i == 17){field_part18 = field.subList(17*l, 18*l); fp18 = true;}
            if (i == 18){field_part19 = field.subList(18*l, 19*l); fp19 = true;}
            if (i == 19){field_part20 = field.subList(19*l, 20*l); fp20 = true;}
            if (i == 20){field_part21 = field.subList(20*l, 21*l); fp21 = true;}
            if (i == 21){field_part22 = field.subList(21*l, 22*l); fp22 = true;}
            if (i >= 22){System.err.println("Index out of range - R�tsel zu lang, maximal 22 Zeilen!");}
			
	}
if(dm)	System.out.println(field_part1);
		for(int i = 0; i < letters.length; i++){
			while(true){
				x = frequency();
				Character character = letters[i];
				int replacement = field_part1.indexOf(""+(i+1));
				if(replacement != -1){
				String c = field_part1.get(replacement);
if(dm)			System.out.println("blah" + c + " auf " + replacement);
				}else{break;}
		    }	
		}

	output.printProto(proto_output1, proto_output2, proto_output3, proto_output4, proto_output5, proto_output6, proto_output7, proto_output8, proto_output9, proto_output10, proto_output11, proto_output12, proto_output13, proto_output14, proto_output15, proto_output16, proto_output17, proto_output18, proto_output19, proto_output20, proto_output21, proto_output22, rows);

	for(int x=0; x < l; x++){           //F�r jedes Zeichen
					
				
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

public static int frequency(String source, String part){
 if(source == null||source.isEmpty()||part.isEmpty()||part == null)return -1;
 
  int count = 0;
	
  for(int pos = 0; (pos = source.indexOf(part, pos)) != -1; count++)
	  pos += part.length();  
  
  return count;
 }


}








