package devvn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sun.security.acl.WorldGroupImpl;

public class idk {
  static int leer;
  static int zeichen_gesamt;
  static int zeichen_folge;
  static int letterPos;
  static int anfang = -1;
  static int ende;
  static int zwei;
  static int nextleer;
  static int posInline;
  static int finalPos;
  static int wordlength;
  static int wordlength2;
  static int wordlength3;
  static boolean moreThn2Wrds;
  static boolean rlyExct2Wrds;
  static int zeichen;
  static List<Integer> wordpositions = new ArrayList<Integer>();
  static List<Integer> seppositions = new ArrayList<Integer>();
  
    public static void main(List<String> list, boolean dm, int size, int zaile, int zaichen){
			
     HashMap<Integer,List<String>> posMap = processing.hrzMap;
     wordlength = 0;
	wordlength2 = 0;
	wordlength3 = 0;
	zeichen_folge = 0;
	zeichen_gesamt = 0;
	wordpositions.clear();
	seppositions.clear();
	moreThn2Wrds = false;
	rlyExct2Wrds = false;
	
	int length = posMap.get(1).size();
if(dm)	System.out.println("Length: " + posMap.get(1).size());
			
	for(int zeile = zaile; zeile < size; zeile++){
		for(zeichen = zaichen; zeichen < length; zeichen++){
			if(posMap.get(zeile).get(zeichen).equals("")){
				leer++;
				zeichen_folge = 0;
				seppositions.add(zeichen);
if(dm)		System.out.println("Seppositions: " + seppositions);
	}
				
if(dm)		System.out.println("Zeile: " + zeile + " " + ", Zeichen: " + zeichen);
                if(!posMap.get(zeile).get(zeichen).isEmpty()){
		if(Character.isDigit(posMap.get(zeile).get(zeichen).charAt(0)) || Character.isAlphabetic(posMap.get(zeile).get(zeichen).charAt(0))){
		zeichen_gesamt++;
		zeichen_folge++;
		if(zeichen_folge == 3){
		if(nextleer != leer){
		wordpositions.add(zeichen - 3);
if(dm)								System.out.println("Wordpositions: " + wordpositions);
									zeichen_folge = 0;
									nextleer = leer;
								}
							}
						}
					}
				}
				// ZEILE 18 und 8 UND 15 HABEN JE DIE WORTL�NGEN 0 UND 0!!!! �BEREINSTIMMUNG IN SEPARATORENSETZUNG!!! GRUND !AUSFINDIG GEMACHT!!! 3BUCHSTABEN AM ANFANG GEBEN EINEN ERROR!!! 4 GEHT ABER AUCH!!!
				
				if(wordpositions.size() > 2) moreThn2Wrds = true;
				if(wordpositions.size() == 2) rlyExct2Wrds = true;
				for(int wp = 0; wp < wordpositions.size(); wp++){ //TODO >>ACHTUNG!<< !!!NOCH KEIN "ES GIBT NUR EIN WORT UND DAS ENDET AM ENDE DER ZEILE" FALL EINGEPLANT!!!
					if(wp == (wordpositions.size() -1) && moreThn2Wrds)wordlength3 = length - wordpositions.get(wp) - 1;  //mehr als 2 W�rter in einer horizontalen Zeile werden nicht unterst�tzt!!!! :c 
					if(wp == (wordpositions.size() -1) && rlyExct2Wrds)wordlength2 = length - wordpositions.get(wp) - 1;
					for(int sp = 0; sp < seppositions.size(); sp++){
						if(wordpositions.get(wp) < seppositions.get(sp)){if(wordlength == 0){wordlength = seppositions.get(sp) - wordpositions.get(wp) - 1; break;} else{wordlength2 = seppositions.get(sp) - wordpositions.get(wp) - 1;}; break;}
					}
				}
if(dm)			System.out.println("Wordl\u00e4ngth 1-3: " + wordlength + "  " + wordlength2 + "  " + wordlength3);			
				processing.horCalc(zeile, posMap.get(zeile), dm, list);
				
				zeichen = 0;
				wordlength = 0;
				wordlength2 = 0;
				wordlength3 = 0;
				zeichen_folge = 0;
				zeichen_gesamt = 0;
				wordpositions.clear();
				seppositions.clear();
				moreThn2Wrds = false;
				rlyExct2Wrds = false;
			}
			
			
			
		
			
			
		}
}
