package utilities;

import day27_accesModifier.AccessModifiers;
import day27_accesModifier.Data; // import everything from the class this class, means instance and statics

public class Test {

    public static void main(String[] args) {
            //Statics members
        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();


        Data obj = new Data();

        //Instance members

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("=====================================");

        System.out.println(AccessModifiers.publicDate);//public is always accessible in different packages

       // System.out.println(AccessModifiers.protectedDate);//protected is NOT always accessible in different packages

       // System.out.println(AccessModifiers.defaultDate);//Default is NOT BE accessible in different packages

        //  System.out.println(AccessModifiers.privateData);//Private is NOT accessible in different packages

        new AccessModifiers();
        AccessModifiers.publicMethod();
       // AccessModifiers.protectedMethod();
        //AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();



    }
}
