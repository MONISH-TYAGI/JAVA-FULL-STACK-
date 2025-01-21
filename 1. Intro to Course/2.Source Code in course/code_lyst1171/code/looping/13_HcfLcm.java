class HcfLcm {

    static int findLcm(int x, int y) {
        int lcm = (x * y) / findHcf(x, y);
        return lcm;
    }

    static int findHcf(int x, int y) {
        int small, large;
        if (x < y) {
            small = x;
            large = y;
        } else {
            small = y;
            large = x;
        }

        while (small != 0) {
            int temp = small;
            small = large % small;
            large = temp;
        }

        return large;

    }

    public static void main(String[] args) {

        int x = Helper.inputNumber();
        int y = Helper.inputNumber();
        int hcf = findHcf(x, y);
        System.out.println("HCF = " + hcf);
        int lcm = findLcm(x, y);
        System.out.println("LCM = " + lcm);

    }

}
