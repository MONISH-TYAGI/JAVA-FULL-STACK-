package inner.classes;

public class Test {

    Runnable run=new Runnable() {
        @Override
        public void run() {

        }
    };

    int outerA = 300;

    public void outerM1()
    {



        //method local inner class
          class MethodInner {
            int innerVar = 5000;
            public void innerMethod() {
                System.out.println("Inner class variable " + innerVar);
                System.out.println("Outer class variable " + outerA);
            }
        }

        MethodInner methodInner1 = new MethodInner();
        MethodInner methodInner2 = new MethodInner();

        methodInner2.innerMethod();
        methodInner1.innerMethod();

        run.run();


    }

    public static void main(String[] args) {
        Test test = new Test();
        test.outerM1();


    }
}
