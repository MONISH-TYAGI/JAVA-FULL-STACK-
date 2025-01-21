public class Student {

    // static variables- single copy
    // all object will share same copy

    // 1
    static String college;
    static String collegeAddress = "Lucknow";
    String studentname;

    // 2
    static {

        System.out.println(college);
        System.out.println(collegeAddress);
        System.out.println("static block 1");
        System.out.println(studentname);
    }

    // 3
    // public static void main(String[] args) {

    // System.out.println("main mehtod");
    // System.out.println(college);
    // System.out.println(collegeAddress);
    // }

    static {
        college = "ChintuCollege";
        collegeAddress = "ChintuChauraha";
        System.out.println("static block 2");
    }

}

// java 5 --> manuall 1,2 execute hota tha
