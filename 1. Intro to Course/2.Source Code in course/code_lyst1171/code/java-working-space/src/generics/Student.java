package generics;

public class Student<T> {
    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public static void display(Student<? extends Number> student) {
        System.out.println(student);
    }

    public static void main(String[] args) {

        Student<String> studentInt = new Student<>();

        studentInt.setOb("Hello");




    }
}
