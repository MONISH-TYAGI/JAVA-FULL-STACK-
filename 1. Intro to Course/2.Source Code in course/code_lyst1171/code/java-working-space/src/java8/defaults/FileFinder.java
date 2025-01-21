package java8.defaults;

public class FileFinder implements  Findable{
    @Override
    public void find() {
        System.out.println("finding file");
    }
}
