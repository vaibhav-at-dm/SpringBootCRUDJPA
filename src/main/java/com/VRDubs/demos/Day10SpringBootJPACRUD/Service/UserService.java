package com.VRDubs.demos.Day10SpringBootJPACRUD.Service;

import com.VRDubs.demos.Day10SpringBootJPACRUD.model.User;
import com.VRDubs.demos.Day10SpringBootJPACRUD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getObject(double id){
        User ref = userRepository.findById(id).get();
        return ref;
    }
}
