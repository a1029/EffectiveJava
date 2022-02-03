package item3;

public class Elvis1Exception {
    public static final Elvis1Exception INSTANCE = new Elvis1Exception();

    private Elvis1Exception() {
        if (INSTANCE != null){
            throw new RuntimeException("이미 인스턴스가 존재합니다");
        }
    }
}
