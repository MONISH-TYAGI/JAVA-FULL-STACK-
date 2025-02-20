package config.xml.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student()
    {
        System.out.println("student creatred");
    }
    public void sayHello(){
        System.out.println("hello how are you");
    }
}
