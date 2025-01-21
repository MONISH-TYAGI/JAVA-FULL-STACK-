package java8.defaults;

import java.util.Arrays;

public class Main {


    public  static void main(String[] args) {

        Findable findable=new FileFinder();
        Findable findable1=new CharFind();
        Findable findable2=new ImageFinder();

        findable.findDefault();
        findable1.findDefault();
        findable2.findDefault();

        findable1.findingFail();
        findable2.findingFail();
        findable.findingFail();

        Findable.printTest();






    }
}
