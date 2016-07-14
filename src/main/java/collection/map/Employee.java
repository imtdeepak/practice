package collection.map;

/**
 * Created by byjumanikkan on 2/18/16.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String departmentName;
    private Integer age;
    private Double salary;

    public Employee(String firstName, String lastName, String departmentName, Integer age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

