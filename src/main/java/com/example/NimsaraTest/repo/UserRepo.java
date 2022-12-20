package com.example.NimsaraTest.repo;

import com.example.NimsaraTest.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user,Integer> {

}
