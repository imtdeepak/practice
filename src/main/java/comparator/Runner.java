package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by deepak on 11/15/18.
 */
public class Runner {
    public static void main(String[] args) {
        List<Student> setOfStudents = new ArrayList<>();

        Student student1 = new Student("Andy", "Graham");
        Student student2 = new Student("Krish", "Kr");
        Student student3 = new Student("Abhi", "Jose");
        Student student4 = new Student("Siba", "Loke");
        Student student5 = new Student("Shiva", "Alk");
        Student student6 = new Student("Karthk", "Ven");
        setOfStudents.add(student1);
        setOfStudents.add(student2);
        setOfStudents.add(student3);
        setOfStudents.add(student4);
        setOfStudents.add(student5);
        setOfStudents.add(student6);
        System.out.println("Before Sort");
        System.out.println(setOfStudents);

        Collections.sort(setOfStudents);
        System.out.println("After Sorting with Last Name");
        System.out.println(setOfStudents);

        Collections.sort(setOfStudents, new StudentFirstNameComparator());

        System.out.println("After Sort with First Name");
        System.out.println(setOfStudents);
        Comparator<Student> lambdaWayCompLName = (s1, s2) -> {
            return s1.fName().compareTo(s2.lName());
        };

        Collections.sort(setOfStudents, lambdaWayCompLName);
        System.out.println("After Sort with Last Name");
        System.out.println(setOfStudents);


    }
}
