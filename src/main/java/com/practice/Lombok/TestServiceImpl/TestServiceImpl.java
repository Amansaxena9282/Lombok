package com.practice.Lombok.TestServiceImpl;

import com.practice.Lombok.model.User;
import com.practice.Lombok.services.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TestServiceImpl implements TestService {

    @Override
    public List<User> getAll() {
        List<User> allUser=new ArrayList<>();
        User user1=new User("divya",22,1);
        User user2=new User("aman",22,2);
        User user3=new User("Neeraj",32,3);
//        User user4=new com.practice.Lombok.model.User()

        allUser.add(user1);
        allUser.add(user2);
        allUser.add(user3);
        return allUser;
//        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
