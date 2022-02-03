package item3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Elvis3Test {

    @Test
    @DisplayName("enum을 사용한 싱글턴")
    void singletonUsingEnum() {
        Elvis3 instance1 = Elvis3.INSTANCE;
        Elvis3 instance2 = Elvis3.INSTANCE;

        assertThat(instance1).isSameAs(instance2);
    }
}