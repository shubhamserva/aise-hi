package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.Userentity;
import com.mindtree.repository.Jpainterface;

@RestController
@CrossOrigin
public class Control {

	@Autowired
	Jpainterface jpa;
	
	@RequestMapping(path="/hello",method=RequestMethod.GET)
	public  List<Userentity> getData()
	{
		return jpa.findAll();
		
	}
	@PostMapping(path="/setdata")
	public String setdata(@RequestBody Userentity user) 
	{
		jpa.save(user);
		return "data added";
	}
	@PutMapping(path="/editdata/{mid}")
	public String editdata(@PathVariable int mid,@RequestBody Userentity user)
	{
		Userentity u=jpa.findByMid(mid);
		u.setName(user.getName());
		u.setLead(user.getLead());
		u.setTrack(user.getTrack());
		jpa.save(u);
		return "edited data";
	}
	@DeleteMapping(path="/delete/{mid}")
	public String deletedata(@PathVariable("mid") int mid) 
	{
		jpa.deleteById(mid);
		return "data deleted";
	}
}
