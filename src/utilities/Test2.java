package utilities;

//import day27_accesModifier.Data;

//import static day27_accesModifier.Data.d; // import only the static variable "d"

//import static day27_accesModifier.Data.method3; // importing the static method3

//STATIC IMPORT
//to import all the statics members only
import static day27_accesModifier.Data.*;


public class Test2 {

    public static void main(String[] args) {

        System.out.println(d);

        method3();

        System.out.println(e);
        System.out.println(f);

        method4();

        /* Instance members can't be call it because we imported only Static members from the Car
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();
         */

    }
}
