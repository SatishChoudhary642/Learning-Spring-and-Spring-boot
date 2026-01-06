package com.satish.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VersioningPersonController {

    //URI Versioning

    //http://localhost:8081/v1/person
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Batman");
    }

    //http://localhost:8081/v2/person
    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Bruce", "Wayne"));
    }


    //URI Parameter versioning

    //http://localhost:8081/person?version=1
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Batman");
    }

    //http://localhost:8081/person?version=2
    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameter(){
        return new PersonV2(new Name("Bruce", "Wayne"));
    }


    // (Custom) headers versioning

    //http://localhost:8081/person    headers = [X-API-VERSION=1]
    @GetMapping(path = "/person", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader(){
        return new PersonV1("Batman");
    }

    //http://localhost:8081/person    headers = [X-API-VERSION=2]
    @GetMapping(path = "/person", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader(){
        return new PersonV2(new Name("Bruce", "Wayne"));
    }


    // Media type versioning

    //http://localhost:8081/person    accept = [application/vnd.company.app-v1+json]
    @GetMapping(path = "/person", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader(){
        return new PersonV1("Batman");
    }

    //http://localhost:8081/person    accept = [application/vnd.company.app-v2+json]
    @GetMapping(path = "/person", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader(){
        return new PersonV2(new Name("Bruce", "Wayne"));
    }
}
