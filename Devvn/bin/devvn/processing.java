package devvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class processing {
	
static boolean fp1,fp2,fp3,fp4,fp5,fp6,fp7,fp8,fp9,fp10,fp11,fp12,fp13,fp14,fp15,fp16,fp17,fp18,fp19,fp20,fp21,fp22;
static List<String> field_part1, field_part2, field_part3, field_part4, field_part5, field_part6, field_part7, field_part8, field_part9, field_part10, field_part11, field_part12, field_part13, field_part14, field_part15, field_part16, field_part17, field_part18, field_part19, field_part20, field_part21, field_part22;
static Integer key = 0;
static HashMap<Integer,List<String>> posMap = new HashMap<Integer, List<String>>();
static HashMap<Integer,String> startMap = new HashMap<Integer, String>();
static String bufferLetter = "";
static List<String> bufferList = new ArrayList<String>();
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


	for(int i=0; i < field.size()/l; i++){  //Die Schleife wird so oft durchlaufen wie´s Zeilen gibt
			
		    //Wieso ich kein Switch benutzt habe? Gab nen Error, das ist alles.
		    if (i == 1){field_part1 = field.subList(0, l); fp1 = true;}
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
            if (i >= 22){System.err.println("Index out of range - Rätsel zu lang, maximal 22 Zeilen!");}
			
	}
	replacing_replacing(dm, letters);

	
	
	//output.printProto(proto_output1, proto_output2, proto_output3, proto_output4, proto_output5, proto_output6, proto_output7, proto_output8, proto_output9, proto_output10, proto_output11, proto_output12, proto_output13, proto_output14, proto_output15, proto_output16, proto_output17, proto_output18, proto_output19, proto_output20, proto_output21, proto_output22, rows);			
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






public static void replacing(boolean dm, char[] letters, Integer key, List<String> part, boolean fp){
if (fp){
	for(int i = 0; i < part.size(); i++){
			for(int x = 0; x < letters.length; x++){
				if (part.get(i).equals(""+(x+1))){if(!posMap.containsKey(key))if(letters[x]==' '){bufferLetter+=(part.get(i));}
				                                                                     else{bufferLetter+=(Character.toString(letters[x]));} }

			}
			bufferList.add(bufferLetter);
			bufferLetter = "";
    }
	if(!bufferList.isEmpty())
	posMap.put(key, bufferList);
if(dm)	System.out.println(posMap.get(key));
	bufferList.clear();

	}	  
}



	public static void replacing_replacing(boolean dm, char[] letters){
		replacing(dm, letters, key, field_part1, fp1);
		key++;
		replacing(dm, letters, key, field_part2, fp2);
		key++;
		replacing(dm, letters, key, field_part3, fp3);	
		key++;
		replacing(dm, letters, key, field_part4, fp4);
		key++;
		replacing(dm, letters, key, field_part5, fp5);	
		key++;
		replacing(dm, letters, key, field_part6, fp6);	
		key++;
		replacing(dm, letters, key, field_part7, fp7);
		key++;
		replacing(dm, letters, key, field_part8, fp8);
		key++;
		replacing(dm, letters, key, field_part9, fp9);	
		key++;
		replacing(dm, letters, key, field_part10, fp10);	
		key++;
		replacing(dm, letters, key, field_part11, fp11);	
		key++;
		replacing(dm, letters, key, field_part12, fp12);	
		key++;
		replacing(dm, letters, key, field_part13, fp13);
		key++;
		replacing(dm, letters, key, field_part14, fp14);	
		key++;
		replacing(dm, letters, key, field_part15, fp15);	
		key++;
		replacing(dm, letters, key, field_part16, fp16);	
		key++;
		replacing(dm, letters, key, field_part17, fp17);
		key++;
		replacing(dm, letters, key, field_part18, fp18);	
		key++;
		replacing(dm, letters, key, field_part19, fp19);	
		key++;
		replacing(dm, letters, key, field_part20, fp20);	
		key++;
		replacing(dm, letters, key, field_part21, fp21);	
		key++;
		replacing(dm, letters, key, field_part22, fp22);	
		key++;
	}


}






