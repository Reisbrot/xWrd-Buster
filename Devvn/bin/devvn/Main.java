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
		System.out.println("Rätzel-Löser v0.1");
		System.out.println("Bitte nenn mir, wie viele Buchstaben es im Rätzel gibt:");
	    int numberofletters = new java.util.Scanner( System.in ).nextInt();
	    if(numberofletters == 0){letters = new char[21]; dm = true; System.out.println("Wilkommen zur\u00FCck, Meister. DevMode aktiviert. Anzahl Buchstaben auf 21 gesetzt.");}
	    else{letters = new char[numberofletters];}

	    

	    
if(!dm)	while(true){
	    
		    System.out.println("Nun sag mir einen Buchstaben, welchen du schon kennst und gibst dann die dazugehörige Zahl an. Wenn du keine weiteren Buchstaben kennst, schreib 'Weiter'");
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

	    }										if(dm){inputs.add("h1"); inputs.add("r2"); inputs.add("i3"); inputs.add("d4");}
if(dm)	System.out.println(inputs);
		
if(!dm)while(true){
		System.out.println("jetzt tippe dein Rätzel von oben Links nach unten Rechts ab, dh Zahlen sind Zahlen, leerer Platz ist '0'");
	    xword = new java.util.Scanner( System.in ).nextLine();
	    xword.toLowerCase();
	    field = new ArrayList<String>(Arrays.asList(xword.split(" ")));
if(dm)  System.out.println("HIiiii" + field);
	    
	    System.out.print("Als letztes noch die Zeilenlänge: ");
	    length = new java.util.Scanner( System.in ).nextInt();
	    break;
	}																if(dm){length = 12; field = new ArrayList<String>(Arrays.asList("7 17 0 7 3 13 8 16 7 13 0 7 16 21 21 16 1 0 15 0 10 11 12 10 11 7 0 7 0 20 16 15 3 0 6 14 1 0 5 3 18 4 1 6 8 10 0 3 10 9 3 0 4 16 18 0 8 0 15 12 13 2 10 17 0 18 0 2 10 13 2 6 10 0 8 0 16 8 10 16 18 0 16 0 0 19 10 18 10 12 0 13 0 2 3 6 4 3 18 0 18 0 15 10 1 10 21 19 0 21 0 21 10 10 2 0 16 15 16 0 20 10 4 10 3 1 10 18 0 10 0 13 10 13 17 3 8 0 13 0 10 21 19 10 5 8 0 13 0 8 13 3 21 21 0 21 10 0 1 10 20 10 21 0 15 0 8 21 1 10 2 2 0 1 0 15 2 17 13 0 2 0 3 0 10 2 18 10 17 10 2 18 0 16 4 16 7 0 16 17 8 0 16 0 6 1 0 4 17 2 0 21 0 15 18 4 2 16 1 0 8 0 20 10 1 10 20 10".split(" ")));}
if(dm)	System.out.println("dx" + namelist);
		
	    processing.verarbeitung(field, inputs, letters, length, namelist, dm);
		
	}
	
	
}
