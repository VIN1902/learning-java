// Usually abstract class can have both abstract method and non-abstract method.
// but for abstract classes that ONLY have abstract methods we prefer to instead use Interface.
// interface is NOT a class, by default the keywords 'public abstract' are there for every methoad. and keywords 'final and static' for every variable.
// extends == implements, when you use this keyword it compulsory to now define those abstract methods in new class.
// in interfaces you CAN have multiple inheritance kind of scenario.

/*
class to class = extends
interface to class = implements
interface to interface = extends
*/

/*
abstract class A {
    public abstract void show();
    public abstract void config();
}
*/

interface A {
    int age = 22;
    String area = "Delhi";

    void show();
    void config();
}

class B implements A {
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
//------------------------------
interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code(){
        System.out.println("code, compile, run slower");
    }
}

class Desktop implements Computer {
    public void code(){
        System.out.println("code, compile, run faster");
    }
}

class Developer {
    // takes reference of computer interface but actual obj of a class
    public void devApp(Computer anyObj) {
        anyObj.code();
    }
}



public class Interfaces {
    public static void main(String a[]) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
        //----------------------------------
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer vikas = new Developer();
        vikas.devApp(lap);
        vikas.devApp(desk);
    }
}