package proxy;

import org.springframework.validation.annotation.Validated;

public class Driver
{
    public int age;
    public String name;
    public boolean hasViolations;

    Driver(int age, String name, boolean hasViolations){
        this.age = age;
        this.name = name;
        this.hasViolations = hasViolations;
    }

    public boolean validate()
    {
        boolean isValid;
        if(this == null){
            System.out.println("Error : adapter.Car needs a driver");
            isValid = false;
        }
        else if(this.age<18){
            System.out.println("Error : Drivers age must be graeter than 18");
            isValid = false;
        }
        else if(this.hasViolations){
            System.out.println("Error : Driver has outstanding traffic violation");
            isValid = false;
        }
        else{
            isValid = true;
        }

        return isValid;
    }
}