package devvn;
import java.io.*;
import java.util.*;


public class Main {
	
	
static List<String> namelist;

String[] knownletters;	
static boolean dm;
static String input;
static String cleanedinput;
static String xword;
static String cleanedxword;
static ArrayList<String> inputs = new ArrayList<String>();
static List<String> field = new ArrayList<String>();
static int length;
static char[] letters;
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		List<String> namelist = str_party1.list;
		namelist.addAll(str_party2.list);
		namelist.addAll(str_party3.list);
		System.out.println("Uhr" + namelist);
		
		
		//INPUT
		System.out.println("R�tzel-L�ser v0.1");
		System.out.println("Bitte nenn mir, wie viele Buchstaben es im R�tzel gibt:");
	    int numberofletters = new java.util.Scanner( System.in ).nextInt();
	    if(numberofletters == 0){letters = new char[21]; dm = true; System.out.println("Wilkommen zur\u00FCck, Meister. DevMode aktiviert. Anzahl Buchstaben auf 21 gesetzt.");}
	    else{letters = new char[numberofletters];}

	    

	    
		while(true){
	    
		    System.out.println("Nun sag mir einen Buchstaben, welchen du schon kennst und gibst dann die dazugeh�rige Zahl an. Wenn du keine weiteren Buchstaben kennst, schreib 'Weiter'");
		    input = new java.util.Scanner( System.in ).nextLine();
		    input.toLowerCase();
if(dm)   	System.out.println(input);
		    if(input.equals("weiter"))break;
		    
		    cleanedinput="";
		    for(int i = 0; i < input.length(); i++){
		    	
		    	char c = input.charAt(i);
		    	if(!Character.isWhitespace(c)){
		    		cleanedinput += c;
		    	}

		    }inputs.add(cleanedinput);

	    }
if(dm)	System.out.println(inputs);
		
		
		System.out.println("jetzt tippe dein R�tzel von oben Links nach unten Rechts ab, dh Zahlen sind Zahlen, leerer Platz ist '0'");
	    xword = new java.util.Scanner( System.in ).nextLine();
	    xword.toLowerCase();
	    field = new ArrayList<String>(Arrays.asList(xword.split(" ")));
if(dm)  System.out.println("HIiiii" + field);
	    
	    System.out.print("Als letztes noch die Zeilenl�nge: ");
	    length = new java.util.Scanner( System.in ).nextInt();
if(dm)	System.out.println("dx" + namelist);
		
	    processing.verarbeitung(field, inputs, letters, length, namelist, dm);
		
	}
	
	
}
