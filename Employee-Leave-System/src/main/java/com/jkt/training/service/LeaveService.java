package com.jkt.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkt.training.exception.NotFoundfException;
import com.jkt.training.model.LeaveTrack;
import com.jkt.training.repository.LeaveRepository;

@Service
<<<<<<< HEAD:Employee-Leave-System/src/main/java/com/jkt/training/service/LeaveService.java
public class LeaveService 
{
=======
public class LeaveService {
	
>>>>>>> b65eadecf86edb634a277f6d120101b040ae8fc4:Employee-Leave-System/src/main/java/com/jkt/training/com/jkt/training/service/LeaveService.java
	@Autowired
	private LeaveRepository repository;

	public List<LeaveTrack> getLeaves(){
		if(repository.findAll().isEmpty())
			throw new NotFoundfException("Leave Record Not Found!");
		else
			return  repository.findAll();
	}
	
	//mapping with employee
	public List<LeaveTrack> getLeavesByEmployeeId(int lid){
		List<LeaveTrack> leaves=new ArrayList<LeaveTrack>();
		if(leaves.size()==0)
		{
			repository.findByEmployeeId(lid).forEach(leaves::add);
			return leaves;
		}
		else
			throw new NotFoundfException("Leave Record Not Found!");
	}
	
	public Optional<LeaveTrack> getLeavesById(int lid){
		Optional<LeaveTrack> leave=repository.findById(lid);
		if(!leave.isPresent())
			throw new NotFoundfException("Leave Record Not Found!");
		else
			return  repository.findById(lid);
	}
	
	public List<LeaveTrack> getEmployees(int empId)
	{
		List<LeaveTrack> leave=new ArrayList<LeaveTrack>();
		if(leave.size()==0)
		{
			repository.findByEmployeeEmpId(empId).forEach(leave::add);
			return leave;
		}
		else
			throw new NotFoundfException("Id not found for deletion!");
	}
	public boolean addLeave(LeaveTrack leave) {
		int check=leave.getLid();
		if(repository.existsById(check)==false)
		{
			String lid=String.valueOf(leave.getLid());
			if(leave.getLid()!=-1&&leave.getRemaining()!=-1&&leave.getUsed()!=-1
					&&!leave.getType().equals(null)&&!lid.equals(null))
			{
				repository.save(leave);
				return true;
			}
			else 
				return false;
		}
		return false;
	}
	
	public void deleteLeave(int lid) {
		LeaveTrack leave=repository.getOne(lid);
		if(repository.existsById(lid))
			repository.delete(leave);
		else
			throw new NotFoundfException("Id not found for deletion!");
	}
	
	public void updateLeave(LeaveTrack leave,int lid) {
		if(repository.existsById(lid))
		{
			String lid1=String.valueOf(leave.getLid());
			if(leave.getLid()!=-1&&leave.getRemaining()!=-1&&leave.getUsed()!=-1
					&&!leave.getType().equals(null)&&!lid1.equals(null))
				repository.save(leave);
			else
				throw new NotFoundfException("Id not found for deletion!");
		}
		else
			throw new NotFoundfException("Id not found for deletion!");
	}
	
	public void updateEmployeeLeave(LeaveTrack leave,int id,int lid) {
		if(repository.existsById(lid))
		{
			String lid1=String.valueOf(leave.getLid());
			if(leave.getLid()!=-1&&leave.getRemaining()!=-1&&leave.getUsed()!=-1
					&&!leave.getType().equals(null)&&!lid1.equals(null))
				repository.save(leave);
			else
				throw new NotFoundfException("Id not found for deletion!");
		}
		else
			throw new NotFoundfException("Id not found for deletion!");
	}
}
