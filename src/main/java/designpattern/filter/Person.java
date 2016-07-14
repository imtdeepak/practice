package designpattern.filter;

/**
 * Created by byjumanikkan on 2/2/16.
 */
public class Person {
    private String name;
    private Gender gender;
    private MaritalStatus maritalStatus;

    public Person(String name, Gender gender, MaritalStatus maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }
    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", maritalStatus=" + maritalStatus +
                '}';
    }
}
