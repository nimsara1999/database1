package com.example.NimsaraTest.service;

import com.example.NimsaraTest.dto.UserDTO;
import com.example.NimsaraTest.entity.user;
import com.example.NimsaraTest.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, user.class));
        return userDTO;
    }

}
