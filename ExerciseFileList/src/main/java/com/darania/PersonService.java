package com.darania;

public class PersonService {
    private PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public void addPerson(Person person) {

        String person1 = new Person();
        if (person == null || person.isEmpty()) {
            throw new IllegalStateException("Person cannot be null");
        }

        personDAO.savePerson(person);
    }

    public List<Person> getAllPersons() {
        return personDAO.getPersons();
    }

}
