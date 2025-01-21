public class StringBufferMethods2 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Durgesh");

        stringBuffer.repeat(" tiwari", 5);

        System.out.println(stringBuffer);

        StringBuffer stringBuffer2 = new StringBuffer("java is good programing");

        System.out.println(stringBuffer2);

        stringBuffer2.delete(0, 4);
        System.out.println(stringBuffer2);

    }
}
