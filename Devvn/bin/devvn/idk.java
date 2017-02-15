package devvn;

import java.util.HashMap;
import java.util.List;

public class idk {
	static int x = 0;
	static int xB = 0;
	static int xBB = 0;
		public static void main(HashMap<Integer,List<String>> posMap, List<String> list){
			for(int a = 0; a < posMap.size(); a++){
				System.out.println((a+1)+". Zeile");
				int length = posMap.get(a).size();
				for(int i = 0; i < length; i++){
					if(!posMap.get(a).get(i).equals(""))x++;
					else{System.out.println(x); xBB++; if(x >= 3){break;} else{/*TODO finde richtigen wert um position von buchstaben richtig zu berechnen*/xB = x+xBB; x = 0;}}
					System.out.println("zu kl. Felder + Feldtrenner: " + xB + " Feldtrenner: " + xBB);
				}
				for(int i = 0; i < list.size(); i++){
					if(list.get(i).length() == x){
				  
						for(int y = 0; y < length; y++){
	/*Wenn nicht leer*/		if(!posMap.get(a).get(y).isEmpty() && !posMap.get(a).get(y).equals(""))
	/*Wenn schon bekannt*/		if(Character.isAlphabetic(posMap.get(a).get(y).charAt(0))){
		System.out.println("y: "+y);
									if(list.get(i).charAt(y - xB) == posMap.get(a).get(y).charAt(0)){
										System.out.println(list.get(i));
									}}
						}
					
					}
			
				}
	
				System.out.println("\n\n\n\n\n");
				xBB = 0;
				xB = 0;
				x = 0;
			
			}
			
		}
		
		
}
