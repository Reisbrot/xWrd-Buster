package devvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class processing {
	
static boolean fp1,fp2,fp3,fp4,fp5,fp6,fp7,fp8,fp9,fp10,fp11,fp12,fp13,fp14,fp15,fp16,fp17,fp18,fp19,fp20,fp21,fp22;
static List<String> field_part1, field_part2, field_part3, field_part4, field_part5, field_part6, field_part7, field_part8, field_part9, field_part10, field_part11, field_part12, field_part13, field_part14, field_part15, field_part16, field_part17, field_part18, field_part19, field_part20, field_part21, field_part22;
static List<String> vertical_part1, vertical_part2, vertical_part3, vertical_part4, vertical_part5, vertical_part6, vertical_part7, vertical_part8, vertical_part9, vertical_part10, vertical_part11, vertical_part12, vertical_part13, vertical_part14, vertical_part15, vertical_part16, vertical_part17, vertical_part18, vertical_part19, vertical_part20, vertical_part21, vertical_part22;
static Integer keyV = 0;
static Integer keyH = 0;
static HashMap<Integer,List<String>> hrzMap = new HashMap<Integer, List<String>>();
static HashMap<Integer,List<String>> verMap = new HashMap<Integer, List<String>>();
static HashMap<Integer,String> startMap = new HashMap<Integer, String>();
static String bufferLetter = "";
static List<String> bufferList = new ArrayList<String>();
static int rows;
static String number_docking = "";
static String letter_docking = "";
static int number;
static int[] numbers;
static char[] cleaned_letters;
static int hrzMap_length = 0;
static List<String> difault = new ArrayList<String>();


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
            if (i >= 22){System.err.println("Index out of range - R�tsel zu lang, maximal 22 Zeilen!");}
			
	}
	replacing_replacing(dm, letters);
	verticalice(dm);
	
	for(int i = 0; i < hrzMap.size(); i++){
		if(!hrzMap.get(i).equals("")) hrzMap_length++;
	}
	
    idk.main(hrzMap, list, dm, hrzMap_length);
	
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






public static List<String> replacing(boolean dm, char[] letters, Integer keyH, List<String> part, boolean fp){
List<String> returned = new ArrayList<String>();
if (fp){
	for(int i = 0; i < part.size(); i++){
			for(int x = 0; x < letters.length; x++){
				if (part.get(i).equals(""+(x+1))){if(!hrzMap.containsKey(keyH))if(letters[x]==' '){bufferLetter+=(part.get(i));}
				                                                                     else{bufferLetter+=(Character.toString(letters[x]));} }

			}
			bufferList.add(bufferLetter);
			bufferLetter = "";

    }
	returned.addAll(bufferList);
	bufferList.clear();
		return returned;


	//hrzMap.put(keyH, bufferList);
//if(dm)	System.out.println(hrzMap.get(keyH));
//	bufferList.clear();

	}
return difault;

}



public static void replacing_replacing(boolean dm, char[] letters){

		field_part1 = replacing(dm, letters, keyH, field_part1, fp1);
		hrzMap.put(keyH, field_part1);
		keyH++;
		
		field_part2 = replacing(dm, letters, keyH, field_part2, fp2);
		hrzMap.put(keyH, field_part2);
		keyH++;
		
		field_part3 = replacing(dm, letters, keyH, field_part3, fp3);
		hrzMap.put(keyH, field_part3);
		keyH++;
		
		field_part4 = replacing(dm, letters, keyH, field_part4, fp4);
		hrzMap.put(keyH, field_part4);
		keyH++;
		
		field_part5 = replacing(dm, letters, keyH, field_part5, fp5);
		hrzMap.put(keyH, field_part5);
		keyH++;
		
		field_part6 = replacing(dm, letters, keyH, field_part6, fp6);
		hrzMap.put(keyH, field_part6);
		keyH++;
		
		field_part7 = replacing(dm, letters, keyH, field_part7, fp7);
		hrzMap.put(keyH, field_part7);
		keyH++;
		
		field_part8 = replacing(dm, letters, keyH, field_part8, fp8);
		hrzMap.put(keyH, field_part8);
		keyH++;
		
		field_part9 = replacing(dm, letters, keyH, field_part9, fp9);
		hrzMap.put(keyH, field_part9);
		keyH++;
		
		field_part10 = replacing(dm, letters, keyH, field_part10, fp10);
		hrzMap.put(keyH, field_part10);
		keyH++;
		
		field_part11 = replacing(dm, letters, keyH, field_part11, fp11);
		hrzMap.put(keyH, field_part11);
		keyH++;
		
		field_part12 = replacing(dm, letters, keyH, field_part12, fp12);
		hrzMap.put(keyH, field_part12);
		keyH++;
		
		field_part13 = replacing(dm, letters, keyH, field_part13, fp13);
		hrzMap.put(keyH, field_part13);
		keyH++;
		
		field_part14 = replacing(dm, letters, keyH, field_part14, fp14);
		hrzMap.put(keyH, field_part14);
		keyH++;
		
		field_part15 = replacing(dm, letters, keyH, field_part15, fp15);
		hrzMap.put(keyH, field_part15);
		keyH++;
		
		field_part16 = replacing(dm, letters, keyH, field_part16, fp16);
		hrzMap.put(keyH, field_part16);
		keyH++;
		
		field_part17 = replacing(dm, letters, keyH, field_part17, fp17);
		hrzMap.put(keyH, field_part17);
		keyH++;
		
		field_part18 = replacing(dm, letters, keyH, field_part18, fp18);
		hrzMap.put(keyH, field_part18);
		keyH++;

		field_part19 = replacing(dm, letters, keyH, field_part19, fp19);
		hrzMap.put(keyH, field_part19);
		keyH++;
		
		field_part20 = replacing(dm, letters, keyH, field_part20, fp20);
		hrzMap.put(keyH, field_part20);
		keyH++;
		
		field_part21 = replacing(dm, letters, keyH, field_part21, fp21);
		hrzMap.put(keyH, field_part21);
		keyH++;
		
		field_part22 = replacing(dm, letters, keyH, field_part22, fp22);
		hrzMap.put(keyH, field_part22);
		keyH++;
		
		System.out.println(hrzMap);
	}


public static List<String> toVertical(int waldquell){
	List<String> vertical = new ArrayList<String>();
	if(!fp1) System.out.println("Iwas is da kaputt");
	if(!fp2) System.out.println("Iwas is da kaputt");
	if(!fp3) System.out.println("Iwas is da kaputt");
	if(!fp4) System.out.println("Iwas is da kaputt");
	if(!fp5) System.out.println("Iwas is da kaputt");
	if(!fp6) System.out.println("Iwas is da kaputt");
	if(!fp7) System.out.println("Iwas is da kaputt");
	if(!fp8) System.out.println("Iwas is da kaputt");
	if(!fp9) System.out.println("Iwas is da kaputt");
	if(!fp10){ for(int i = 0; i < 9; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp11){ for(int i = 0; i < 10; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp12){ for(int i = 0; i < 11; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp13){ for(int i = 0; i < 12; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp14){ for(int i = 0; i < 13; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp15){ for(int i = 0; i < 14; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp16){ for(int i = 0; i < 15; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp17){ for(int i = 0; i < 16; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp18){ for(int i = 0; i < 17; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp19){ for(int i = 0; i < 18; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp20){ for(int i = 0; i < 19; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp21){ for(int i = 0; i < 20; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	if(!fp22){ for(int i = 0; i < 21; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
	return vertical;
}

public static void verticalice(boolean dm){
	for(int i = 0; i < field_part1.size() ; i++){
		if(i == 1) {vertical_part1 = toVertical(0); verMap.put(keyV, vertical_part1); keyV++;}
		if(i == 1) {vertical_part2 = toVertical(1); verMap.put(keyV, vertical_part2); keyV++;}
		if(i == 2) {vertical_part3 = toVertical(2); verMap.put(keyV, vertical_part3); keyV++;}
		if(i == 3) {vertical_part4 = toVertical(3); verMap.put(keyV, vertical_part4); keyV++;}
		if(i == 4) {vertical_part5 = toVertical(4); verMap.put(keyV, vertical_part5); keyV++;}
		if(i == 5) {vertical_part6 = toVertical(5); verMap.put(keyV, vertical_part6); keyV++;}
		if(i == 6) {vertical_part7 = toVertical(6); verMap.put(keyV, vertical_part7); keyV++;}
		if(i == 7) {vertical_part8 = toVertical(7); verMap.put(keyV, vertical_part8); keyV++;}
		if(i == 8) {vertical_part9 = toVertical(8); verMap.put(keyV, vertical_part9); keyV++;}
		if(i == 9) {vertical_part10 = toVertical(9); verMap.put(keyV, vertical_part10); keyV++;}
		if(i == 10) {vertical_part11 = toVertical(10); verMap.put(keyV, vertical_part11); keyV++;}
		if(i == 11) {vertical_part12 = toVertical(11); verMap.put(keyV, vertical_part12); keyV++;}
		if(i == 12) {vertical_part13 = toVertical(12); verMap.put(keyV, vertical_part13); keyV++;}
		if(i == 13) {vertical_part14 = toVertical(13); verMap.put(keyV, vertical_part14); keyV++;}
		if(i == 14) {vertical_part15 = toVertical(14); verMap.put(keyV, vertical_part15); keyV++;}
		if(i == 15) {vertical_part16 = toVertical(15); verMap.put(keyV, vertical_part16); keyV++;}
		if(i == 16) {vertical_part17 = toVertical(16); verMap.put(keyV, vertical_part17); keyV++;}
		if(i == 17) {vertical_part18 = toVertical(17); verMap.put(keyV, vertical_part18); keyV++;}
		if(i == 18) {vertical_part19 = toVertical(18); verMap.put(keyV, vertical_part19); keyV++;}
		if(i == 19) {vertical_part20 = toVertical(19); verMap.put(keyV, vertical_part20); keyV++;}
		if(i == 20) {vertical_part21 = toVertical(20); verMap.put(keyV, vertical_part21); keyV++;}
		if(i == 21) {vertical_part22 = toVertical(21); verMap.put(keyV, vertical_part22); keyV++;}
	}
	System.out.println(verMap);
	
}




}






