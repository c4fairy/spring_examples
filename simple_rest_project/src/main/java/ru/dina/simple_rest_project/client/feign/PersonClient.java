package ru.dina.simple_rest_project.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.dina.simple_rest_project.server.Person;

import java.util.List;

@FeignClient(name = "person-service", url = "localhost:8081")
public interface PersonClient {
    @RequestMapping(method = RequestMethod.GET, value = "/persons")
    List<Person> getPersons();
/*
    @RequestMapping(method = RequestMethod.GET, value = "/persons")
    Page<Person> getStores(Pageable pageable);*/

    @RequestMapping(method = RequestMethod.POST, value = "/persons/{personId}", consumes = "application/json")
    Person update(@PathVariable("personId") Long personsId, Person person);

    @RequestMapping(method = RequestMethod.DELETE, value = "/persons/{personId}")
    void delete(@PathVariable Long personId);

}
