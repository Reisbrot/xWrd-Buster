package devvn;

import java.util.List;

public class DataCollection {
    
    public List<String> getWordlist(){
        List<String> namelist = str_party1.list;
	namelist.addAll(str_party2.list);
	namelist.addAll(str_party3.list);
        
        return namelist;
    }
}
