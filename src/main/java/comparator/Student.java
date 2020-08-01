package comparator;


/**
 * Created by deepak on 11/15/18.
 */
public record Student(String fName, String lName) implements Comparable<Student> {
    @Override
    public int compareTo(Student student) {
        return student.fName.compareTo(this.fName);
    }

}
