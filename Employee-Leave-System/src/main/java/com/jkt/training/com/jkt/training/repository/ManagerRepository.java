package com.jkt.training.com.jkt.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jkt.training.com.jkt.training.model.Manager;


@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
	

}
