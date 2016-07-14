package collection.sorting;

import java.util.*;

/**
 * Created by byjumanikkan on 2/17/16.
 */
public class Person implements Comparable<Person>{
    private String lastName;
    private String firstName;
    private Integer age ;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals method called");
        Person that = (Person)o;
        boolean equality = this.lastName.equals(that.lastName) && this.firstName.equals(that.firstName);
        System.out.println("equal = " + equality);
        return equality;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode method called");
        int hashCode = lastName.hashCode() + 17* firstName.hashCode();
        System.out.println("hashCode = " + hashCode);
        return hashCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        System.out.println("Compare got called");
        int compare = this.lastName.compareTo(person.lastName);
        if(compare == 0 ){
            compare = this.firstName.compareTo(person.firstName);
        }
        return compare;
    }

    public static void main(String[] args) {
        Set<Person> setA = new HashSet<>();
        Set<Person> setB = new HashSet<>();
        setA.removeAll(setB);
        setA.addAll(setB);
        setA.retainAll(setB);

        List<Person> persons = new ArrayList<>();
        Person chaitanya = new Person("Srinivas", "Chaitanya",40);
        setA.add(chaitanya);

        persons.add(chaitanya);

        persons.add(new Person("Suddala", "Chaitanya", 25));
        persons.add(new Person("Suddala", "Swetha",28));
        System.out.println("set size " + persons.size());
        for (Person person : persons) {
            System.out.println(person);
        }
        Collections.sort(persons, new PersonComparator(PersonSortType.LAST_NAME));
        System.out.println("sorted perons " );

        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
