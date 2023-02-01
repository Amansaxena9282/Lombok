package com.practice.Lombok.controller;

import com.practice.Lombok.model.User;
import com.practice.Lombok.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/neeraj")
    public List<User> get(){
        return testService.getAll();
    }

    @GetMapping("/aman")
    public String getaman(){
        User user= new User();
        user.setName("Aman");
        user.setAge(20);
        return user.toString();
    }
    //PathParam
    @GetMapping("/ex/{id}/data")
    public String getData(@PathVariable(value = "id") int id){
        return String.valueOf(id);
    }
    //Path Param- For Searching particular Data
    @GetMapping("/ex1/{account_no}/data")
    public String getData1(@PathVariable int account_no){
        return String.valueOf(account_no);
    }

    @GetMapping("/ex2/{age}/data")
    public User getUserdetails(@PathVariable int age, @RequestParam String name,@RequestParam int
            id){
        User user=new User(name,age,id);
        return user;
    }
    //Post
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return testService.getUser(user);

    }

    //Put
    @PutMapping("/update")
    public User update(@RequestBody User user){
        return testService.update(user);

    }
    @DeleteMapping("/Delete/{id}")
    public String deleteData(@PathVariable int id){
        return testService.delete(id);
    }

}