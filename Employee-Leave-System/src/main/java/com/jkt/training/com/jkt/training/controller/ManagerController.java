package com.jkt.training.com.jkt.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jkt.training.com.jkt.training.model.Manager;
import com.jkt.training.com.jkt.training.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService manservice;
	
	@PostMapping(path="/managers",consumes="application/json")
	public String addmanager(@RequestBody Manager manager)
	{
		manservice.AddManager(manager);
		return "Manager added";	
				}
	
	@GetMapping("/managers")
	public List<Manager> getAllManager()
	{
		return manservice.getAllManager();
	}
	
	@GetMapping("/managers/{manager_Id}")
	public Optional<Manager> getManagerById( @PathVariable int manager_Id)
	{
		return manservice.getManById(manager_Id);
	}
	
	@DeleteMapping("/managers/{manager_Id}")
	public String deleteManager(@PathVariable int manager_Id)
	{
		manservice.deleteMan(manager_Id);
		return "Manager Deleted";
	}
	
	@PutMapping("/managers/{manager_Id}")
	public String updateManager(@RequestBody Manager manager,@PathVariable int manager_Id)
	{
		manservice.updateMan(manager, manager_Id);
		return "Manager Updated";
	}
}
