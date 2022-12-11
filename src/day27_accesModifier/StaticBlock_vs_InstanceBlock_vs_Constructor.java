package day27_accesModifier;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

   //CONSTRUCTOR
   public StaticBlock_vs_InstanceBlock_vs_Constructor(){
       System.out.println("Constructor");
   }

   //INSTANCE BLOCK
   {
       System.out.println("Instance Block");
   }


   //STATIC BLOCK
        static{
            System.out.println("Static Block");
        }



    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();

    }
}
