package com.jkt.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jkt.training.model.LeaveTrack;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveTrack, Integer> {

}
