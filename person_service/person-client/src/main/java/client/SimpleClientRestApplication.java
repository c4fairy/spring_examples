package client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ru.dina.Person;
import util.PersonUtil;

public class SimpleClientRestApplication {
    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Person[]> response = restTemplate
                .getForEntity("http://localhost:8080//persons/", Person[].class);
        Person[] person = response.getBody();
        assert person != null;
        String[] surnames = PersonUtil.getPersonSurname(person);
        for (String surname : surnames) System.out.println("Person Surname:" + surname);
    }
}
