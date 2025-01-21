class SortNumberDigit {

    public static void main(String[] args) {

        int n = Helper.inputNumber();

        // convert this number to array
        int countDigit = CountDigits.countDigits(n);

        int arr[] = new int[countDigit];

        // put the values to array
        int index = 0;
        while (n > 0) {
            int r = n % 10;
            arr[arr.length - 1 - index] = r;
            index++;
            n = n / 10;

        }
        // sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        // convert array to number
        int number = 0;
        for (int x : arr) {
            number = (number * 10) + x;
        }
        System.out.println("Resultant Number " + number);

        // // printing array values
        // System.out.println("Printing array");
        // for (int x : arr) {
        // System.out.println(x);
        // }

    }

}
