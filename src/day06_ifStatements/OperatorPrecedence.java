package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3);
                  //        5 + 6 // 6 because multiply first 2 * 3 cause the order of precedence
                  // and then will do the addition 5+6=11

        System.out.println( 7 + 3 - 2 / 2);
                   //       7 + 3  -  1 ===>9 // 1 because division is first by the order of precedence
                  // and then will do the addition and subtraction 7+3-1=9

        System.out.println(-5 + 3);
                        //   -2


        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Phyton" || 'a' == 'A');
        //                   true  == false && "Java" == "Phyton" || 'a' == 'A'
        //                         false    &&    false  || false
        //                                false || false
        //                                       false

        System.out.println(100 >= 20 && 40 * 2 > 60);
         //                100 >= 20 &&  80 > 60
        //                   true && true
        //                        true

        System.out.println("--------------------------------------------------------");
        // Short Hand operator

        int a = 20;

        a += 10 + 2 * 3;
        // a += 10 + 6
        // a += 16
        // a =  36

        System.out.println(a);

    }

}
