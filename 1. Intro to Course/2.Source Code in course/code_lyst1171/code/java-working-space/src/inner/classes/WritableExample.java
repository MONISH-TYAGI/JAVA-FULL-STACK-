package inner.classes;

public class WritableExample {
    public static void main(String[] args) {

        Writable writable = new Writable() {
            public void write() {

                System.out.println("writing method");
            }
        };

        Writable writable1 = new Writable() {
            @Override
            public void write() {
                System.out.println("another one writing");
            }
        };

        writable.write();
        writable1.write();

        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("running");
            }
        };

        runnable.run();

        Runnable runnable1=new Runnable() {
            @Override
            public void run() {

            }
        };


    }
}
