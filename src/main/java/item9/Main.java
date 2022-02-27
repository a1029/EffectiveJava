package item9;

public class Main {

    public static void main(String[] args) {
        //tryFinally();
        tryResource();
    }

    public static void tryFinally() {
        MyResource myResource = new MyResource();
        try {
            myResource.use();
        } finally {
            myResource.close();
        }
    }

    public static void tryResource() {
        try (MyResource myResource = new MyResource()) {
            myResource.use();
        }
    }
}
