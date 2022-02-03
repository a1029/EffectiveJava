package item3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.*;

class Elvis2Test {

    @Test
    @DisplayName("퍼블릭 스태틱 팩토리 메서드")
    void publicStaticFactoryMethod() {

        Elvis2 instance1 = Elvis2.getInstance();
        Elvis2 instance2 = Elvis2.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    @DisplayName("스태틱 팩토리 메서드 공급자로 사용하기")
    void useSupplier() {
        Supplier<Elvis2> elvis2Supplier = Elvis2::getInstance;
        Elvis2 instance1 = elvis2Supplier.get();
        Elvis2 instance2 = elvis2Supplier.get();
        assertThat(instance1).isSameAs(instance2);
    }

}