package cn.massz.service;

import cn.massz.domain.User;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface UserService {
    /*
    查询所有用户
     */
    List<User> findAllUser();
}
