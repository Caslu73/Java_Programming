package day27_accesModifier;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1 = new CydeoStudent("Lucas",30,'M');
        CydeoStudent student2 = new CydeoStudent("Elena", 29, 'F');
        System.out.println("===================================");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("===================================");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println("===================================");

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);

    }
}
