package devvn;

import java.util.HashMap;
import java.util.List;

public class idk {
	static int leer = 0;
	static int zeichen = 0;
	static int zeichen_folge = 0;
	static int letterPos;
	static int anfang = -1;
	static int ende = 0;
	static int zwei = 0;
	static int zwende = 0;
	static int posInline = 0;
	static int finalPos = 0;
		public static void main(HashMap<Integer,List<String>> posMap, List<String> list){
			for(int a = 0; a < posMap.size(); a++){
					System.out.println((a+1)+". Zeile");
					int length = posMap.get(a).size();
					
					for(int i = 0; i < length; i++){
						
						
						if(posMap.get(a).get(i).equals("")){
								if(anfang != -1){
									ende = length - i;
								}
							leer++;
							zeichen_folge = 0;
						}else
							
							
							{
								if(!Character.isDigit(posMap.get(a).get(i).charAt(0)))  //ka ob isAlphabetic oder isLetter oder was weiss ich richtig is also einfach so
									{posInline = i; break;}
									 
								if(zeichen_folge >= 3){
									if(anfang == -1)
										anfang = leer + zeichen - 3;
										else{ zwei = leer + zeichen - 3;
										}
									
									zeichen_folge = 0;
								}

								zeichen++;
								zeichen_folge++;
							}
						
						

					}
				    if(zwei == 0)finalPos = posInline - anfang; else{finalPos = posInline - zwei;}
					
					
				for(int i = 0; i < list.size(); i++){
					if(list.get(i).length() == (finalPos)){
						for(int x = 0; x < length; x++){
							if(list.get(i).charAt(i) == posMap.get(a).get(x).charAt(0))
							System.out.println(list.get(i));
						}
					}
			
				}
	
				System.out.println("\n\n\n\n\n");
				leer = 0;
				finalPos = 0;
				posInline = 0;
			
			}
			
		}
		
		
}
