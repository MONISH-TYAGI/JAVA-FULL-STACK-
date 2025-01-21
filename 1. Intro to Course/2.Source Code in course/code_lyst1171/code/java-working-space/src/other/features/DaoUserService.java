package other.features;

public non-sealed class DaoUserService extends  UserService{
    public static void main(String[] args) {
        new DaoUserService().test1();
        new FileUserService().test1();
    }
}
