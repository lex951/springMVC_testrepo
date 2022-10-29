package ru.alex.dao;

import org.springframework.stereotype.Component;
import ru.alex.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    {
        people=new ArrayList<>();
        people.add(new Person("Sam"));
        people.add(new Person("Alex"));
        people.add(new Person("Amanda"));
        people.add(new Person("Any"));
    }
    public List<Person> index(){
       return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
    }
    public void save(Person person){
        people.add(person);
    }

    public void update(int id, Person updatedPerson){
        Person personToUpdate=show(id);
        personToUpdate.setName(updatedPerson.getName());
    }

    public void delete(int id){
        people.removeIf(person -> person.getId()==id);
    }
}
