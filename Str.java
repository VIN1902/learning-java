public class Str{
    public static void main(String a[]){
        //by default strings are immutable in java
        // String name = "Vikas Indora";
        String name = new String("Vikas");

        name = name + "Indora"; // new object created and its address stored in name (no longer holds address for "Vikas" object, that get grabage collected)

        String s1 = "Same";
        String s2 = "Same"; // s1 holds same address as s2 no new object created (string constant pool)

        System.out.println(name);
    }
}