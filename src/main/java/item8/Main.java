package item8;

public class Main {

    public static void useTryResource() throws Exception {
        try (Room myRoom = new Room(7)) {
            System.out.println("안녕하세요");
        }
    }

    public static void notUseTryResource() {
        new Room(99);
        System.out.println("아무렴");
    }

    public static void main(String[] args) throws Exception {
        useTryResource();
        notUseTryResource();
    }
}
