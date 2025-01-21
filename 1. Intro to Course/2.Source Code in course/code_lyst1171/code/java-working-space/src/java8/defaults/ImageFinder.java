package java8.defaults;

import java.sql.SQLOutput;

public class ImageFinder implements  Findable{
    @Override
    public void find() {
        System.out.println("finding image");
    }

    @Override
    public void findingFail() {
        System.out.println("this is new finding fail method");
    }
}
