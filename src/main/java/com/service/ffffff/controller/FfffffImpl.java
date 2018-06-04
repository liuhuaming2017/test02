package com.service.ffffff.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-04T07:52:03.389Z")

@RestSchema(schemaId = "ffffff")
@RequestMapping(path = "/ffffff", produces = MediaType.APPLICATION_JSON)
public class FfffffImpl {

    @Autowired
    private FfffffDelegate userFfffffDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userFfffffDelegate.helloworld(name);
    }

}
