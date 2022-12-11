package day27_accesModifier;

public class AccessModifiers {

    public static int publicDate= 200;//PUBLIC ACCESS MODIFIER


    //Protected Access
    protected static int protectedData= 300;//PROTECTED ACCESS MODIFIER

    static int defaultDate = 400; //DEFAULT ACCESS MODIFIER


    private static int privateData = 500;//PRIVATE ACCESS MODIFIER


    public AccessModifiers(){

    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }


    public static void main(String[] args) {
        System.out.println(publicDate);//public is accessible within same Car
        System.out.println(protectedData);//protected is accessible within same class
        System.out.println(defaultDate);//default is accessible within the same class
        System.out.println(privateData);//private is accessible within the same class

            new AccessModifiers();


            publicMethod();
            privateMethod();
            defaultMethod();
            protectedMethod();



    }



}
