package controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import models.Organization;
import service.OrganizationService;
import java.util.*;

@Controller("/organizations")
public class OrganizationController {

    @Get(uri = "/{organization_id}", produces = MediaType.APPLICATION_JSON)
    public Organization getOrganizationByID(String organization_id){
        return  new OrganizationService().findOrganizationById(organization_id);
    }





}
