package proxy;

public class CarProxy implements CarPlan
{

    Driver driver=null;
    Car car;

    public Driver getDriver() {
        return driver;
    }

    CarProxy(){
        this.car = new Car();
    }

    public void driveCar()
    {
        if(this.driver == null){
            System.out.println("Error : adapter.Car needs a driver");
        }
        else if(this.driver.age<18){
            System.out.println("Error : Drivers age must be graeter than 18");
        }
        else if(this.driver.hasViolations){
            System.out.println("Error : Driver has outstanding traffic violation");
        }
        else{
            this.car.driveCar();
        }
    }

    public void setDriver(Driver d)
    {
        this.driver = d;
    }
}