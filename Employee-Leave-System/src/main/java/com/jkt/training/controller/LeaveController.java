package com.jkt.training.controller;

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

import com.jkt.training.model.Employee;
import com.jkt.training.model.LeaveTrack;
import com.jkt.training.service.LeaveService;

@RestController
public class LeaveController {

	@Autowired
	private LeaveService service;
	
	@GetMapping("/leaves")
	public List<LeaveTrack> showLeaves(){
		return service.getLeaves();
	}
	
	@GetMapping("/leaves/{lid}")
	public Optional<LeaveTrack> showLeavesById(@PathVariable int lid){
		return service.getLeavesById(lid);
	}
	
	@GetMapping("/employees/{id}/leaves")
	public List<LeaveTrack> showLeavesByEmployee(@PathVariable int id){
		return service.getLeavesByEmployeeId(id);
	}
	
	@GetMapping("/employees/{id}/leaves/{lid}")
	public Optional<LeaveTrack> showEmployeeLeavesById(@PathVariable int lid){
		return service.getLeavesById(lid);
	}
	
	@PostMapping(path= "/leaves",consumes = "application/json")
	public String AddLeave(@RequestBody LeaveTrack leave) {
		boolean b=service.addLeave(leave);
		if(b==true)
			return "Leave Request Successful";
		else
			return "Leave Request Unsucessful";
	}
	
	@PostMapping(path= "/employees/{id}/leaves",consumes = "application/json")
	public String AddEmployeeLeave(@PathVariable int id,@RequestBody LeaveTrack leave) {
		leave.setEmployee(new Employee(id, "", "", ""));
		boolean b=service.addLeave(leave);
		if(b==true)
			return "Leave Request Successful";
		else
			return "Leave Request Unsucessful";
	}
	
	@PutMapping(path = "/leaves/{lid}",consumes = "application/json")
	public String UpdateLeave(@RequestBody LeaveTrack leave,@PathVariable int lid) {
		service.updateLeave(leave, lid);
		return "Leave updated";
	}
	
	@PutMapping(path = "/employees/{id}/leaves/{lid}",consumes = "application/json")
	public String UpdateEmployeeLeave(@RequestBody LeaveTrack leave,@PathVariable int id,@PathVariable int lid) {
		leave.setEmployee(new Employee(id, "", "", ""));
		service.updateEmployeeLeave(leave, id, lid);
		return "Leave updated";
	}
	
	@DeleteMapping(path = "/leaves/{lid}")
	public String DeleteLeave(@PathVariable int lid) {
		service.deleteLeave(lid);
		return "Leave Deleted";
	}
	
	@DeleteMapping(path = "/employees/{id}/leaves/{lid}")
	public String DeleteEmployeeLeave(@PathVariable int lid) {
		service.deleteLeave(lid);
		return "Leave Deleted";
	}
}