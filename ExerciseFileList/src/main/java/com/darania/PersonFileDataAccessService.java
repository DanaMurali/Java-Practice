package com.darania;

import java.util.ArrayList;
import java.util.List;

public class PersonFileDataAccessService implements PersonDAO {

    @Override
    public int savePerson(Person person) {
        try {
            File file = new File("src/persons.txt");

            if (!file.exists()) {


                System.out.println(file.createNewFile());


            } else {
                System.out.println("File already exists");
            }

            FileWriter fileWriter = new FileWriter(file, true);

            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(flight.getFlightNumber());

            printWriter.flush();
            printWriter.close();
            return 1;

        } catch (IOException e) {
            return 0;
        }

    }

    @Override
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        try {
            File file = new File("src/flights.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                persons.add(new Person(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            return persons;
        }
        return persons;

    }

    @Override
    public int deletePerson(Person person) {
        return 0;
    }
}
}
