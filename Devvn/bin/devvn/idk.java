package devvn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	static List<Integer> wordpositions = new ArrayList<Integer>();
	static List<Integer> seppositions = new ArrayList<Integer>();
	
		public static void main(HashMap<Integer,List<String>> posMap, List<String> list, boolean dm, int size){
			int length = posMap.get(1).size();
if(dm)		System.out.println(posMap.get(1).size());
			
			for(int zeile = 0; zeile < size; zeile++){
				for(int zeichen = 0; zeichen < length; zeichen++){
					if(posMap.get(zeile).get(zeichen).equals("")){
						leer++;
						zeichen_folge = 0;
						seppositions.add(zeichen);
if(dm)					System.out.println(seppositions + " Seperatoren");
					}
					
if(dm)				System.out.println(zeile + " " + zeichen);
					if(!posMap.get(zeile).get(zeichen).isEmpty()){
						if(Character.isDigit(posMap.get(zeile).get(zeichen).charAt(0)) || Character.isAlphabetic(posMap.get(zeile).get(zeichen).charAt(0))){
							zeichen_gesamt++;
							zeichen_folge++;
							if(zeichen_folge == 3){
								if(nextleer != leer){
									wordpositions.add(zeichen - 3);
if(dm)								System.out.println(wordpositions + " Anfang der Wörter");
									zeichen_folge = 0;
									nextleer = leer;
								}
							}
						}
					}
				}
				// ZEILE 18 und 8 HABEN JE DIE WORTLÄNGEN 0 UND 0!!!! ÜBEREINSTIMMUNG IN SEPARATORENSETZUNG!!! GRUND AUSFINDIG MACHEN!!!
				if(wordpositions.size() > 2) moreThn2Wrds = true;
				if(wordpositions.size() == 2) rlyExct2Wrds = true;
				for(int wp = 0; wp < wordpositions.size(); wp++){ //TODO >>ACHTUNG!<< !!!NOCH KEIN "ES GIBT NUR EIN WORT UND DAS ENDET AM ENDE DER ZEILE" FALL EINGEPLANT!!!
					if(wp == (wordpositions.size() -1) && moreThn2Wrds)wordlength3 = length - wordpositions.get(wp) - 1;  //mehr als 2 Wörter in einer horizontalen Zeile werden nicht unterstützt!!!! :c 
					if(wp == (wordpositions.size() -1) && rlyExct2Wrds)wordlength2 = length - wordpositions.get(wp) - 1;
					for(int sp = 0; sp < seppositions.size(); sp++){
						if(wordpositions.get(wp) < seppositions.get(sp)){if(wordlength == 0){wordlength = seppositions.get(sp) - wordpositions.get(wp) - 1; break;} else{wordlength2 = seppositions.get(sp) - wordpositions.get(wp) - 1;}; break;}
					}
				}
if(dm)			System.out.println(wordlength + "  " + wordlength2 + "  " + wordlength3 + " Wordlängdhs");			
				processing.horCalc(wordlength, wordlength2, wordpositions, zeile);
				
				wordlength = 0;
				wordlength2 = 0;
				wordlength3 = 0;
				zeichen_folge = 0;
				zeichen_gesamt = 0;
				wordpositions.clear();
				seppositions.clear();
				moreThn2Wrds = false;
			}
			
			
			
		
			
			
		}
}
