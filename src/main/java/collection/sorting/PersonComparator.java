package collection.sorting;

import java.util.Comparator;

/**
 * Created by deepak.kumar on 2/17/16.
 */
public class PersonComparator implements Comparator<Person> {
    private final PersonSortType type;

    public PersonComparator(PersonSortType type)
    {
        this.type = type;
    }
    @Override
    public int compare(Person p1, Person p2) {
        System.out.println("Compare method of PersonComparator called");
        int compare = 0;
        switch(type){
            case AGE :
                compare =  p1.getAge().compareTo(p2.getAge());
                break;
            case FIRST_NAME :
                compare = p1.getLastName().compareTo(p2.getLastName());
                if(compare == 0 ){
                    compare = p1.getFirstName().compareTo(p2.getFirstName());
                }
                break;
            case LAST_NAME:
                compare = p1.getFirstName().compareTo(p2.getFirstName());
                if(compare == 0 ){
                    compare = p1.getLastName().compareTo(p2.getLastName());
                }
        }
        return compare;
    }
}
