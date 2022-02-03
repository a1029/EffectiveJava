package item3;

public class Elvis2 {

    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2() {
        if (INSTANCE != null){
            throw new RuntimeException("이미 인스턴스가 존재합니다");
        }
    }

    public static Elvis2 getInstance(){
        return INSTANCE;
    }
}
