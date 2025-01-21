interface Samosa {
    // methods
    String alooType = "Meetha";

    // methods
    void createSamosa();

    // java>=8
    // static
    public static void showAlooType() {
        System.out.println(alooType);
    }

    // default
    default void showColor() {
        System.out.println("Samora Color is Redish");
    }

}