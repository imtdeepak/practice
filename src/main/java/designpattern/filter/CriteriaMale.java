package designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender() == Gender.MALE){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
