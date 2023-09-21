package com.raghav.yogaapp.repository;

import com.raghav.yogaapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
