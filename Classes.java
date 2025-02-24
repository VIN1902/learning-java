class Calculator{
    public int add(int x, int y){
        return x + y;
    }
}

public class Classes {
    public static void main(String a[]){
        Calculator calc = new Calculator();
        int result = calc.add(9,77);
        System.out.print(result);
    }
}