package com.sweetdreams.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sweetdreams.models.User;

@Repository
public interface IUserRespository extends JpaRepository<User, Long>{

}
