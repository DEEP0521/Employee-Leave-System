package com.jkt.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jkt.training.model.LeaveTrack;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveTrack, Integer> {
	public List<LeaveTrack> findByEmployeeId(int emp_id);
}
