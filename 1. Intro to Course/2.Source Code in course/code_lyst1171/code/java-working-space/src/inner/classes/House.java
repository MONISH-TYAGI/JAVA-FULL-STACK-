package inner.classes;

public class House
{

//    Member inner class / Regular inner class
    class Room1 {

        Room1(){
            System.out.println("Creating Room1 object");
        }
        private double r1Var1 = 10;
        private String r1Var2 = "Hi i am room1 variable";


        public void printRoom1() {
            System.out.println("Outer a = " + a);
            System.out.println("Outer private b = " + b);
            System.out.println("R1V1 = " + r1Var1);
            System.out.println("R1V2 = " + r1Var2);
        }
    }


    int a = 50;
    private int b = 200;

    public void printOuterData() {
        System.out.println("a = " + a);
        System.out.println("private b = " + b);
    }

    class Room2 {

    }

    class Room3 {

    }
}
