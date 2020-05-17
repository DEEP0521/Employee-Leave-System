package com.jkt.training.com.jkt.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jkt.training.com.jkt.training.model.Manager;



public interface ManagerRepository extends JpaRepository<Manager, Integer> {
	List<Manager> findByEmpId(int EmpId);

}
