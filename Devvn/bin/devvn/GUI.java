package devvn;

import java.util.*;

public class GUI {
String[] knownletters;	
static String user_input;
static String xword;
static String cleanedxword;
static ArrayList<String> inputs = new ArrayList<String>();
static List<String> xWrd = new ArrayList<String>();
static int length;

    public static void main(String[] args){
        

        
        GUI g = new GUI();
        g.userInput();
        

	}

    
    void userInput(){
        DataCollection o = new DataCollection();
        Database g = new Database();
	List<String> namelist = o.getWordlist();
        
                //INPUT
	System.out.println("R\u00e4tzel-L\u00f6ser v0.1");
	System.out.println("Bitte nenn mir, wie viele Buchstaben es im R\u00a9tzel gibt:");
	int lettercount = new java.util.Scanner( System.in ).nextInt();
	if(lettercount == 0){
            g.setLetters(new char[21]);
            //char letters[] = new char[21]; 
            lettercount = 21;
            g.setDM(true);
            inputs.add("h1"); inputs.add("r2"); inputs.add("i3"); inputs.add("d4");
            length = 12;
            xWrd = new ArrayList<String>(Arrays.asList("7 17 0 7 3 13 8 16 7 13 0 7 16 21 21 16 1 0 15 0 10 11 12 10 11 7 0 7 0 20 16 15 3 0 6 14 1 0 5 3 18 4 1 6 8 10 0 3 10 9 3 0 4 16 18 0 8 0 15 12 13 2 10 17 0 18 0 2 10 13 2 6 10 0 8 0 16 8 10 16 18 0 16 0 0 19 10 18 10 12 0 13 0 2 3 6 4 3 18 0 18 0 15 10 1 10 21 19 0 21 0 21 10 10 2 0 16 15 16 0 20 10 4 10 3 1 10 18 0 10 0 13 10 13 17 3 8 0 13 0 10 21 19 10 5 8 0 13 0 8 13 3 21 21 0 21 10 0 1 10 20 10 21 0 15 0 8 21 1 10 2 2 0 1 0 15 2 17 13 0 2 0 3 0 10 2 18 10 17 10 2 18 0 16 4 16 7 0 16 17 8 0 16 0 6 1 0 4 17 2 0 21 0 15 18 4 2 16 1 0 8 0 20 10 1 10 20 10".split(" ")));
            System.out.println("Wilkommen zur\u00FCck, Meister. DevMode aktiviert. Anzahl Buchstaben auf 21 gesetzt.");
        }
        
	else{
            g.setLetters(new char[lettercount]);
          //letters = new char[numberofletters
          //TODO statt letters g.get!!!!!§"!"!"!"!!""!!---!§%!$%&§/&$($IMPORTANT
        }

	    
    
        if(!g.getDM())	while(true){
	    
		    System.out.println("Nun sag mir einen Buchstaben, welchen du schon kennst und gibst dann die dazugeh\u00f6rige Zahl an. Wenn du keine weiteren Buchstaben kennst, schreib 'Weiter'");
		    user_input = new java.util.Scanner( System.in ).nextLine();
		    user_input.toLowerCase();
        if(g.getDM())System.out.println("User Input: " + user_input);
		    if(user_input.equals("weiter"))break;
		    
		    String cleanedinput="";
		    for(int i = 0; i < user_input.length(); i++){
		    	
		    	char c = user_input.charAt(i);
		    	if(!Character.isWhitespace(c)){
		    		cleanedinput += c;
		    	}

		    }inputs.add(cleanedinput);

	    }
if(g.getDM())	System.out.println("Inputs: " + inputs);
		
if(!g.getDM())while(true){
		System.out.println("jetzt tippe dein R\u00e4tzel von oben Links nach unten Rechts ab, dh Zahlen sind Zahlen, leerer Platz ist '0'");
	    xword = new java.util.Scanner( System.in ).nextLine();
	    xword.toLowerCase();
	    xWrd = new ArrayList<String>(Arrays.asList(xword.split(" ")));
if(g.getDM())  System.out.println("Field: " + xWrd);
	    
	    System.out.print("Als letztes noch die Zeilenl\u00e4nge: ");
	    length = new java.util.Scanner( System.in ).nextInt();
	    break;
	}
if(g.getDM())	System.out.println("Namelist: " + namelist);
	    processing.verarbeitung(g, namelist);
		
        
    }
    


    
	
	
}
