// final + variable = constant
// final + class = no inheritance
// final + method = no method overriding(no polymorphism)

class MyProduct {
    final public void show(){
        System.out.println("By Vikas");
    }
}

class AyushProduct extends MyProduct {
    final public void show(){
        System.out.println("By Aayush");
    }
}

public class Final {
    public static void main(String a[]){
        final double PI = 3.14;
        // PI = 3; final variable means constant
        AyushProduct billionDollarProduct = new AyushProduct();
        billionDollarProduct.show();
    }
}