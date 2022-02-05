package item4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

class MathOperationTest {

    @Test
    @DisplayName("정적 메서드로 컬렉션 최댓값 찾기")
    void findMaxFromCollection() {
        // MathOperation mathOperation = new MathOperation(); // 에러
        ArrayList<Integer> data = new ArrayList<>();
        data.add(5);
        data.add(20);
        data.add(10);
        assertThat(MathOperation.max(data)).isEqualTo(20);
    }

    @Test
    @DisplayName("클래스 안에서 private 생성자 호출 차단")
    void blockCallPrivateConstructor() {
        Assertions.assertThrows(AssertionError.class, () -> {
            StaticClass staticClass = new StaticClass();
        });
    }

    static class StaticClass {

        private StaticClass() {
            throw new AssertionError();
        }
    }
}