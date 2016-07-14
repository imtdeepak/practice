package designpattern.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by byjumanikkan on 2/2/16.
 */
public class OrCriteria implements Criteria {
    Criteria[] criterias;
    public OrCriteria(Criteria ...criterias)
    {
        this.criterias = criterias;
    }

    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> filteredPersons = new ArrayList<>();
        if(criterias != null) {
            for (Person person : persons) {
                for (Criteria criteria : criterias) {
                    List<Person> result = criteria.filter(Arrays.asList(person));
                    if(!result.isEmpty()){
                        filteredPersons.add(result.get(0));
                        break;
                    }
                }
            }

        }
        return filteredPersons;
    }
}
