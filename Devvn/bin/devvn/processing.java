package devvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class processing {
	
static boolean fp1,fp2,fp3,fp4,fp5,fp6,fp7,fp8,fp9,fp10,fp11,fp12,fp13,fp14,fp15,fp16,fp17,fp18,fp19,fp20,fp21,fp22;
static List<String> field_part1, field_part2, field_part3, field_part4, field_part5, field_part6, field_part7, field_part8, field_part9, field_part10, field_part11, field_part12, field_part13, field_part14, field_part15, field_part16, field_part17, field_part18, field_part19, field_part20, field_part21, field_part22;
static List<String> vertical_part1, vertical_part2, vertical_part3, vertical_part4, vertical_part5, vertical_part6, vertical_part7, vertical_part8, vertical_part9, vertical_part10, vertical_part11, vertical_part12, vertical_part13, vertical_part14, vertical_part15, vertical_part16, vertical_part17, vertical_part18, vertical_part19, vertical_part20, vertical_part21, vertical_part22;
static Integer keyV = 0;
static Integer keyH = 0;
static HashMap<Integer,List<String>> hrzMap = new HashMap<Integer, List<String>>();
static HashMap<Integer,List<String>> verMap = new HashMap<Integer, List<String>>();
static HashMap<Integer,String> startMap = new HashMap<Integer, String>();
static String bufferLetter = "";
static List<String> bufferPart = new ArrayList<String>();
static int rows;
static String number_docking = "";
static String letter_docking = "";
static int number;
static int[] numbers;
static char[] cleaned_letters;
static List<String> difault = new ArrayList<String>();
static boolean mi1;
static int relativeToWordBeginning;
static int maxPos;
static List<Character> wordBuilder1 = new ArrayList<Character>();
static List<Character> wordBuilder2 = new ArrayList<Character>();
static List<Character> wordBuilder3 = new ArrayList<Character>();
static boolean neu1 = true;
static boolean neu2 = true;
static boolean neu3 = true;
static boolean ThatsTheWord;
static int possibleWords;
static int c2d;
static int PASSc2d;
static char[] letters;
static boolean init;

static void verarbeitung(Database g, List<String> list) {
List<String> field = GUI.xWrd;
ArrayList<String> known = GUI.inputs;
int length = GUI.length;
boolean dm = g.getDM();
letters = g.getLetters();

if(!init) {
 Arrays.fill(letters, 0, letters.length, ' ');
 numbers = new int[known.size()];
 cleaned_letters = new char[known.size()];
 addKnownChars(known, dm, list);
 field_init(field, length);
} 
   
replacing_replacing(dm);
verticalice(dm);
init = true;
  
idk.main(list, dm, 19, 0, 0); //TODO 19
}



static List<String> replacing(List<String> field_part, boolean fp){
  
  
List<String> returned = new ArrayList<String>();
if (fp){
 for(int i = 0; i < field_part.size(); i++){
  for(int x = 0; x < letters.length; x++){
   if(field_part.get(i).equals(""+(x+1))){
    if(letters[x]==' ')
    bufferLetter+=(field_part.get(i));
    else{bufferLetter+=(Character.toString(letters[x]));} 
   }
  }
  bufferPart.add(bufferLetter);
  bufferLetter = "";
  
 }
 returned.addAll(bufferPart);
 bufferPart.clear();
 return returned;
 
 /*hrzMap.put(keyH, bufferList);
  if(dm)	System.out.println(hrzMap.get(keyH));
 bufferList.clear(); */
}
return difault;

}

static List<String> toVertical(int waldquell){
 List<String> vertical = new ArrayList<String>();
 if(!fp1 || !fp2 || !fp3 || !fp4 || !fp5 || !fp6 || !fp7 || !fp8 || !fp9)
  System.out.println("Iwas is da kaputt");
 if(!fp10){ for(int i = 0; i < 9; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp11){ for(int i = 0; i < 10; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp12){ for(int i = 0; i < 11; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp13){ for(int i = 0; i < 12; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp14){ for(int i = 0; i < 13; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp15){ for(int i = 0; i < 14; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp16){ for(int i = 0; i < 15; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp17){ for(int i = 0; i < 16; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp18){ for(int i = 0; i < 17; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp19){ for(int i = 0; i < 18; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp20){ for(int i = 0; i < 19; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp21){ for(int i = 0; i < 20; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 if(!fp22){ for(int i = 0; i < 21; i++){vertical.add(hrzMap.get(i).get(waldquell));}return vertical;}
 return vertical;
}

static void verticalice(boolean dm){
 for(int i = 0; i < field_part1.size() ; i++){
  if(i == 1) {vertical_part1 = toVertical(0); verMap.put(keyV, vertical_part1); keyV++;}
  if(i == 1) {vertical_part2 = toVertical(1); verMap.put(keyV, vertical_part2); keyV++;}
  if(i == 2) {vertical_part3 = toVertical(2); verMap.put(keyV, vertical_part3); keyV++;}
  if(i == 3) {vertical_part4 = toVertical(3); verMap.put(keyV, vertical_part4); keyV++;}
  if(i == 4) {vertical_part5 = toVertical(4); verMap.put(keyV, vertical_part5); keyV++;}
  if(i == 5) {vertical_part6 = toVertical(5); verMap.put(keyV, vertical_part6); keyV++;}
  if(i == 6) {vertical_part7 = toVertical(6); verMap.put(keyV, vertical_part7); keyV++;}
  if(i == 7) {vertical_part8 = toVertical(7); verMap.put(keyV, vertical_part8); keyV++;}
  if(i == 8) {vertical_part9 = toVertical(8); verMap.put(keyV, vertical_part9); keyV++;}
  if(i == 9) {vertical_part10 = toVertical(9); verMap.put(keyV, vertical_part10); keyV++;}
  if(i == 10) {vertical_part11 = toVertical(10); verMap.put(keyV, vertical_part11); keyV++;}
  if(i == 11) {vertical_part12 = toVertical(11); verMap.put(keyV, vertical_part12); keyV++;}
  if(i == 12) {vertical_part13 = toVertical(12); verMap.put(keyV, vertical_part13); keyV++;}
  if(i == 13) {vertical_part14 = toVertical(13); verMap.put(keyV, vertical_part14); keyV++;}
  if(i == 14) {vertical_part15 = toVertical(14); verMap.put(keyV, vertical_part15); keyV++;}
  if(i == 15) {vertical_part16 = toVertical(15); verMap.put(keyV, vertical_part16); keyV++;}
  if(i == 16) {vertical_part17 = toVertical(16); verMap.put(keyV, vertical_part17); keyV++;}
  if(i == 17) {vertical_part18 = toVertical(17); verMap.put(keyV, vertical_part18); keyV++;}
  if(i == 18) {vertical_part19 = toVertical(18); verMap.put(keyV, vertical_part19); keyV++;}
  if(i == 19) {vertical_part20 = toVertical(19); verMap.put(keyV, vertical_part20); keyV++;}
  if(i == 20) {vertical_part21 = toVertical(20); verMap.put(keyV, vertical_part21); keyV++;}
  if(i == 21) {vertical_part22 = toVertical(21); verMap.put(keyV, vertical_part22); keyV++;}
 }
System.out.println("verMap: " + verMap);

}

static void horCalc(int zeile, List<String> field_part, boolean dm, List<String> list){
 HashMap<Integer, String> Buffer = new HashMap<Integer, String>();
 int wl1 = idk.wordlength;
 int wl2 = idk.wordlength2;
 int wl3 = idk.wordlength3;
 List<Integer>wordpositions = idk.wordpositions;

 int wl = 0;
 if(wl1==0&&wl2==0&&wl3==0)return;

 for(int i = 0; i < field_part.size(); i++){
  if(field_part.get(i) != "")
   if(Character.isAlphabetic
      (field_part.get(i).charAt(0))
     )
      Buffer.put(i, field_part.get(i));
 }
 
 if(dm) System.out.println("Buffer: " + Buffer);

 for(int buffer = 0; buffer < field_part.size(); buffer++){
     
  if(Buffer.containsKey(buffer)){ 
   for(int i = 0; i < wordpositions.size(); i++){
    wl++;
    if(wl == 1)maxPos = wordpositions.get(i) + wl1;
    if(wl == 2)maxPos = wordpositions.get(i) + wl2;
    if(wl == 3)maxPos = wordpositions.get(i) + wl3;
    if(wordpositions.get(i) <  buffer && buffer <= maxPos){
     if(wordpositions.get(i) == -1) {
      mi1 = true;
      relativeToWordBeginning = buffer + 1;
      } 
      else{
      relativeToWordBeginning = Math.abs(wordpositions.get(i) - buffer);
     }
     
     if(dm) System.out.println(relativeToWordBeginning + " in Wort " + (i+1) + " ist ein -> " + field_part.get(buffer));
     switch(wl){
      case 1:
       for(int wb = 0; wb < wordBuilder1.size(); wb++){
       if (!wordBuilder1.get(wb).equals('#')) neu1 = false;
       }
       if(neu1) for(int a = 0; a < wl1; a++)wordBuilder1.add('#');
       wordBuilder1.set(relativeToWordBeginning - 1, field_part.get(buffer).charAt(0));
       break;
    		 
      case 2:
       for(int wb = 0; wb < wordBuilder2.size(); wb++){
       if (!wordBuilder2.get(wb).equals('#')) neu2 = false;
       }
       if(neu2) for(int a = 0; a < wl1; a++)wordBuilder2.add('#');
       wordBuilder2.set(relativeToWordBeginning - 1, field_part.get(buffer).charAt(0));
       break;
     
      case 3:
       for(int wb = 0; wb < wordBuilder3.size(); wb++){
       if (!wordBuilder3.get(wb).equals('#')) neu3 = false;
       }
       if(neu3) for(int a = 0; a < wl1; a++)wordBuilder3.add('#');
       wordBuilder3.set(relativeToWordBeginning - 1, field_part.get(buffer).charAt(0));
      break;
      
      default: System.out.println("(wl) Default: " + wl);
     }
    }
    System.out.println("wordBuilder 1-3: " + wordBuilder1 + " " + wordBuilder2 + " " + wordBuilder3);
   
   }
   wl = 0; neu1 = neu2 = neu3 = true;
  }
 }
 compareToDict(list, wl1, wordpositions.get(0), field_part, dm, zeile);
 
 possibleWords = 0;
 wordBuilder1.clear(); wordBuilder2.clear(); wordBuilder3.clear();
}

static void verCalc(){
	
}

static void compareToDict(List<String> list, int PASSwl, int PASSwp, List<String> PASSfield_part, boolean dm, int PASSzeile){
 List<Character> word = wordBuilder1;

 for(c2d = 0; c2d < list.size(); c2d++){
  ThatsTheWord = true;
   if(!(list.get(c2d).length() == word.size())) ThatsTheWord = false;
    if(ThatsTheWord)
     for(int c = 0; c < word.size(); c++){
      if(word.get(c).equals('#'));
       else{if(!(word.get(c) == (list.get(c2d).charAt(c)))) ThatsTheWord = false;}
     }
  if(ThatsTheWord) {System.out.println("Das Wort kann ein " + list.get(c2d) + " sein."); possibleWords++;}
 }
 if(possibleWords == 0)System.err.println("Es scheint kein Wort zu passen. Abtippfehler oder ein 'Word of Doom'.");
 if(possibleWords == 1)prepareNewChars(list.get(PASSc2d), PASSwl, PASSwp, PASSfield_part, dm, list); //TODO Man nehme Zeile von field_part oder original r�tsel und schaue nach den zahlen und gleiche dies ab mit wordlength und wordpositions f�r die buchstaben und erg�nze sie
}

static void addKnownChars(List<String> known, boolean dm, List<String>list){
 if(dm)	System.out.println("Anfang von addKnownChars");
  for(int i = 0; i < known.size(); i++){
   int x=0;
    while(true){
     Character character = known.get(i).charAt(x);
     if (Character.isDigit(character))
      number_docking += character;
     if (x < known.get(i).length()-1)
      x++;
      else{
       number = Integer.parseInt(number_docking);
       numbers[i] = number;
       number_docking="";
       break;
      }
    }
  Character character = known.get(i).charAt(0);
  letter_docking += character;
  }
 cleaned_letters = letter_docking.toCharArray();
 for(int i = 0; i < known.size(); i++){
  letters[numbers[i]-1] = cleaned_letters[i];
 }
 
 if(dm)System.out.println("Numbers: " + Arrays.toString(numbers) + "   Cleaned Letters: " + Arrays.toString(cleaned_letters) + "   Letters: " + Arrays.toString(letters));
 if(init){ 	
  replacing_replacing(dm);
  verticalice(dm);
  idk.main(list, dm, 19, 0, 0); //TODO ersetz 19 durch anzahl von Zeilen - oben auch
 }
 if(dm)	System.out.println("Ende von addKnownChars");
}


static void prepareNewChars(String BasicWord, int wl, int wp, List<String> field_part, boolean dm, List<String> list){
 if(dm)	System.out.println(new StringBuffer().append("Wort: ").append(BasicWord).append(" - WL: ").append(wl).append(" - WP: ").append(wp).append(" - field_part: ").append(field_part));
 BasicWord = BasicWord.toLowerCase();
 List<String> chars = new ArrayList<String>();
 //TODO FIELD PART IST FALSCH WENNS NEU DURCHL�UFT SPASSTIII MOST IMPORTANT
 
 for(int i = 0; i < BasicWord.length(); i++)
  chars.add(BasicWord.charAt(i) + field_part.get(wp + i + 1));
 
 if(dm)	System.out.println(chars + " " + "START");
 for(int i = 0; i < chars.size(); i++){
  if(dm) System.out.println(chars + " "+ i);//remove
   if(chars.get(i).length() >= 2)
    if(!Character.isDigit(chars.get(i).charAt(1)))
     {chars.remove(i); 
      i--;}
 }
 if(dm)	System.out.println(chars + " " + "STOP");
 if(chars.isEmpty()) System.out.println("H\u00d6 ICH DENKE MAL DU HAST SCHON VIELE BUCHSTABEN NH");
  else{	
   numbers = new int[chars.size()];
   cleaned_letters = new char[chars.size()]; 
   letter_docking = "";
   addKnownChars(chars, dm, list);
  }
}



static void field_init(List<String>field, int l){
 for(int i=0; i < field.size()/l; i++){
  if (i == 1){field_part1 = field.subList(0, l); fp1 = true;}
  if (i == 1){field_part2 = field.subList(l, 2*l); fp2 = true;}
  if (i == 2){field_part3 = field.subList(2*l, 3*l); fp3 = true;}
  if (i == 3){field_part4 = field.subList(3*l, 4*l); fp4 = true;}
  if (i == 4){field_part5 = field.subList(4*l, 5*l); fp5 = true;}
  if (i == 5){field_part6 = field.subList(5*l, 6*l); fp6 = true;}
  if (i == 6){field_part7 = field.subList(6*l, 7*l); fp7 = true;}
  if (i == 7){field_part8 = field.subList(7*l, 8*l); fp8 = true;}
  if (i == 8){field_part9 = field.subList(8*l, 9*l); fp9 = true;}
  if (i == 9){field_part10 = field.subList(9*l, 10*l); fp10 = true;}
  if (i == 10){field_part11 = field.subList(10*l, 11*l); fp11 = true;}
  if (i == 11){field_part12 = field.subList(11*l, 12*l); fp12 = true;}
  if (i == 12){field_part13 = field.subList(12*l, 13*l); fp13 = true;}
  if (i == 13){field_part14 = field.subList(13*l, 14*l); fp14 = true;}
  if (i == 14){field_part15 = field.subList(14*l, 15*l); fp15 = true;}
  if (i == 15){field_part16 = field.subList(15*l, 16*l); fp16 = true;}
  if (i == 16){field_part17 = field.subList(16*l, 17*l); fp17 = true;}
  if (i == 17){field_part18 = field.subList(17*l, 18*l); fp18 = true;}
  if (i == 18){field_part19 = field.subList(18*l, 19*l); fp19 = true;}
  if (i == 19){field_part20 = field.subList(19*l, 20*l); fp20 = true;}
  if (i == 20){field_part21 = field.subList(20*l, 21*l); fp21 = true;}
  if (i == 21){field_part22 = field.subList(21*l, 22*l); fp22 = true;}
  if (i >= 22)System.err.println("Index out of range - R\u00e4tsel zu lang, maximal 22 Zeilen!");		
 }	
}

static void replacing_replacing(boolean dm){
    
 field_part1 = replacing(field_part1, fp1);
 hrzMap.put(keyH, field_part1);
 keyH++;
 
 field_part2 = replacing(field_part2, fp2);
 hrzMap.put(keyH, field_part2);
 keyH++;
 
 field_part3 = replacing(field_part3, fp3);
 hrzMap.put(keyH, field_part3);
 keyH++;
 
 field_part4 = replacing(field_part4, fp4);
 hrzMap.put(keyH, field_part4);
 keyH++;
 
 field_part5 = replacing(field_part5, fp5);
 hrzMap.put(keyH, field_part5);
 keyH++;   

 field_part6 = replacing(field_part6, fp6);
 hrzMap.put(keyH, field_part6);
 keyH++; 

 field_part7 = replacing(field_part7, fp7);
 hrzMap.put(keyH, field_part7);
 keyH++;

 field_part8 = replacing(field_part8, fp8);
 hrzMap.put(keyH, field_part8);
 keyH++;

 field_part9 = replacing(field_part9, fp9);
 hrzMap.put(keyH, field_part9);
 keyH++;

 field_part10 = replacing(field_part10, fp10);
 hrzMap.put(keyH, field_part10);
 keyH++;
		
 field_part11 = replacing(field_part11, fp11);
 hrzMap.put(keyH, field_part11);
 keyH++;
		
 field_part12 = replacing(field_part12, fp12);
 hrzMap.put(keyH, field_part12);
 keyH++;
 
 field_part13 = replacing(field_part13, fp13);
 hrzMap.put(keyH, field_part13);
 keyH++;

 field_part14 = replacing(field_part14, fp14);
 hrzMap.put(keyH, field_part14);
 keyH++;	
	
 field_part15 = replacing(field_part15, fp15);
 hrzMap.put(keyH, field_part15);
 keyH++;

 field_part16 = replacing(field_part16, fp16);
 hrzMap.put(keyH, field_part16);
 keyH++;

 field_part17 = replacing( field_part17, fp17);
 hrzMap.put(keyH, field_part17);
 keyH++;

 field_part18 = replacing(field_part18, fp18);
 hrzMap.put(keyH, field_part18);
 keyH++;

 field_part19 = replacing(field_part19, fp19);
 hrzMap.put(keyH, field_part19);
 keyH++;

 field_part20 = replacing(field_part20, fp20);
 hrzMap.put(keyH, field_part20);
 keyH++;

 field_part21 = replacing(field_part21, fp21);
 hrzMap.put(keyH, field_part21);
 keyH++;

 field_part22 = replacing(field_part22, fp22);
 hrzMap.put(keyH, field_part22);
 keyH++;

 System.out.println("hrzMap: " + hrzMap);
 keyH = 0;
}


public List<String> readFile(String fileName) {
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