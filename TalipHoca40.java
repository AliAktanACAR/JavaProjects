import java.util.ArrayList;

public class TalipHoca40 {
    public static void main(String[] args) {

    }
}

class WordPair{
    private String first;
    private String second;

    public WordPair(String first, String second){
        this.first = first;
        this.second = second;
    }

    public String getFirst(){
        return first;
    }
    public String getSecond(){
        return second;
    }

}

class WordPairList{

    private ArrayList<WordPair> allPairs;

    public WordPairList (String[] words){

        allPairs = new ArrayList<WordPair>();

        for (int i = 0; i<words.length; i++){
            for (int j = i+1 ; j<words.length; j++){
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public int numMatches(){
        int count = 0;

        for (int i = 0; i < allPairs.size(); i++){
            WordPair pair = allPairs.get(i);
            if(pair.getFirst().equals(pair.getSecond())){
                count++;
            }
        }

        return count;
    }
}

