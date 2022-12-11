package day27_accesModifier;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }


    //AFTER THE STATIC BLOCK METHOD IT WILL EXECUTE THE MAIN METHOD

    public static void main(String[] args) {
        System.out.println("Main method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static{ //STATIC BLOCK
        System.out.println("Static Block");
    }


}
