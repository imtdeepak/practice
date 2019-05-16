package comparator;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by deepak on 11/15/18.
 */
@Getter
@Setter
public class Student implements Comparable<Student> {
    String fName, lName;

    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "reflection.Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return lName.compareTo(o.lName);

    }

}
