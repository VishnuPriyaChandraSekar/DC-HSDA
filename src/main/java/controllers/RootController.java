package controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class RootController
{
	@Get("/")
	public String rootGet(){
		return "Hi there!";
	}
}
