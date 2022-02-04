package item3;

import java.io.Serializable;

public class Elvis2 implements Serializable {

    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2() {
        if (INSTANCE != null){
            throw new RuntimeException("이미 인스턴스가 존재합니다");
        }
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static Elvis2 getInstance(){
        return INSTANCE;
    }
}
