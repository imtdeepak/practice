package designpattern.filter;

import java.util.List;

/**
 * Created by byjumanikkan on 2/2/16.
 */
public class AndCriteria implements Criteria {
    Criteria[] criterias;
    public AndCriteria(Criteria ...criterias)
    {
        this.criterias = criterias;
    }

    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> filteredPersons = persons;

        if(criterias != null) {
            for (Criteria criteria : criterias) {
                filteredPersons = criteria.filter(filteredPersons);
            }
        }
        return filteredPersons;
    }
}
