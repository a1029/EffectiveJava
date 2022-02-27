package item6;

import org.junit.jupiter.api.Test;

public class StringInstanceTest {

    public static String stringConstructor() {
        return new String("str");
    }

    public static String string() {
        return "str";
    }

    @Test
    void test() {
        String str = stringConstructor();
        for (int i=0; i<5; i++) {
            System.out.println(str == stringConstructor());
        }
    }

    @Test
    void testV2(){
        String str = stringConstructor();
        for (int i=0; i<5; i++) {
            System.out.println(str == string());
        }
    }
}
