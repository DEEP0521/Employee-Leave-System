package com.jkt.training.repository;

import java.util.List;

<<<<<<< HEAD:Employee-Leave-System/src/main/java/com/jkt/training/repository/LeaveRepository.java
=======
//import java.util.List;

>>>>>>> b65eadecf86edb634a277f6d120101b040ae8fc4:Employee-Leave-System/src/main/java/com/jkt/training/com/jkt/training/repository/LeaveRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jkt.training.model.LeaveTrack;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveTrack, Integer> {
<<<<<<< HEAD:Employee-Leave-System/src/main/java/com/jkt/training/repository/LeaveRepository.java
	public List<LeaveTrack> findByEmployeeId(int emp_id);
=======

	public List<LeaveTrack> findByEmployeeEmpId(int EmpId);
>>>>>>> b65eadecf86edb634a277f6d120101b040ae8fc4:Employee-Leave-System/src/main/java/com/jkt/training/com/jkt/training/repository/LeaveRepository.java
}
