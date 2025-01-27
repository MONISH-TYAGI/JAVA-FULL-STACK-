package java9.stream;

public interface Findable {
    void find();
    private void loginlogic(){
        System.out.println("login of 11 line");
    }
    default void findDefault(){
        System.out.println("starting of default functionality ");
     loginlogic();
        System.out.println("ending of default functionality");
    }
    default void doSomeImportantTask(){
        loginlogic();
    }
}
