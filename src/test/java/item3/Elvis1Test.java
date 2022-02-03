package item3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Elvis1Test {

    @Test
    @DisplayName("퍼블릭 스태틱 필드")
    void publicStaticField() {
        Elvis1 instance1 = Elvis1.INSTANCE;
        Elvis1 instance2 = Elvis1.INSTANCE;

        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    @DisplayName("리플렉션 API를 사용해 새로운 인스턴스 생성")
    void callPrivateConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Elvis1 instance1 = Elvis1.INSTANCE;
        Constructor<Elvis1> constructor = (Constructor<Elvis1>) instance1.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);

        Elvis1 instance2 = constructor.newInstance();
        assertThat(instance1).isNotSameAs(instance2);
    }

    @Test
    @DisplayName("예외를 던져 싱글톤 보장하기")
    void throwExceptionForSingleton() throws NoSuchMethodException {
        Elvis1Exception instance1 = Elvis1Exception.INSTANCE;
        Constructor<Elvis1Exception> constructor = (Constructor<Elvis1Exception>) instance1.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);

        assertThrows(InvocationTargetException.class, constructor::newInstance);
    }
}