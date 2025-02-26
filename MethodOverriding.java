// method with same name in child overrides the one in parent by default
class A {
    public void print(){
        System.out.println("in A");
    }
}

class B extends A {
    public void print(){
        System.out.println("in B");
    }
}

public class MethodOverriding {
    public static void main (String a[]){
        B obj = new B();
        obj.print();
    }
}