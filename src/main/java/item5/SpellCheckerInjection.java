package item5;

import java.util.List;
import java.util.Objects;

public class SpellCheckerInjection {

    private final Lexicon dictionary;

    public SpellCheckerInjection(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return dictionary.isValid(word);
    }

    public List<String> suggestions(String typo) {
        return null;
    }

}
