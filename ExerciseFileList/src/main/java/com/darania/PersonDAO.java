package com.darania;

public interface PersonDAO {

    Integer savePerson (Person person);

    List<Person> getPersons();

    int deletePerson(Person person);

}
