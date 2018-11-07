package com.szxs.dao;

import com.szxs.entity.User;

import java.util.List;

public interface UserDao {
      User getUser(Integer id);
      List<User> queryAll();
}
