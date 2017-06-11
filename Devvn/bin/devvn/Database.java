package devvn;



public class Database {

    private boolean dm;
    private char letters[];
    
    void setDM(boolean b) {
      dm = b;
      if(dm)
          System.out.println("DevMode aktiviert.");
    }
    boolean getDM() {
        return dm;
    }

    
    void setLetters(char[] c) {
       letters = c;
    }
    char[] getLetters() {
       return letters;
    }
    
}
