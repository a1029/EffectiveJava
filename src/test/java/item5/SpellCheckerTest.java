package item5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SpellCheckerTest {

    @Test
    @DisplayName("정적 유틸리티로 테스트")
    void testIsEnglishWithUtility() {
        boolean result = SpellCheckerUtil.isValid("ABC");
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("싱글톤으로 테스트")
    void testIsEnglishWithSingleton() {
        SpellCheckerSingleton spellCheckerSingleton = SpellCheckerSingleton.INSTANCE;
        boolean result = spellCheckerSingleton.isValid("ABC");
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("의존성 주입으로 테스트")
    void testIsEnglishWithDI() {
        SpellCheckerInjection spellCheckerInjection = new SpellCheckerInjection(new EnglishDictionary());
        boolean result = spellCheckerInjection.isValid("ABC");
        assertThat(result).isEqualTo(true);

        boolean result2 = spellCheckerInjection.isValid("ABCㄱㄴㄷ");
        assertThat(result2).isEqualTo(false);
    }
}
