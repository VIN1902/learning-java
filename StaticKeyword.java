// 'Static' means that something (variable, method, block) is part of class itself not individual instances/objects. That means it will be same for all instances. It is called by class name not instance name.
// saves memory and the static entitiy is stored in heap inside a common 'method area', unlike non-static ones that are stored in heap too but inside particular instance.
class Car {
    String brand;
    int yearOfLaunch;
    static int numberOfWheels;

    public void printDetails () {
        System.out.println("The car brand is " + brand + ", it was launched in " + yearOfLaunch + ", and it has " + numberOfWheels + " wheels.");
    }

    static {
        System.out.println("Static block loaded first only once, even though object was instanctiated multiple times.");
    }

    public Car() {
        // constructor -> a method that auto runs on object creation. used to set pre-values.
        // constructor is called when object is instantiated.
        // it doesn't take any return value void,int,float,String,etc.
        System.out.println("Constructor gets called each time a new instance is created.");
    }

    // static void pritnStaticDetails () {
    //     System.out.println("The car brand is " + brand + ", it was launched in " + yearOfLaunch + ", and it has " + numberOfWheels + " wheels.");
    // }
        // when you run this it shows error on 'brand' and 'yearOfLaunch' as you are trying to acces non-static variables inside a static method.
}

public class StaticKeyword {
    public static void main (String a[]) {
        Car.numberOfWheels = 4;
        Car car1 = new Car();
        // car1.numberOfWheels = 10; this affects the variable that belongs to whole class and not just that one instance. Don't do this.
        car1.brand = "Tesla";
        car1.yearOfLaunch = 2020;
        car1.printDetails();
        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.yearOfLaunch = 2022;
        car2.printDetails();
    }

    // every time create a new object 2 things happen -> 1st class loads and then objects are instanctiated.
    // class loads only once inside the class loader.
    // static block is called first cause it belongs to class cause of 'static' and class loads first only once.
}