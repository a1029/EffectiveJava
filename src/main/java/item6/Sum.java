package item6;

public class Sum {

    public static long sumWithClass() {
        Long sum = 0L;
        for(long i=0; i<=Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static long sumWithPrimitive() {
        long sum = 0L;
        for(long i=0; i<=Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
