package item5;

import java.util.List;

public class SpellCheckerSingleton {

    private final Lexicon dictionary = new EnglishDictionary();
    public static SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();

    private SpellCheckerSingleton() {}

    public boolean isValid(String word) {
        return dictionary.isValid(word);
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}
