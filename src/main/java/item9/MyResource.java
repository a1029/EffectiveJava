package item9;

class FirstException extends RuntimeException { }
class SecondException extends RuntimeException { }

public class MyResource implements AutoCloseable {
    public void use() throws FirstException {
        System.out.println("use resource");
        throw new FirstException();
    }

    @Override
    public void close() throws SecondException {
        System.out.println("close resource");
        throw new SecondException();
    }
}
