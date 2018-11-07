package com.szxs.service.impl;

import com.szxs.dao.UserDao;
import com.szxs.entity.User;
import com.szxs.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   @Resource
   private UserDao userDao;
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
