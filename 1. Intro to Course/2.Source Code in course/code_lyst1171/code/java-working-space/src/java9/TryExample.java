package java9;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryExample {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        try (scanner;bufferedReader) {
            //kam kro
            //scanner ko use kar lo
            System.out.println("Enter age : ");
            int age = scanner.nextInt();
            System.out.println("Your age is " + age);

        } catch (Exception ex) {
            System.out.println("Error occurred");
        } finally {

        }


    }
}
