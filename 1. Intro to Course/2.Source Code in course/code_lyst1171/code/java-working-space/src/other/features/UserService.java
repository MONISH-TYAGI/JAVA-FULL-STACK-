package other.features;


//15,16 preivew
//17 final kar diya gya
public sealed class UserService permits DaoUserService {
    public void test1() {
        System.out.println("User service method");

        Object s = "this is testing";
        if (s instanceof String str) {
            System.out.println(str);
        }
    }
}
