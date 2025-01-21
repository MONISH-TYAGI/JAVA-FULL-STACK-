package inner.classes;

public class CallerMain {
    public static void main(String[] args) {


        House house = new House();

        house.printOuterData();

        System.out.println("____________");

        House.Room1 room1 = house.new Room1();
        room1.printRoom1();


    }
}
