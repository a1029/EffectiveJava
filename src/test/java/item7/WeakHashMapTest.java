package item7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

    @Test
    @DisplayName("WeakHashMap 테스트")
    void test() {
        WeakHashMap<String, Object> weakMap = new WeakHashMap<>();
        HashMap<String, Object> map = new HashMap<>();
        String key1 = new String("key1");
        String key2 = new String("key2");
        weakMap.put(key1, "value 1");
        weakMap.put(key2, "value 2");

        String key3 = new String("key3");
        String key4 = new String("key4");
        map.put(key3, "value 3");
        map.put(key4, "value 4");

        key2 = null;
        key4 = null;

        System.gc();
        System.out.println("weakHashMap: ");
        weakMap.entrySet().forEach(System.out::println);
        System.out.println("HashMap: ");
        map.entrySet().forEach(System.out::println);

        Assertions.assertThat(weakMap.entrySet().size()).isEqualTo(1);
        Assertions.assertThat(map.entrySet().size()).isEqualTo(2);
    }
}
