package java9;

public class WritableMain {
    public static void main(String[] args) {

        Writable<String,Integer,Double> writable = new Writable<>() {

            @Override
            public void write(String t1, Integer t2, Double aDouble) {
                System.out.println(t1);
                System.out.println(t2);
                System.out.println(aDouble);
            }
        };

        writable.write("java",12,45.6);

    }
}
