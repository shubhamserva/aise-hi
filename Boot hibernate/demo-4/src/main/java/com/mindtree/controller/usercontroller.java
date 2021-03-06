package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.Userentity;
import com.mindtree.repository.Jpainterface;

@RestController
public class usercontroller 
{
	@Autowired
	Jpainterface jpa;
	@PostMapping("/setdata")
	public String setdata(@RequestBody Userentity input) 
	{
		jpa.save(input);
		return "data Inserted";
	}
	
	@GetMapping("/getdata")
	public List<Userentity> getdata()
	{
		 return jpa.findAll();
	}
	
	
	@PutMapping( value ="/putdata")
	public String putdata(@RequestBody Userentity input) 
	{
		jpa.save(input);
		return "data Inserted";
	}
	
	@DeleteMapping(value="/deletedata/{id}")
	public String deletedata(@PathVariable("id") int id) 
	{
		jpa.deleteById(id);
		return "data deleted";
	}


}
