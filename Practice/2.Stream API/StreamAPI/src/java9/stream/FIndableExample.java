package java9.stream;

public class FIndableExample {
    public static void main(String[] args) {
        FileFinder fileFinder= new FileFinder();
        fileFinder.find();
        fileFinder.findDefault();
        fileFinder.doSomeImportantTask();
    }
}
