class Car {
    String name;
    int speed;

    void drive() {
        System.out.println(name + " is driving at " + speed);
    }
}

public class StaticClass{
    public static void main(String[] args){
        Car c = new Car();
        c.name = "BMW";
        c.speed = 220;
        c.drive();
    }
}
