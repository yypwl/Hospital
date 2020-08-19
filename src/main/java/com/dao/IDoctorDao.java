package com.dao;

import com.pojo.Doctor;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDoctorDao extends JpaRepository<Doctor,Integer> {

    Doctor findById(int id);

    void deleteById(int id);

    List<Doctor> findAllByDepartment(String department);
    @Query(value = "select * from Doctor where user_id = :user_id",nativeQuery = true)
    Doctor findDoctorByUser_id(@Param("user_id") int user_id);

}
