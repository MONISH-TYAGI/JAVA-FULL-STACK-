import java.io.*;

class ThorwsExample {

    public static void m1() throws IOException {

        // input lene ka code

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you name: ");
        String name = br.readLine();
        System.out.println("hello " + name);

    }

    public static void m2() throws IOException {
        m1();
    }

    public static void m3() throws IOException {

        m2();

    }

    public static void m4() throws IOException {
        m3();
    }

    public static void main(String[] args) throws IOException {
        m4();
    }

}