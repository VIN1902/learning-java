// outer classes can't be static only inner class can

class A {
    public void show(){
        System.out.println("Showing from A");
    }
    class B {
        public void config(){
            System.out.println("in config");
        }
    }
}

public class InnerClass {
    public static void main (String a []){
        A objOfA = new A()
        {
            public void show(){
                System.out.println("Showing from anonymous class A");
            }
        };
        A.B objOfB = objOfA.new B();
        // A.B objOfB = new A.B(); when inner class B is static

        objOfA.show();
        objOfB.config();
    }
}