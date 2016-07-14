package designpattern.filter;
import java.util.List;

public interface Criteria {
    public List<Person> filter(List<Person> persons);
}