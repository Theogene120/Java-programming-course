class Cars {
    String name;
    int speed;

    void state(){
        System.out.println("Car is being driven");
    }
}

public class ClassExample {
    public static void main(String[] args){
        Cars obj = new Cars();

        obj.name = "Toyota";
        obj.speed = 120;
        System.out.println("name : " + obj.name);
        System.out.println("speed : " + obj.speed);
        obj.state();
    }
}
