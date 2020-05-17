package com.jkt.training.com.jkt.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkt.training.com.jkt.training.model.Employee;
import com.jkt.training.com.jkt.training.model.Manager;
import com.jkt.training.com.jkt.training.repository.ManagerRepository;




@Service
public class ManagerService {

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
	
	// mapping
		public List<Manager> getAllManager(int Id)
		{
			List<Manager> manager=new ArrayList<>();
			manrepo.findByEmpId(Id).forEach(manager::add);
			return manager;
		}
	
	public Optional<Manager> getManById(int manager_Id)
	{
		Optional<Manager> manager = manrepo.findById(manager_Id);
		return manager;
		
	}
	
	//mapping
			public Optional<Manager> getManagerByEid(int empId) {
				Optional<Manager> manager = manrepo.findById(empId);
				return manager;
			}
	
	public void deleteMan(int manager_Id)
	{
	Manager manager=	manrepo.getOne(manager_Id);
	manrepo.delete(manager);
	}
	
	//mapping
		public void deleteEmpl(int manager_Id)
		{
			Manager manager=manrepo.getOne(manager_Id);
			manrepo.delete(manager);
		}
	
	public void updateMan(Manager manager,int manager_Id)
	{
		manrepo.save(manager);
	}
	
	//mapping
	
		public void updateEmpl(Manager manager)
		{
			manrepo.save(manager);
		}

		
        
	
	
}
