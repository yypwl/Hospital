package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUserDao extends JpaRepository<User,Integer> {
    @Query(value = "select * from User where username = :username and password = :password",nativeQuery = true)
    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query(value="select u.*,r.rname,r.rdesc from User u inner join Role r on u.role_id = r.rid",nativeQuery = true)
    List<User> findAllUsers();
}
