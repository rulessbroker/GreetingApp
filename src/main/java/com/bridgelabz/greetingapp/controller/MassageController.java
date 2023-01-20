package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.*;	
import com.bridgelabz.greetingapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class MassageController {
	 @Autowired
	    MessageService service;
	    @GetMapping("/message")
	    public String getData(){
	        return "<h1><font color=blue style=bold>Welcome to my Message App!</font></h1>";
	    }
	    @GetMapping("/get")
	    public String message(@RequestParam(value = "nane", defaultValue = "Sneha") String name){
	        return "<h1><font color=red>Hii "+name+" ! Welcome to BridgeLabz!</font></h1>";
	    }
	    @PostMapping("/post")
	    public String post(@RequestBody Entity entity){
	        String response=service.getService(entity);
	        return "<h1><font style=bold> Your full name is "+response+"</font></h1>";
	    }
	    @PutMapping("/put/{firstName}")
	    public String put(@PathVariable String firstName,
	                      @RequestParam(value = "lastName") String lastName) {
	        return "Hello " + firstName + " " + lastName + "!";
	    }
}
