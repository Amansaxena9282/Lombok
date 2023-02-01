package com.practice.Lombok.services;

import com.practice.Lombok.model.User;

import java.util.List;

public interface TestService {
    public List<User> getAll();
    public String delete(int id);

    public User getUser(User user);

    public User update(User user);

}
