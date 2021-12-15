package com.VRDubs.demos.Day10SpringBootJPACRUD.Controller;


import com.VRDubs.demos.Day10SpringBootJPACRUD.Service.UserService;
import com.VRDubs.demos.Day10SpringBootJPACRUD.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public String getRow(@PathVariable("id") double id){
        User user = userService.getObject(id);
        if (user != null){
            return user.getName() + "          "+ user.getSalary();
        }
        else {
            return "Not Found";
        }
    }
}
