package item5;

import java.util.List;

public class SpellCheckerUtil {

    private static final Lexicon dictionary = new EnglishDictionary();

    private SpellCheckerUtil() {}

    public static boolean isValid(String word) {
        return dictionary.isValid(word);
    }

    public static List<String> suggestions(String typo) {
        return null;
    }
}
