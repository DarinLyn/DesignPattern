package structuralpattern.filtercriteriapattern;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(data -> data.getMaritalStatus().equalsIgnoreCase("SINGLE")).collect(Collectors.toList());
    }
}
