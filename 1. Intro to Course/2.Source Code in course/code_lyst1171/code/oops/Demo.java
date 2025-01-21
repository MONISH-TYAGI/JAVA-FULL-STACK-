public class Demo {
    public static void main(String[] args) {

        System.out.println("we are working here");
        // ek samose ki jarurat padh gyi
        // want object of samosa
        Samosa s1 = new Samosa();
        Samosa s2 = new Samosa();

        s1.price = 3;
        s1.model = "Meetha Samosa";
        s1.shape = "triangular";
        s1.color = "Yellow";

        s2.price = 10;
        s2.model = "Mix Samosa";
        s2.shape = "rectangular";
        s2.color = "Reddish";

        s1.showColor();
        s2.showColor();
        int price = s1.getPrice();
        int price1 = s2.getPrice();

        System.out.println("total price " + (price + price1));

    }
}
