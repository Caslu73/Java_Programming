package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //StudentsGroup HAS A Student = HAS A means relationship

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>(); // size : 0 //add multiply students <Student>so it can have name,age,gender,ID<Student> instead of String

    public StudentsGroup(String groupName, int groupId) {//This constructor creates the StudentsGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;

    }
        //<Student> object, In order to add every student name, age, gender, Id  into the ArrayList<Student>"students"
    public void addStudent (Student student){//it takes one student object, and adds it to the arrayList of students
        students.add(student);

    }
    public void addStudent (Student[] students){
        this.students.addAll(Arrays.asList(students));
        //takes one array of students, and adds the array of students to the arrayList of students
    }

    public void addStudent(String name, int age, char gender, String id){
        students.add(new Student(name, age, gender, id) );
        //takes name, age, gender and id of student info,creates student object by using the given info, then adds the
        // student object to the arrayList of students

    }


    public void removeStudent (String id){
        students.removeIf( p -> p.id.equals(id));
        //takes the id and then remove the student object with the specified id from arrayList of students

    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() + // size to know the total number of the students
                '}';
    }
}
/*
 Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

 */
