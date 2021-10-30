package com.darania;

public class PersonListDataAccessService {
    private List<Person> persons = new ArrayList<>();

    @Override
    public int savePerson(Person person) {
        persons.add(person);
        return 1;
    }

    @Override
    public List<Person> getPersons() {
        return persons;
    }

    @Override
    public int deletePerson(Person person) {
        persons.remove(person);
        return 1;
    }

}
