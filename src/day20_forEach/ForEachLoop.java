package day20_forEach;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10 , 20, 30, 40, 50}; // numbers is the Data Structure
            //Normal For loop
        for(int i = 0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("-----------------------------------------------");
            //For each Loop, in the for each loop, data structure will decide how many times it will run hte loop
        for( int each : numbers){
            System.out.println(each);
        }

        System.out.println("----------------------------------------------------------");


        for (int i = 0; i < 100; i++) {

        }

    }
}
