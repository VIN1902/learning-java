import tools.*;

public class Main {
    public static void main(String a[]){
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.sum(6,2));
        System.out.println(obj.difference(6,2));
        System.out.println(obj.product(6,2));
        System.out.println(obj.quotient(6,2));
        System.out.println(obj.power(6,2));
    }
}