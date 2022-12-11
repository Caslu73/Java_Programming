package day23_arrayList;

import java.util.Arrays;

public class quiz {

    public static void main(String[] args) {


       // int arr = {10,20,30};//1 p

        System.out.println("------------------------");

        char [] array = {'D', 'C', 'B', 'A'};
        Arrays.sort(array);

        for (char each : array) {
            System.out.println(each + " "); //A,B,C,D, why I didnt skip D? because is the last one?
            if(each == 'D'){
                continue;
            }


        }


        System.out.println("-----------------------------------------");
        int wd = 0;
        String [] days = {"Sun", "Mon", "Wed", "Sat"};

        for (int i = 0; i < days.length; i++) {
            switch (days[i]){
                case "Sat":
                case"Sun":
                    wd -= 1;
                    break;
                case"Mon":
                    wd += 1;
                case"Wed":
                    wd+= 2;
            }

        }
        System.out.println(wd);//3


        System.out.println("-----------------------------------------------");


        int []num1 = new int[3];
        int [] num2 = {1,2,3,4,5};
        num1 = num2;

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num1[i]);//1,2,3,4,5
        }


        System.out.println("--------------------------------------------------");

        int [] intArr = {15,30,45,60,75};
        intArr[2]=intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));//[15, 30, 75, 60, 90]

        String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;
        int y = planets[1].length();
        System.out.println(x +" "+ y);//4 5


        System.out.println("===============================================");

        int [] arr = {1,2,3,4};
        int i = 0;

        do{
            System.out.println(arr[i] + " ");//1,2,3
            i++;
        }while(i < arr.length-1);
    }
}
