// if you just wanna declare a method without defining it use abstract keyword
// abstract methods can only belong to abstract class
// can not create object of abstract class
// the inheriting child should implement all the abstract method of parent abstract class
// not compulsory for abstract class to always have abstract method

abstract class Car {
    public abstract void drive(); // only declaring not defining cause I don't know how to drive plus can't just remove it then my car won't be car.

    public void playMusic(){
        System.out.println("Playing Music");
    }
}

class Bmw extends Car {
    public void drive(){
        System.out.println("Driving car");
    }
}

public class Abstract {
    public static void main(String a[]){
        Bmw myCar = new Bmw();
        myCar.drive();
        myCar.playMusic();
    }
}