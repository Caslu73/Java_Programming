package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {


        double n1 = 10.587654;

        DecimalFormat df = new DecimalFormat("0.0");//you can add here all the zeros that you want

        System.out.println(df.format(n1));


    }
}
