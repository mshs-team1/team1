package com.szxs.service;


import com.szxs.entity.TUsers;


import java.util.List;

public interface UserService{

    List<TUsers> queryAll(TUsers tUsers, Integer from , Integer end, Integer draw);
    Integer addTUsers(TUsers tUsers);
    Integer delTUsers(Integer id);
    Integer updateTUsers(Integer id);

}
