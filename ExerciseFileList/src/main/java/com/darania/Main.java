package com.darania;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonListDataAccessService personListDataAccessService =
                new PersonListDataAccessService();

        PersonFileDataAccessService personFileDataAccessService =
                new PersonFileDataAccessService();

        PersonService personService = new PersonService(personFileDataAccessService);
        personService.addPerson(new Person(1, "Fanchette", "Williamson", "fwilliamson0@github.com", "F"));
        personService.addPerson(new Person(2, "Aleksandr","Matts","amatts1@webs.com","M"));
        personService.addPerson(new Person(3, "Maurie","Cordero","mcordero2@google.co.jp","M"));
        personService.addPerson(new Person(4, "Donnajean","Crowson","dcrowson3@google.com.hk","F"));
        personService.addPerson(new Person(5, "Ricardo","Gofton","rgofton4@nytimes.com","M"));
        personService.addPerson(new Person(6, "Gabie","Tregenna","gtregenna5@guardian.co.uk","F"));
        personService.addPerson(new Person(7, "Marjorie","Blumsom","mblumsom6@joomla.org","F"));
        personService.addPerson(new Person(8, "Lester","Huyghe","lhuyghe7@jugem.jp","M"));
        personService.addPerson(new Person(9, "Merrily","Stangoe","mstangoe8@tiny.cc","F"));
        personService.addPerson(new Person(10, "Reider","Karel","rkarel9@github.io","M"));
        personService.addPerson(new Person(11, "Dory","Jolliff","djolliffa@wufoo.com","F"));
        personService.addPerson(new Person(12, "Homerus","Averay","haverayb@skyrock.com","M"));
        personService.addPerson(new Person(13, "Alyda","Muglestone","amuglestonec@is.gd","F"));
        personService.addPerson(new Person(14, "Pinchas","Louca","ploucad@google.es","M"));
        personService.addPerson(new Person(15, "Cherin","Eltringham","celtringhame@parallels.com","F"));
        personService.addPerson(new Person(16, "Mufi","Rothert","mrothertf@dropbox.com","F"));
        personService.addPerson(new Person(17, "Jordana","Everex","jeverexg@ucla.edu","F"));
        personService.addPerson(new Person(18, "Belle","Rother","brotherh@auda.org.au","F"));
        personService.addPerson(new Person(19, "Clevie","Sifflett","csiffletti@furl.net","M"));
        personService.addPerson(new Person(20, "Gretchen","Abell","gabellj@1688.com","F"));

        List<Person> allPersons = personService.getAllPersons();
        System.out.println(allPersons);


    }
}
