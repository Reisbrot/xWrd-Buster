package devvn;

import java.util.HashMap;
import java.util.List;

public class idk {
	static int x = 0;
	static int xB = 0;
		public static void main(HashMap<Integer,List<String>> posMap, List<String> list){
			int length = posMap.get(0).size();
			for(int i = 0; i < length; i++){
				if(!posMap.get(0).get(i).equals(""))x++;
				else{System.out.println(x); if(x >= 3){break;} else{xB = x; x = 0;}}
			}
			for(int i = 0; i < list.size(); i++){
			  if(list.get(i).length() == x){
				  
					for(int y = 0; y < length; y++){
						if(!posMap.get(0).get(y).isEmpty() && !posMap.get(0).get(y).equals(""))
							if(Character.isAlphabetic(posMap.get(0).get(y).charAt(0)))
								if(list.get(i).charAt(y - xB/* TODO charAt anders regeln*/) == posMap.get(0).get(y).charAt(0)){
									System.out.println(list.get(i));
								}
					}
					
			  }
			
			}
	
		
		}
		
		
}
