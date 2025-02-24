class Calculator{
    public int add(int x, int y){
        return x + y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public float add(float x, float y){
        return x+y;
    }
}

public class MethodOverloading{
    public static void main(String a[]){
        Calculator calc = new Calculator();
        int result1 = calc.add(1,2);
        int result2 = calc.add(3,4,5);
        float result3 = calc.add(1,2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}