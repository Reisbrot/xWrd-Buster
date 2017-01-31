package devvn;
import java.io.*;
import java.util.*;


public class Main {
	
	
static List<String> namelist = FileUtils.readLines(new File("wordlist"));
String[] wordlist = namelist.toArray(new String[0]);
String[] knownletters;	

static String input;
static String cleanedinput;
static String xword;
static String cleanedxword;
static ArrayList<String> inputs = new ArrayList<String>();
static List<String> field = new ArrayList<String>();
static int length;
	
	public static void main(String[] args){
		//INPUT
		System.out.println("Rätzel-Löser v0.1");
		System.out.println("Bitte nenn mir, wie viele Buchstaben es im Rätzel gibt:");
	    int numberofletters = new java.util.Scanner( System.in ).nextInt();
	    char[] letters = new char[numberofletters];
	    

	    
		while(true){
	    
		    System.out.println("Nun sag mir einen Buchstaben, welchen du schon kennst und gibst dann die dazuehörige Zahl an. Wenn du keine weiteren Buchstaben kennst, schreib 'Weiter'");
		    input = new java.util.Scanner( System.in ).nextLine();
		    input.toLowerCase();
		    System.out.println(input);
		    if(input.equals("weiter"))break;
		    
		    cleanedinput="";
		    for(int i = 0; i < input.length(); i++){
		    	
		    	char c = input.charAt(i);
		    	if(!Character.isWhitespace(c)){
		    		cleanedinput += c;
		    	}

		    }inputs.add(cleanedinput);

	    }
		System.out.println(inputs);
		
		
		System.out.println("jetzt tippe dein Rätzel von oben Links nach unten Rechts ab, dh Zahlen sind Zahlen, leerer Platz ist '0'");
	    xword = new java.util.Scanner( System.in ).nextLine();
	    xword.toLowerCase();
	    field = new ArrayList<String>(Arrays.asList(xword.split(" ")));
	    System.out.println("HIiiii" + field);
	    
	    System.out.print("Als letztes noch die Zeilenlänge: ");
	    length = new java.util.Scanner( System.in ).nextInt();
		System.out.println("dx" + namelist);
	    verarbeitung(field, inputs, numberofletters, length, namelist);
		
	}

	
	
	private static void verarbeitung(List<String> field, ArrayList<String> known, int sobig, int l, List<String> list) {
		for(int i=0; i < field.size()/l; i++){  //Die Schleife wird so oft durchlaufen wie´s Zeilen gibt
			List<String> field_part_1 = field.subList(0, l-1);
			List<String> field_part_2 = field.subList(l, l+l-1);
			List<String> field_part_3 = field.subList(l+l, i*l-1);
			List<String> field_part_4 = field.subList(l+l+l, i*l-1);
			List<String> field_part_5 = field.subList(l+l+l+l, i*l-1);
			List<String> field_part_6 = field.subList(l+l+l+l+l, i*l-1);
			List<String> field_part_7 = field.subList(l+l+l+l+l+l, i*l-1);

			
			
			
			
			for(int x=0; x < l; x++){           //Für jedes Zeichen
				
			}
			
		}
	}
		


	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
