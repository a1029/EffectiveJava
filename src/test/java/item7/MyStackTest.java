package item7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyStackTest {

    @Test
    @DisplayName("메모리 누수 확인")
    void testMemoryLeak() {
        Runtime runtime = Runtime.getRuntime();

        MyStackLeak myStackLeak = new MyStackLeak();
        for(int i=0; i<1000000; i++) {
            myStackLeak.push(new Object());
        }
        System.out.println("pop 이전: " + runtime.totalMemory() + " " + runtime.freeMemory() + " " + myStackLeak);
        for(int i=0; i<500000; i++) {
            myStackLeak.pop();
        }
        System.out.println("pop 후: " + runtime.totalMemory() + " " + runtime.freeMemory() + " " + myStackLeak);
        myStackLeak = null;
        System.out.println("pop 후: " + runtime.totalMemory() + " " + runtime.freeMemory() + " " + myStackLeak);

    }

    @Test
    @DisplayName("메모리 누수 확인")
    void testMemoryNotLeak() {
        Runtime runtime = Runtime.getRuntime();

        MyStack myStack = new MyStack();
        for(int i=0; i<1000000; i++) {
            myStack.push(new Object());
        }
        System.out.println(runtime.totalMemory() + " " + runtime.freeMemory());
        for(int i=0; i<500000; i++) {
            myStack.pop();
        }
        System.out.println(runtime.totalMemory() + " " + runtime.freeMemory());
    }
}
