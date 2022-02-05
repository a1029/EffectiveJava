package item4;

import java.util.Collection;

public class MathOperation {

    private MathOperation(){
        throw new AssertionError();
    }

    public static int max(Collection<? extends Integer> collection){

        int maxValue = Integer.MIN_VALUE;
        for(Integer e: collection) {
            if (maxValue < e) {
                maxValue = e;
            }
        }
        return maxValue;
    }
}
