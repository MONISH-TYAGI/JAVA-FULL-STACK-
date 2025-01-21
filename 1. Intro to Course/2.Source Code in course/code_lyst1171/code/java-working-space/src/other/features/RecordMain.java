package other.features;

public class RecordMain {
    public static void main(String[] args) {

        var user = new User(12345, "Durgesh", "32qw5625");
        var user1 = new User(12345, "Durgesh", "32qw5625");

        System.out.println(user.userId());
        System.out.println(user.name());
        System.out.println(user.phone());



        System.out.println(user.equals(user1));

        System.out.println(user);

    }
}
