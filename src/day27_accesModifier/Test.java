package day27_accesModifier;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a );
        System.out.println(StaticInitializationBlock.b );
        System.out.println(StaticInitializationBlock.c );

        System.out.println("-==================================");


        System.out.println(AccessModifiers.publicDate);//public is accessible within same package
        System.out.println(AccessModifiers.protectedData);//protected is accessible within same package

        System.out.println(AccessModifiers.defaultDate);//Default is accessible within same package
       // System.out.println(AccessModifiers.privateData);//private is not accessible within same package

     new AccessModifiers();


     AccessModifiers.publicMethod();
     AccessModifiers.protectedMethod();
     AccessModifiers.defaultMethod();
     //AccessModifiers.privateMethod();

    }
}
