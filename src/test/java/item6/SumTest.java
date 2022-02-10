package item6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    @DisplayName("오토박싱 사용/미사용 시간차이 측정")
    void measureTimeWithAutoBoxing() {

        long start1 = System.currentTimeMillis();
        long sum1 = Sum.sumWithClass();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        long sum2 = Sum.sumWithPrimitive();
        long end2 = System.currentTimeMillis();

        double diff1 = (double)(end1-start1)/1000;
        double diff2 = (double)(end2-start2)/1000;

        System.out.println(diff1 + "초");
        System.out.println(diff2 + "초");
        Assertions.assertThat(diff1).isGreaterThan(diff2);

    }

    @Test
    @DisplayName("keySet 메서드가 반환하는 인스턴스가 싱글톤인지 테스트")
    void test() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        Assertions.assertThat(map.keySet()).isSameAs(map.keySet());

    }

}