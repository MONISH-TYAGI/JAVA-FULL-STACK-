package generics;

import java.util.List;

public class Helper {

    public static <U, V> void printData(U[] array, V var) {
        for (U el : array) {
            if (el instanceof String)
                System.out.println(el + " : " + ((String) el).length());
            else
                System.out.println(el);

            System.out.println(var);
        }
    }


}
