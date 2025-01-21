class Start {
    public static void main(String[] args) {

        System.out.println("Printing something");
        // ek object create karne ki jarurat pad gyi
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.model = "3 Rupya wala 1";
        p2.model = "5 Rupya  wala 1";

        p1.color = "black";
        p2.color = "blue";

        System.out.println(p1.model);
        System.out.println(p2.model);

        p1.write();

        p2.write();

    }
}