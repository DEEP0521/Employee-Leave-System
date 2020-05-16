package com.jkt.training.com.jkt.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkt.training.com.jkt.training.model.Manager;
import com.jkt.training.com.jkt.training.repository.ManagerRepository;

@Service
public class ManagerService {
<<<<<<< HEAD
=======

	@Autowired
	private ManagerRepository manrepo;
	
	public void AddManager(Manager manager)
	{
		 manrepo.save(manager);
	}
	
	public List<Manager> getAllManager()
	{
		return manrepo.findAll();
	}
	
	public Optional<Manager> getManById(int manager_Id)
	{
		Optional<Manager> manager = manrepo.findById(manager_Id);
		return manager;
		
	}
	
	public void deleteMan(int manager_Id)
	{
	Manager manager=	manrepo.getOne(manager_Id);
	manrepo.delete(manager);
	}
	
	public void updateMan(Manager manager,int manager_Id)
	{
		manrepo.save(manager);
	}
	
	
>>>>>>> feature
}
