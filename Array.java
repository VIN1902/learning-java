public class Array{
    public static void main(String a[]){
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int numbers[] = new int[4]; // default values are 0 for length of 4
        numbers[0] = 9;
        numbers[1] = 5;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] *= 10;
            System.out.println(numbers[i]);
        }

        System.out.println("----------------------------------");

        int multiarr[][] = new int[3][4]; // inside we have 3 arrays with each size of 4
        multiarr[1][0] = 9;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                multiarr[i][j] = (int)(Math.floor((Math.random()*10))); //(int) type casting
            }
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(multiarr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("OR");
        for(int arrayValue[] : multiarr){
            for(int intValue : arrayValue){
                System.out.print(intValue + "  ");
            }
            System.out.println();
        }
        // similar to for-of loop in JS, here we have for-: loop in Java
        System.out.println("----------------------------------");
        int jaggedArray[][] = new int[3][]; // jagged
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[5];
        for(int arrayValue[] : jaggedArray){
            for(int intValue : arrayValue){
                System.out.print(intValue + "  ");
            }
            System.out.println();
        }
    }
}