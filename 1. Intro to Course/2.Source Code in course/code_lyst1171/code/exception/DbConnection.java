
public class DbConnection implements java.io.Closeable {

    public void operate() {
        System.out.println("Operating");
    }

    @Override
    public void close() {
        System.out.println("Closing db connection resource");
        System.out.println("Db Connection Closed");
    }

}
