package designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by byjumanikkan on 2/2/16.
 */
public class Demo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert",Gender.MALE, MaritalStatus.SINGLE));
        persons.add(new Person("John", Gender.MALE, MaritalStatus.MARRIED));
        persons.add(new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED));
        persons.add(new Person("Diana", Gender.FEMALE, MaritalStatus.SINGLE));
        persons.add(new Person("Mike", Gender.MALE, MaritalStatus.SINGLE));
        persons.add(new Person("Bobby", Gender.MALE, MaritalStatus.SINGLE));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.filter(persons));

        System.out.println("\nFemales: ");
        printPersons(female.filter(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.filter(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.filter(persons));
    }

    public static void printPersons(List<Person> persons){
        persons.stream().forEach(System.out::println);
    }

}
