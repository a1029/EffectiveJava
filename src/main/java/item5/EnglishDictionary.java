package item5;

public class EnglishDictionary implements Lexicon{
    @Override
    public boolean isValid(String word) {

        for(int i=0; i<word.length(); i++) {
            if (!('A' <= word.charAt(i) && word.charAt(i) <= 'Z' || 'a' <= word.charAt(i) && word.charAt(i) <= 'z')) {
                return false;
            }
        }
        return true;
    }
}
