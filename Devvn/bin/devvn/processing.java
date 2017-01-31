package devvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class processing {

static void verarbeitung(List<String> field, ArrayList<String> known, int sobig, int l, List<String> list) {
		
		
		
		
		for(int i=0; i < field.size()/l; i++){  //Die Schleife wird so oft durchlaufen wie´s Zeilen gibt
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*List<String> field_part_1 = field.subList(0, l-1);
			List<String> field_part_2 = field.subList(l, l+l-1);
			List<String> field_part_3 = field.subList(l+l, i*l-1);
			List<String> field_part_4 = field.subList(l+l+l, i*l-1);
			List<String> field_part_5 = field.subList(l+l+l+l, i*l-1);
			List<String> field_part_6 = field.subList(l+l+l+l+l, i*l-1);
			List<String> field_part_7 = field.subList(l+l+l+l+l+l, i*l-1);*/

			
			
			
			
			for(int x=0; x < l; x++){           //Für jedes Zeichen
				
			}
			
		}
	}








public static List<String> readFile(String fileName) {
    try {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
	return null;
  }

}








