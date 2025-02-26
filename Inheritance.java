// In java only single inheritance (single parent-child) and multilevel inheritance (c extends b which extends a) are possible.
// In java multiple inheritance (c extends b and a) is NOT possible. This is due to ambiguity problem (what if both parent classes have a method that child is trying to acess so then which one to chose?)

class BaseCalculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public int difference(int a, int b) {
        return a - b;
    }
}

class AdvCalculator extends BaseCalculator {
    public double power(int a, int b){
        return Math.pow(a,b);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        AdvCalculator mycalc = new AdvCalculator();

        System.out.println(mycalc.sum(4,5));
        System.out.println(mycalc.difference(4,5));
        System.out.println(mycalc.power(4,5));
    }
}