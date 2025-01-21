package generics;

public class Example<T extends Number> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <M extends Number, N extends Person> N display(M ob, N ob1) {
        System.out.println();
        Ram ram = new Ram();
        return ob1;
    }

    public static void main(String[] args) {

        Example.<Integer, Person>display(23, new Ram());


    }
}
