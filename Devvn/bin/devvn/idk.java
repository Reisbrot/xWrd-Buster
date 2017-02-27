package devvn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class idk {
	static int leer = 0;
	static int zeichen_gesamt = 0;
	static int zeichen_folge = 0;
	static int letterPos;
	static int anfang = -1;
	static int ende = 0;
	static int zwei = 0;
	static int nextleer = 0;
	static int posInline = 0;
	static int finalPos = 0;
	static int wordlength = 0;
	static int wordlength2 = 0;
	static List<Integer> wordpositions = new ArrayList<Integer>();
	static List<Integer> seppositions = new ArrayList<Integer>();
		public static void main(HashMap<Integer,List<String>> posMap, List<String> list, boolean dm, int size){
			int length = posMap.get(1).size();
			System.out.println(posMap.get(1).size());
			
			for(int zeile = 0; zeile < size; zeile++){
				for(int zeichen = 0; zeichen < length; zeichen++){
					if(posMap.get(zeile).get(zeichen).equals("")){
						leer++;
						zeichen_folge = 0;
						seppositions.add(zeichen);
						System.out.println(seppositions + " Seperatoren");
					}
					
					System.out.println(zeile + " " + zeichen);
					if(!posMap.get(zeile).get(zeichen).isEmpty()){
						if(Character.isDigit(posMap.get(zeile).get(zeichen).charAt(0)) || Character.isAlphabetic(posMap.get(zeile).get(zeichen).charAt(0))){
							zeichen_gesamt++;
							zeichen_folge++;
							if(zeichen_folge == 3){
								if(nextleer != leer){
									wordpositions.add(zeichen - 3);
									System.out.println(wordpositions + " Anfang der Wörter");
									zeichen_folge = 0;
									nextleer = leer;
								}
							}
						}
					}
				}
				for(int wp = 0; wp < wordpositions.size(); wp++){
					for(int sp = 0; sp < seppositions.size(); sp++){
						if(wordpositions.get(wp) < seppositions.get(sp)){if(wordlength == 0)wordlength = seppositions.get(sp) - wordpositions.get(wp); else{wordlength2 = seppositions.get(sp) - wordpositions.get(wp);}; break;}
					}
				}
				System.out.println(wordlength + " Wordlängdh");
				wordlength = 0;
				zeichen_folge = 0;
				zeichen_gesamt = 0;
				wordpositions.clear();
				seppositions.clear();
			}
			
			
			
		
			
			
		}
}
