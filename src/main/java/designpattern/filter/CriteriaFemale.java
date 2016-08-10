package designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender() == Gender.FEMALE){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
