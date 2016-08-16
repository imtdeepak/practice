package designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getMaritalStatus() == MaritalStatus.SINGLE){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
