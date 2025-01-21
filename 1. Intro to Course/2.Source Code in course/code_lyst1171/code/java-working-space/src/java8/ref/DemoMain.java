package java8.ref;

import java.util.Arrays;
import java.util.stream.Stream;

public class DemoMain {
    public static void main(String[] args) {

        //static method references
        Findable findable = Calculator::doCalculate;
        findable.find();

        //non-static method references
//        Calculator calculatorOb=new Calculator();
        Findable findable1 = new Calculator()::doCalculateNon;
        findable1.find();

        //constructor references

        Findable findable2=Calculator::new;
        findable2.find();

        




    }
}
