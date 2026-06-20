public class TalipHoca42 {
    public static void main(String[] args) {


        PigLatin a = new PigLatin("the cat is sleepy");
        System.out.println(a.convertWord("ant"));
        System.out.println(a.convertPhrase());

    }
}

class PigLatin{
    private String phrase;

    public PigLatin(String phrase){
        this.phrase = phrase;
    }

    public boolean isVowel(String character) {
        return "aeıioöuü".indexOf(character) != -1;
    }

    public String convertWord(String word){
        if(isVowel(word.substring(0,1)) == true){
            word += "way";
        }

        else if(isVowel(word.substring(1,2)) == true && isVowel(word.substring(0,1)) == false){
            String temp = word.substring(1);
            String temp12 = word.substring(0,1);
            word = temp+temp12;
            word += "ay";
        }

        else if(isVowel(word.substring(0,2)) == false){
            String temp = word.substring(2);
            String temp12 = word.substring(0,2);
            word = temp+temp12;
            word += "ay";
        }

        return word;
    }

    public String convertPhrase(){
        if (phrase == null){
            return null;
        }

        String tempPhrase = "";
        int i = 0;

        while(i < phrase.length()) {
            int index = phrase.indexOf(" ", i);
            if (index == -1) {
                index = phrase.length()-1;
            }

            String firstWord = phrase.substring(i, index);
            tempPhrase += convertWord(firstWord);
            tempPhrase += " ";
            i += index+1;

        }
        return tempPhrase;
    }
}