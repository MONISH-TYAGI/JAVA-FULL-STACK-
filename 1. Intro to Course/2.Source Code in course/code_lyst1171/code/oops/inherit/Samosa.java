public class Samosa {

    int age = 3;

    // get karata hai
    public int getAge() {
        return age;
    }

    // setter: value set karata hai
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid  age");
            return;
        } else {
            this.age = age;
        }
    }

    public void showAgeOfSamosa() {
        if (age <= 0) {
            System.out.println("Age is not defined");
        } else {
            System.out.println("Age : " + age);
        }

    }

}
