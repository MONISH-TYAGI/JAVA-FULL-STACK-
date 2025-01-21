public class CallByRef {

    static void changeValue(int arr[], double value) {
        System.out.println("Size of array is " + arr.length);
        System.out.println("Array inside method");
        arr[2] = 1102;
        arr[0] = 0;
        value = 50.0;
        for (int x : arr) {
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.println("value " + value);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        double myValue = 40.3;
        changeValue(numbers, myValue);

        System.out.println("Actaul array  is :");
        for (int x : numbers) {
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.println("my value " + myValue);

    }
}
